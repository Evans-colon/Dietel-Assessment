package GenericCollections;

import java.util.Arrays;
import java.util.LinkedList;

public class UsingToArray {
    public static void main(String[] args) {
        String[] colors = {"black", "blue", "yellow"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));

        links.addFirst("cyan");
        links.addLast("red");
        links.add(3, "pink");
        links.push("blue");
        links.pop();
        colors = links.toArray(new String[links.size()]);
        System.out.println(Arrays.toString(colors));
    }
}
