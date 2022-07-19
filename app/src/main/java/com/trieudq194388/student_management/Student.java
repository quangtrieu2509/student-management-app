package com.trieudq194388.student_management;

public class Student {
    private String studentId;
    private String name;
    private String email;
    private String birthday;

    public Student(String studentId, String name, String email, String birthday) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
    }

    public Student() {
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
