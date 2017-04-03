package models;

import models.enums.Gender;

import java.io.Serializable;

/**
 * Created by hughie on 2017/4/3.
 * For person
 */
public class Person implements Serializable{
    private static final long serialVersionUID = 7592930394427200495L;



    private String name;
    private Gender gender;
    private int age;
    private boolean alive;
}
