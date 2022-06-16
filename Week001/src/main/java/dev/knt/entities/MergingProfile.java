package dev.knt.entities;

import java.util.Arrays;

public class MergingProfile {
    /* Fields */
    private int length;
    private int[] nums1;
    private int[] nums2;

    /* Constructors */
    public MergingProfile(){
    }
    public MergingProfile(int[] nums1, int[] nums2){
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.length = nums1.length+nums2.length;
    }

    /* Setters */
    public void setLength(int[] nums1, int[] nums2) {
        this.length = nums1.length+nums2.length;
    }
    public void setNums1(int[] nums1) {
        this.nums1 = nums1;
    }
    public void setNums2(int[] nums2) {
        this.nums2 = nums2;
    }

    /* Getters */
    public int getLength() {
        return length;
    }
    public int[] getNums1() {
        return nums1;
    }
    public int[] getNums2() {
        return nums2;
    }

    @Override
    public String toString() {
        return "MergingProfile{" +
                "length=" + length +
                ", nums1=" + Arrays.toString(nums1) +
                ", nums2=" + Arrays.toString(nums2) +
                '}';
    }
}
