package dev.knt.utilities;

import java.util.Arrays;
import java.util.Random;

public class ArrayMaker{
    private Random r = new Random();
    int length;
    int[] newArray;

    /* Constructors */
    public ArrayMaker(){
    }

    /* New Array */
    public void setNewArray(int length){
        this.length = length;
        int[] randomArray = new int[this.length];
        for(int i=0; i<this.length; i++){
            randomArray[i] = r.nextInt(213)-106;
        }
        Arrays.sort(randomArray);
        this.newArray = randomArray;
    }

    /* New Merged Array */
    public void setMergedArray(int length1, int[] nums1, int length2, int[] nums2){
        this.length = length1+length2;
        if(this.length<1){
            this.newArray = new int[1];
        }else{
            int[] mergedArray = new int[this.length];
            for(int i=0; i<length1; i++){
                mergedArray[i] = nums1[i];
            }
            for(int j=length1; j<this.length; j++){
                mergedArray[j] = nums2[j-length1];
            }
            Arrays.sort(mergedArray);
            this.newArray = mergedArray;
        }
    }

    public int getLength(){
        return this.length;
    }
    public int[] getNewArray(){
        return this.newArray;
    }
}
