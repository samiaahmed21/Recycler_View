package com.samia.recyclerview_191067.Model;

import android.graphics.drawable.Icon;

public class Student {
    String Name,RollNo,Warranty;
    int Delete;
    int Display;
    
    public Student() {

    }

    public Student( int display, String name, String rollNo, int delete, String warranty) {
        Name = name;
        RollNo = rollNo;
        Delete = delete;
        Display = display;
        Warranty = warranty;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setRollNo(String rollNo) {
        RollNo = rollNo;
    }

    public void setDelete(int delete) { Delete = delete; }

    public void setDisplay(int display) {Display = display; }

    public void setWarranty(String warranty) { Warranty = warranty; }

    public String getName() {
        return Name;
    }

    public String getRollNo() {
        return RollNo;
    }

    public int getDelete() { return Delete; }

    public int getDisplay() {return Display; }

    public String getWarranty() { return Warranty; }
};
