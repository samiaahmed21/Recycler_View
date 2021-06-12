package com.samia.recyclerview_191067;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import com.samia.recyclerview_191067.Model.Student;
import com.samia.recyclerview_191067.adapter.recyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
List<Student> StudentList = new ArrayList<>();
RecyclerView recyclerView;
recyclerViewAdapter recyclerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StudentList.add(new Student(R.drawable.wa1,"Michal kors", "Rs 2999", R.drawable.ic_baseline_delete_24,"1 year Warranty"));
        StudentList.add(new Student(R.drawable.wa2,"True Worth", "Rs 3999",R.drawable.ic_baseline_delete_24,"1.5 year Warranty"));
        StudentList.add(new Student(R.drawable.wa3,"Avelex", "Rs 1999", R.drawable.ic_baseline_delete_24,"1 year Warranty"));
        StudentList.add(new Student(R.drawable.wa4,"Rolex", "Rs 4999",R.drawable.ic_baseline_delete_24,"3 year Warranty"));
        StudentList.add(new Student(R.drawable.wa5,"Michal Kors (F)", "Rs 2999",R.drawable.ic_baseline_delete_24,"1 year Warranty"));
        StudentList.add(new Student(R.drawable.wa6,"Longines", "Rs 3999",R.drawable.ic_baseline_delete_24,"1 year Warranty"));
        StudentList.add(new Student(R.drawable.wa7,"Longines", "Rs 999",R.drawable.ic_baseline_delete_24,"1 year Warranty"));
        StudentList.add(new Student(R.drawable.wa8,"Rado", "Rs 5999",R.drawable.ic_baseline_delete_24,"2 year Warranty"));
        StudentList.add(new Student(R.drawable.wa9,"Phillips", "Rs 6999",R.drawable.ic_baseline_delete_24,"2.5 year Warranty"));
        StudentList.add(new Student(R.drawable.wa10,"Rolex Black", "Rs 9999",R.drawable.ic_baseline_delete_24,"3 year Warranty"));



        recyclerViewAdapter = new recyclerViewAdapter(MainActivity.this,StudentList);
        recyclerView = findViewById(R.id.rv_191067);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerViewAdapter);
    }


}
