package models;

import models.enums.Gender;

import java.io.Serializable;

/**
 * Created by hughie on 2017/4/3.
 * For person
 */
public class Person implements Serializable{
    private static final long serialVersionUID = 7592930394427200495L;

    public Person() {
    }

    public Person(String name, Gender gender, int age, boolean alive) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.alive = alive;
    }

    @Override
    public String toString() {
        return "name=[" + name + "] gender=[" + gender + "] age=[" + age + "] alive=[" + alive + "]";
    }

    private String name;
    private Gender gender;
    private int age;
    private boolean alive;
    private Gender aaa;
}
