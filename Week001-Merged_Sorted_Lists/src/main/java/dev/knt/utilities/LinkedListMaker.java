package dev.knt.utilities;

import dev.knt.entities.DataStructureProfile;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class LinkedListMaker{
    /* Fields */
    private int length;
    private Random r = new Random();
    private List<Integer> newLinkedList;
    private DataStructureProfile newLinkedListProfile;

    /* Constructors */
    public LinkedListMaker(){
    }

    /* Setters */
    public void setNewLinkedList(){
        this.length = r.nextInt(501);
        List<Integer> linkedList = new LinkedList<Integer>();
        DataStructureProfile dataStructureProfile = new DataStructureProfile();
        for(int i=0; i<this.length; i++){
            linkedList.add(r.nextInt(209) - 104);
        }
        this.newLinkedList = linkedList.stream().sorted().collect(Collectors.toList());

        dataStructureProfile.setLength(this.length);
        dataStructureProfile.setLinkedList(this.newLinkedList);
        this.newLinkedListProfile = dataStructureProfile;
    }
    public void setMergedLinkedList(DataStructureProfile dataStructureProfile){

    }

    /* Getters */
    public List<Integer> getNewLinkedList(){
        return this.newLinkedList;
    }
    public DataStructureProfile getNewLinkedListProfile(){
        return this.newLinkedListProfile;
    }
}
