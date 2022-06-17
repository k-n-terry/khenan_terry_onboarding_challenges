package dev.knt.entities;

import java.util.Arrays;
import java.util.List;

public class DataStructureProfile {
    /* Fields */
    private int length;
    private int[] linkedListArray;
    private List<Integer> linkedList;

    /* Constructors */
    public DataStructureProfile(){
    }
    public DataStructureProfile(int length, int[] linkedListArray){
        this.length = length;
        this.linkedListArray = linkedListArray;
    }
    public DataStructureProfile(int length, List<Integer> linkedList){
        this.length = length;
        this.linkedList = linkedList;
    }

    /* Setters */
    public void setLength(int length){
        this.length = length;
    }
    public void setLinkedListArray(int[] linkedListArray){
        this.linkedListArray = linkedListArray;
    }
    public void setLinkedList(List<Integer> linkedList){
        this.linkedList = linkedList;
    }

    /* Getters */
    public int getLength(){
        return this.length;
    }
    public int[] getLinkedListArray(){
        return this.linkedListArray;
    }
    public List<Integer> getLinkedList(){
        return this.linkedList;
    }

    @Override
    public String toString() {
        return "ArrayProfile{" +
                "length=" + length +
                ", numsArray=" + Arrays.toString(linkedListArray) +
                '}';
    }
}