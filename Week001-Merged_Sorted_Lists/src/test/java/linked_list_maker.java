import dev.knt.utilities.LinkedListMaker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class linked_list_maker{
    @Test
    void can_make_linked_list(){
        List<Integer> linkie;
        LinkedListMaker linkieMaker = new LinkedListMaker();

        linkieMaker.setNewLinkedList();
        linkie = linkieMaker.getNewLinkedList();
        System.out.println(linkie);

        Assertions.assertNotNull(linkie);
    }

    @Test
    void can_merge_linked_lists(){
        int length = 3;
        int aL = 2;
        int bL = 3;
        int cL = 4;
        List<Integer> aList = new LinkedList<Integer>();
        for(int i=0; i<aL; i++){
            aList.add(i+1);
        }
        List<Integer> bList = new LinkedList<Integer>();
        for(int i=0; i<bL; i++){
            bList.add(i+3);
        }
        List<Integer> cList = new LinkedList<Integer>();
        for(int i=0; i<cL; i++){
            cList.add(i+6);
        }
        List<Integer> mergie;
        LinkedListMaker mergieMaker = new LinkedListMaker();


    }
}
