package dev.knt.utilities;

import dev.knt.entities.DataStructureProfile;

import java.util.Arrays;
import java.util.Random;

public class ArrayMaker{
    private Random r = new Random();
    private int k;
    private int[] newArray;

    /* Constructors */
    public ArrayMaker(){
    }

    /* New Array */
    public void setNewArray(int k){
        this.k = k;
        int[] linkedListArray = new int[this.k];
        for(int i=0; i<this.k; i++){
            linkedListArray[i] = r.nextInt(213)-106;
        }
        this.newArray = linkedListArray;
    }

    public int getLength(){
        return this.k;
    }
    public int[] getNewArray(){
        return this.newArray;
    }
}