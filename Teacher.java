package com.java015;

/**
 * Created by VENTO on 26.09.2016.
 */
public class Teacher extends Person {

    public Teacher(String name) {
        super(name);
        this.type=1;
        System.out.println("Created teacher");
    }
    public void openClassRoom (ClassRoom classRoom){
        classRoom.isOpen = true;
        System.out.println("ClassRoom is open");
    }
    public void closeClassRoom (ClassRoom classRoom){
        classRoom.isOpen = false;
        System.out.println("ClassRoom is close");
    }
    public void startTeaching(ClassRoom classRoom){
        System.out.println("The teacher teaches");
        for (int i = 0; i< classRoom.classRoomFreePlace(0); i ++) {
            classRoom.classRoomCapacity[0][i].toLearn();
        }

    }
    public void stopTeaching(ClassRoom classRoom){
        System.out.println("teacher finished the lesson");
        for (int i = 0; i< classRoom.classRoomFreePlace(0); i ++) {
            classRoom.classRoomCapacity[0][i].toRest();
        }
    }

}
