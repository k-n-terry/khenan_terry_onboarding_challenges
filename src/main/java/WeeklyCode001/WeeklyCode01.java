package WeeklyCode001;

import java.util.*;

public class WeeklyCode01{
    static Random r = new Random();

    public static void main(String[] args){
        final int m = r.nextInt(1001);
        final int n = r.nextInt(1001);

        int[] nums1 = makeSortArray(m);
        int[] nums2 = makeSortArray(n);
        int[] numsAll = mergeSortArrays(nums1, nums2);

    }
    public static int[] makeSortArray(int length){
        int[] nums = new int[length];
        for(int i=0; i<length; i++){
            nums[i] = r.nextInt(213)-106;
        }
        Arrays.sort(nums);

        return nums;
    }
    public static int[] mergeSortArrays(int[] array1, int[] array2){
        int m = array1.length;
        int n = array2.length;
        int s = m + n;

        if(s < 1){
            int[] numsAll = new int[1];
            numsAll[0] = r.nextInt(213)-106;
        }else{
            int[] numsAll = new int[s];
            for(int i=0; i<s; i++){
                for(int j=0; j<m; j++){
                    numsAll[i] =
                }
                for(int j=0; j<n; j++){

                }
            }
        }


        if(s>=1){
            int[] numsAll = new int[s];
            for(int i=0; i<s; i++){
                if(i<length01){
                    numsAll[i] = array1[i];
                }else{
                    numsAll[i] = array2[i-length01];
                }
            }
            return numsAll;
        }else{
            int[] numsAll = new int[1];
            numsAll[0] = r.nextInt(213)-106;
            return numsAll;
        }
    }
}