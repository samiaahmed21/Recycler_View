package com.samia.recyclerview_191067.adapter;

import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.samia.recyclerview_191067.Model.Student;
import com.samia.recyclerview_191067.R;

import java.util.List;

public class recyclerViewAdapter  extends RecyclerView.Adapter<recyclerViewAdapter.ViewHolder> {
  private Context context;
   private List<Student> StudentList;
    public recyclerViewAdapter() {

    }

    public recyclerViewAdapter(Context context, List<Student> studentList) {
        this.context = context;
        StudentList = studentList;
    }

    @NonNull
    @Override
    public recyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapt,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerViewAdapter.ViewHolder holder, int position) {
   Student student = StudentList.get(position);
   holder.Tv_name.setText(student.getName());
   holder.TV_RollNo.setText(student.getRollNo());
   holder.Dp.setImageResource(student.getDisplay());
   holder.Tv_warrant.setText(student.getWarranty());
   holder.IV_del.setOnClickListener(new View.OnClickListener(){

       @Override
       public void onClick(View v) {
           StudentList.remove(position);
           notifyDataSetChanged();
       }
   });




    }

    @Override
    public int getItemCount() {
        return StudentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
       TextView Tv_name, TV_RollNo,Tv_warrant;
       ImageButton IV_del;
       ImageView Dp;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Tv_name = itemView.findViewById(R.id.TV_Name);
            TV_RollNo= itemView.findViewById(R.id.TV_price);
            IV_del=itemView.findViewById(R.id.IV_Delete);
            Dp= itemView.findViewById(R.id.Display);
            Tv_warrant=itemView.findViewById(R.id.Tv_warranty);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
