package com.java015;

public class ClassRoom {
    int classRoomPlaces;
    Person [][] classRoomCapacity;
    boolean isOpen = false;


    public ClassRoom (int classRoomPlaces){
        this.classRoomPlaces = classRoomPlaces;
        this.classRoomCapacity = new Person[2][];
        this.classRoomCapacity[1] = new Teacher [1];
        this.classRoomCapacity[0] = new Student [classRoomPlaces];
        System.out.println("Created class room");
    }

    public int classRoomFreePlace (int type){
        int i =0;
        boolean isEmpty = false;
        if (this.isOpen){
            while (i < this.classRoomCapacity[type].length && !isEmpty){
                if (this.classRoomCapacity[type][i] == null){
                    isEmpty=true;
                }
                i++;
            }
            return i-1;
        } else {
            return -1;
        }

    }

}
