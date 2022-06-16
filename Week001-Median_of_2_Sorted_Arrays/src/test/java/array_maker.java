import dev.knt.entities.ArrayProfile;
import dev.knt.utilities.ArrayMaker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class array_maker{
    @Test
    void can_make_random_array(){
        int length = 5;
        ArrayMaker arrayMaker = new ArrayMaker();

        arrayMaker.setNewArray(length);

        Assertions.assertTrue((arrayMaker.getNewArray().length==5));
    }

    @Test
    void can_make_merged_array(){
        int[] nums1 = {1,2,3};
        int[] nums2 = {3,4,5,6};
        ArrayProfile nums1Prof = new ArrayProfile(3, nums1);
        ArrayProfile nums2Prof = new ArrayProfile(4, nums2);
        ArrayMaker arrayMerger = new ArrayMaker();

        arrayMerger.setMergedArray(nums1Prof, nums2Prof);

        Assertions.assertTrue((arrayMerger.getNewArray().length==7));
    }
}
