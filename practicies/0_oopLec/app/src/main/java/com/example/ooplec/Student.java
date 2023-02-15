package com.example.ooplec;

public class Student extends Person{
    private String  feild,phone;

public Student(String phone){
    this.phone=phone;
}
public  Student(String name,int age){
    super.setName(name);
    super.setAge(age);
    }

    public Student(){

    }

    public String getFeild() {
        return feild;
    }

    public void setFeild(String feild) {
        this.feild = feild;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
