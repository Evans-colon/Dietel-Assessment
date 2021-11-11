package DataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClientExample {
    private List list;

    public ListClientExample(){
        list = new LinkedList<>();

    }
    private List getList(){
        return list;
    }

    public static void main(String[] args) {
        ListClientExample workingList = new ListClientExample();
        List list =  workingList.getList();
        System.out.println(list);
    }
}
