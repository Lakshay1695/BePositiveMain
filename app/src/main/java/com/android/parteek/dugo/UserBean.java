package com.android.parteek.dugo;

import android.util.Log;

import java.io.Serializable;


public class UserBean implements Serializable {
    int id;
    String name,phone,gender,city,password,date,time,age, blooddgroup;

    public UserBean() {

    }

    public UserBean(int id, String name, String phone, String gender, String city, String password, String date, String time, String age, String blooddgroup) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.gender = gender;
        this.city = city;
        this.password = password;
        this.date = date;
        this.time = time;
        this.age = age;
        this.blooddgroup = blooddgroup;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBlooddgroup() {
        return blooddgroup;
    }


    public void setBlooddgroup(String blooddgroup) {
        this.blooddgroup = blooddgroup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", password='" + password + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", age='" + age + '\'' +
                ", blooddgroup='" + blooddgroup + '\'' +
                '}';
    }
}
