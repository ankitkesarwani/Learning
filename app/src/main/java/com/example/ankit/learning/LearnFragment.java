package com.example.ankit.learning;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class LearnFragment extends Fragment {

    private RecyclerView mCourseList;

    private DatabaseReference mCourseDatabase;
    private FirebaseAuth mAuth;

    private View mMainView;

    public LearnFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mMainView = inflater.inflate(R.layout.fragment_learn, container, false);

        mCourseList = mMainView.findViewById(R.id.course_list);
        mAuth = FirebaseAuth.getInstance();

        mCourseDatabase = FirebaseDatabase.getInstance().getReference().child("Courses");
        mCourseDatabase.keepSynced(true);

        mCourseList.setHasFixedSize(true);
        mCourseList.setLayoutManager(new LinearLayoutManager(getContext()));

        // Inflate the layout for this fragment
        return mMainView;
    }

    @Override
    public void onStart() {
        super.onStart();

        FirebaseRecyclerAdapter<Courses, CoursesViewHolder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Courses, CoursesViewHolder>(

                Courses.class,
                R.layout.single_course_layout,
                CoursesViewHolder.class,
                mCourseDatabase

        ) {
            @Override
            protected void populateViewHolder(CoursesViewHolder coursesViewHolder, Courses courses, int position) {

                coursesViewHolder.setName(courses.getName());
                coursesViewHolder.setUserImage(courses.getImage(), getContext());

                coursesViewHolder.mView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        CharSequence options[] = new CharSequence[]{"Open Course", "Overview"};

                        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                        builder.setTitle("Select Options");
                        builder.setItems(options, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {

                                if(i == 0) {

                                    Intent courseIntent = new Intent(getContext(), Course.class);
                                    startActivity(courseIntent);

                                }

                                if(i == 1) {

                                    Intent profileIntent = new Intent(getContext(), Course.class);
                                    startActivity(profileIntent);

                                }

                            }
                        });

                        builder.show();

                    }
                });

            }

            @Override
            protected void onCancelled(DatabaseError error) {

            }
        };

        mCourseList.setAdapter(firebaseRecyclerAdapter);

    }

    public static class CoursesViewHolder extends RecyclerView.ViewHolder {

        View mView;

        public CoursesViewHolder(View itemView) {
            super(itemView);

            mView = itemView;

        }

        public void setName(String name) {

            TextView userNameView = mView.findViewById(R.id.single_course_name);
            userNameView.setText(name);

        }

        public void setUserImage(String image, Context context) {

            CircleImageView userImageView = mView.findViewById(R.id.single_course_image);
            Picasso.with(context).load(image).placeholder(R.drawable.person).into(userImageView);

        }

    }

}
