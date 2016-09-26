package com.java015;

/**
 * Created by VENTO on 26.09.2016.
 */
public class Person {
    boolean isSitting;
    int numPlace;
    String name;
    int type;

    public Person (String name){
        this.isSitting = false;
        this.numPlace=-1;
        this.name = name;
    }

    public void getIn (Person person, ClassRoom classRoom){
        person.numPlace =classRoom.classRoomFreePlace(person.type);
        classRoom.classRoomCapacity[person.type][person.numPlace] = person;
        System.out.println(person.name + " came into the classroom ");
    }

    public void getOut (Person person, ClassRoom classRoom){
        classRoom.classRoomCapacity[person.type][person.numPlace] = null;
        person.numPlace = -1;
        System.out.println(person.name + " left the classroom");
    }

    public void toSit() {
        this.isSitting = true;
    }

    public void standUp (){
        this.isSitting = false;
    }

    public void toLearn() {

    }

    public void toRest() {
    }
}
