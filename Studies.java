package com.java015;

/**
 * Created by VENTO on 26.09.2016.
 */
public class Studies {
    int numberOfStudent;

    public Studies (int numberOfStudent){
        this.numberOfStudent = numberOfStudent;
    }

    public void start (){
        ClassRoom classRoom = new ClassRoom(20);
        Teacher teacher = new Teacher("Teacher");
        Student students [] = new Student[this.numberOfStudent];
        for (int i=0; i< numberOfStudent; i++){
            students[i] = new Student("Student" + (i+1));
        }
        teacher.openClassRoom(classRoom);
        teacher.getIn(teacher,classRoom);
        for (int i=0; i< numberOfStudent; i++){
            students[i].getIn(students[i],classRoom);
        }
        for (int i=0; i< numberOfStudent; i++){
            students[i].beReady();
        }
        teacher.startTeaching(classRoom);
        teacher.stopTeaching(classRoom);
        for (int i=0; i< numberOfStudent; i++){
            students[i].getOut(students[i],classRoom);
        }
        teacher.getOut(teacher,classRoom);
        teacher.closeClassRoom(classRoom);
    }



}

