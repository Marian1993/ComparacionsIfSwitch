package com.Marian.Exercicis.Classes.Persones;

public class Persona {

    private String name;
    private int age;
    private String DNI;
    private String gender;
    private int phone;

    public Persona(String name, int age, String DNI, String gender,int phone){

        this.name=name;
        this.age=age;
        this.DNI=DNI;
        this.gender=gender;
        this.phone=phone;
    }
    public Persona(){}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDNI() {
        return DNI;
    }

    public String getGender() {
        return gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", DNI='" + DNI + '\'' +
                ", gender='" + gender + '\'' +
                ", phone=" + phone +
                '}';
    }
}
