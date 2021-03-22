package com.Marian.Exercicis.Refactoritzar.ExtractAndInline;

import java.util.Date;

public class Person {
    private String name;
    private Date birth;
    private int gender;
    public static final int MALE = 0;
    public static final int FEMALE = 1;

    public Person(String name, Date birth, int gender) {
        this.name = name;
        this.birth = birth;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getSex () {
        return gender;
    }

    public String toString() {
        return "Person [name=" + name + ", gender=" + gender + "]";
    }
}
