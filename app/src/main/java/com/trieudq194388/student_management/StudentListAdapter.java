package com.trieudq194388.student_management;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Student> sList;

    public StudentListAdapter(List<Student> sList) {
        this.sList = sList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        @SuppressLint("InflateParams")
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_item, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        Student student = sList.get(position);
        myViewHolder.name.setText(student.getName());
        myViewHolder.studentId.setText(student.getStudentId());

        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), student.getEmail()+ " and "+student.getBirthday(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        if(sList != null) return sList.size();
        return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView name, studentId;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            studentId = itemView.findViewById(R.id.studentId);
        }
    }
}
