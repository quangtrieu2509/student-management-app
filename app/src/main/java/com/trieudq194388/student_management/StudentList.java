package com.trieudq194388.student_management;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static List<Student> sList = new ArrayList<>();

    public static void init(){
        for(int i=0; i<30; i++){
            Student student = new Student();
            student.setName("Nguyễn Văn A");
            student.setStudentId("20192222");
            student.setEmail("abc@sis.hust.edu.vn");
            student.setBirthday("25-09-2001");

            sList.add(student);
        }

    }
}