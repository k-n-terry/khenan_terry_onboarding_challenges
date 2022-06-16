import dev.knt.entities.MergingProfile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class merging_profile {
    @Test
    void can_merge_arrays(){
        int[] numsTest1 = {1,2,3};
        int[] numsTest2 = {3,4,5,6};
        int length = numsTest1.length+numsTest2.length;
        MergingProfile mergingProfile = new MergingProfile();

        mergingProfile.setNums1(numsTest1);
        mergingProfile.setNums2(numsTest2);
        mergingProfile.setLength(numsTest1,numsTest2);

        Assertions.assertEquals(mergingProfile.getNums1(), numsTest1);
        Assertions.assertEquals(mergingProfile.getNums2(), numsTest2);
        Assertions.assertEquals(mergingProfile.getLength(),length);
    }
}
