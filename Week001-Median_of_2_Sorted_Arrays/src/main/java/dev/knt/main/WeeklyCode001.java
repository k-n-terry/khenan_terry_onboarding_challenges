package dev.knt.main;

import dev.knt.entities.ArrayProfile;
import dev.knt.utilities.ArrayMaker;
import dev.knt.utilities.FindArrayMedian;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WeeklyCode001{


    public static void main(String[] args){
        Random r = new Random();
        final int m = r.nextInt(11);
        final int n = r.nextInt(11);
        int[] nums1;
        int[] nums2;

        /* Make Arrays */
        ArrayMaker nums1Maker = new ArrayMaker();
        nums1Maker.setNewArray(m);
        nums1 = nums1Maker.getNewArray();

        ArrayMaker nums2Maker = new ArrayMaker();
        nums2Maker.setNewArray(n);
        nums2 = nums2Maker.getNewArray();

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        /* Make ArrayProfile Objects */
        ArrayProfile nums1Profile = new ArrayProfile();
        nums1Profile.setLength(m);
        nums1Profile.setNumsArray(nums1);

        ArrayProfile nums2Profile = new ArrayProfile();
        nums2Profile.setLength(n);
        nums2Profile.setNumsArray(nums2);

        ArrayProfile numsMergedProfile = new ArrayProfile();
        FindArrayMedian findMedian = new FindArrayMedian();



    }
}
