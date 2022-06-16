package dev.knt.utilities;

import dev.knt.entities.ArrayProfile;

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
    public void setMergedArray(ArrayProfile arrProf1, ArrayProfile arrProf2){
        this.length = arrProf1.getLength()+arrProf2.getLength();
        if(this.length<1){
            this.newArray = new int[1];
        }else{
            int[] mergedArray = new int[this.length];
            for(int i=0; i<arrProf1.getLength(); i++){
                mergedArray[i] = arrProf1.getNumsArray()[i];
            }
            for(int j=arrProf1.getLength(); j<this.length; j++){
                mergedArray[j] = arrProf2.getNumsArray()[j-arrProf1.getLength()];
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
