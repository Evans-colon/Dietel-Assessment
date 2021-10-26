package GenericCollections;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();

        items.add("red");
        items.add("green");
        items.add("blue");
        items.add(1, "yellow");

        for(int i = 0; i < items.size(); i++)
            if(items.contains("green"))
                items.get(i);
            else
                items.add("black");

       while(!items.isEmpty()){
           if (items.contains("white"))
               items.remove(1);
       }
    }
}
