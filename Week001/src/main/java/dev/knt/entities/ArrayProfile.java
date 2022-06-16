package dev.knt.entities;

import java.util.Arrays;

public class ArrayProfile {
    /* Fields */
    private int length;
    private int[] numsArray;

    /* Constructors */
    public ArrayProfile(){
    }
    public ArrayProfile(int length, int[] numsArray){
        this.length = length;
        this.numsArray = numsArray;
    }

    /* Getters */
    public int getLength(){
        return length;
    }
    public int[] getNumsArray(){
        return numsArray;
    }

    /* Setters */
    public void setLength(int length){
        this.length = length;
    }
    public void setNumsArray(int[] numsArray){
        this.numsArray = numsArray;
    }

    @Override
    public String toString() {
        return "ArrayProfile{" +
                "length=" + length +
                ", numsArray=" + Arrays.toString(numsArray) +
                '}';
    }
}
