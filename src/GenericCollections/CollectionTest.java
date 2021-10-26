package GenericCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<String>();

        for (String color : colors)
            list.add(color);

        for (int count = 0; count < list.size(); count++)
            System.out.printf("%s ", list.get(count));

    }

    public static void removeColors(Collection<String> collection1, Collection<String> collection2){

        collection1.removeIf(collection2::contains);
        Iterator<String> iterator = collection1.iterator();


}
}
