import dev.knt.entities.ArrayProfile;
import dev.knt.utilities.FindArrayMedian;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class find_array_median{
    @Test
    void can_find_arrays_median(){
        int m = 7;
        int n = 6;
        int[] numsArrayTest1 = {1,2,3,4,5,6,7};
        int[] numsArrayTest2 = {1,2,3,4,5,6};
        double medianTheory1 = 4;
        double medianTheory2 = 3.5;

        ArrayProfile arrayProfile1 = new ArrayProfile();
        ArrayProfile arrayProfile2 = new ArrayProfile();
        FindArrayMedian findArrayMed1 = new FindArrayMedian();
        FindArrayMedian findArrayMed2 = new FindArrayMedian();

        arrayProfile1.setLength(m);
        arrayProfile1.setNumsArray(numsArrayTest1);
        findArrayMed1.setArrayMedian(arrayProfile1);

        arrayProfile2.setLength(n);
        arrayProfile2.setNumsArray(numsArrayTest2);
        findArrayMed2.setArrayMedian(arrayProfile2);

        Assertions.assertEquals(medianTheory1, findArrayMed1.getArrayMedian());
        Assertions.assertEquals(medianTheory2, findArrayMed2.getArrayMedian());
    }
}
