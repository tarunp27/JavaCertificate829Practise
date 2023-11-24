package Serializtion;

import java.io.Serializable;

public class Gorilla implements Serializable {
    private static final Long serialVersionUID = 0L;
    private String name ;
    private int age;
    private Boolean friendly;
    private transient String favouriteFood;
//    public int valueOfCage = 10000;

    public Gorilla(String name, int age, Boolean friendly) {
        this.name = name;
        this.age = age;
        this.friendly = friendly;
        //this.favouriteFood = favouriteFood;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Boolean getFriendly() {
        return friendly;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFriendly(Boolean friendly) {
        this.friendly = friendly;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    @Override
    public String toString() {
        return "Gorilla{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friendly=" + friendly +
                '}';
    }
}
