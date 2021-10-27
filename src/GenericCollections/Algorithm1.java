package GenericCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithm1 {
    public static void main(String[] args) {
        Character[] letters = {'p', 'c', 'm'};
        List<Character> list = Arrays.asList(letters);

        Collections.reverse(list);
        System.out.printf("%After calling the reverse, list contains: %n");
        output(list);

        Character[] lettersCopy = new Character[3];
        List<Character> copyList = Arrays.asList(lettersCopy);
    }

    private static void output(List<Character> listRef){
        System.out.print("the list is: ");
        for(Character element : listRef)
            System.out.printf("%s ", element);
    }
}
