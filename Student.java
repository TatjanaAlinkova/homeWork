package com.java015;

/**
 * Created by VENTO on 26.09.2016.
 */
public class Student extends Person{
    boolean isReady;
    boolean isLearning;
    public Student(String name) {
        super(name);
        this.isReady = false;
        this.isLearning = false;
        this.type=0;
        System.out.println("Created " + this.name);
    }
    @Override
    public void toLearn (){
        this.isLearning = true;
        System.out.println(this.name + " start learning");
    }

    @Override
    public void toRest (){
        this.isLearning = false;
        this.standUp();
        System.out.println(this.name + " stop learning and stood up");
    }

    public void beReady(){
        this.toSit();
        this.isReady=true;
        System.out.println(this.name + " sat down and ready to learn");
    }
}
