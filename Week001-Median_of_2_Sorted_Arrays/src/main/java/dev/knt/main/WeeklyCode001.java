package dev.knt.main;

import dev.knt.entities.ArrayProfile;
import dev.knt.utilities.ArrayMaker;
import dev.knt.utilities.FindArrayMedian;

import java.util.Arrays;
import java.util.Random;

public class WeeklyCode001{
    public static void main(String[] args){
        Random r = new Random();
        int m = r.nextInt(11);
        int n = r.nextInt(11);
        int[] nums1;
        int[] nums2;
        int[] numsMerge;

        /* Make Arrays */
        ArrayMaker nums1Maker = new ArrayMaker();
        nums1Maker.setNewArray(m);
        nums1 = nums1Maker.getNewArray();

        ArrayMaker nums2Maker = new ArrayMaker();
        nums2Maker.setNewArray(n);
        nums2 = nums2Maker.getNewArray();

        System.out.println("nums1 array: "+Arrays.toString(nums1));
        System.out.println("nums2 array: "+Arrays.toString(nums2));

        /* Make ArrayProfile Objects */
        ArrayProfile nums1Profile = new ArrayProfile();
        nums1Profile.setLength(m);
        nums1Profile.setNumsArray(nums1);

        ArrayProfile nums2Profile = new ArrayProfile();
        nums2Profile.setLength(n);
        nums2Profile.setNumsArray(nums2);
        
        /* Merge Arrays */
        ArrayMaker numsMergeMaker = new ArrayMaker();
        numsMergeMaker.setMergedArray(nums1Profile, nums2Profile);
        numsMerge = numsMergeMaker.getNewArray();
        System.out.println("numsMerge array: "+Arrays.toString(numsMerge));

        ArrayProfile numsMergeProfile = new ArrayProfile();
        numsMergeProfile.setLength(m+n);
        numsMergeProfile.setNumsArray(numsMerge);

        /* Find Median of Array */
        FindArrayMedian findMedian = new FindArrayMedian();
        findMedian.setArrayMedian(numsMergeProfile);
        System.out.println("median: "+findMedian.getArrayMedian());
    }
}
