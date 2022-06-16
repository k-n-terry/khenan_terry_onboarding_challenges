import dev.knt.entities.ArrayProfile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class array_profile {
    @Test
    void can_make_array_holder(){
        int length = 4;
        int[] nums = {1,2,3,4};
        ArrayProfile arrayProfile = new ArrayProfile();

        arrayProfile.setLength(length);
        arrayProfile.setNumsArray(nums);

        Assertions.assertEquals(arrayProfile.getLength(), length);
        Assertions.assertEquals(arrayProfile.getNumsArray(), nums);
    }
}
