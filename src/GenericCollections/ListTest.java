package GenericCollections;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        String[]colors = {"Black", "white", "Yellow", "Green", "Blue"};
        List<String> firstList = new LinkedList<>();

        for (String color : colors)
            firstList.add(color);

//        System.out.println(Arrays.toString(colors));

        String[]colors2 = {"gold", "red", "blur", "Yam", "Egg"};
        List<String> secondList = new LinkedList<>();
        for(String color : colors)
            secondList.isEmpty();
//        System.out.println(Arrays.toString(colors2));
        convertToUpperCaseStrings(firstList);
        printReversedList(secondList);
    }

    private static void convertToUpperCaseStrings(List<String> list) {
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }

    private static String printReversedList(List<String> list){
          ListIterator<String> iterator = list.listIterator(list.size());
          while(iterator.hasPrevious())
              iterator.hasPrevious();
          return iterator.previous();
        }
    }

