package dev.knt.utilities;

import dev.knt.entities.ArrayProfile;

public class FindArrayMedian{
    /* Fields */
    double median;
    int length;
    int[] numsArray;
    ArrayProfile arrayProfile = new ArrayProfile();

    /* Constructor */
    public FindArrayMedian(){
    }

    /* Setter */
    public void setArrayMedian(ArrayProfile arrayProfile){
        this.length = arrayProfile.getLength();
        this.numsArray = arrayProfile.getNumsArray();

        if(this.length%2==0){
            double midLeft = numsArray[this.length/2];
            double midRight = numsArray[(this.length/2)+1];
            this.median = (midLeft+midRight)/2;
        }else{
            
        }
    }

    /* Getter */
}
