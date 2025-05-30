package com.tcf.oopsinjava.encapsulation;

public class Person {
    
    // Fields (attributes)
    private int id;
    private String name;
    private int age;
    private String gender;
    private String city;

    // Getter and Setter methods

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    // Method to display person details
    public String toString() {
        return "Person Details:\n" +
               "ID     : " + id + "\n" +
               "Name   : " + name + "\n" +
               "Age    : " + age + "\n" +
               "Gender : " + gender + "\n" +
               "City   : " + city;
    }
}
