import dev.knt.utilities.ArrayMaker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class merg_profile {
    @Test
    void can_merge_arrays(){
        int[] numsTest1 = {1,2,3};
        int[] numsTest2 = {3,4,5,6};
        int[] numsMergeTest = {1,2,3,3,4,5,6};
        int length1 = numsTest1.length;
        int length2 = numsTest2.length;
        ArrayMaker mergeMaker = new ArrayMaker();

        mergeMaker.setMergedArray(length1, numsTest1, length2, numsTest2);

        Assertions.assertEquals(mergeMaker.getNewArray()[4],numsMergeTest[4]);
        Assertions.assertEquals(mergeMaker.getLength(), numsMergeTest.length);
    }
}
