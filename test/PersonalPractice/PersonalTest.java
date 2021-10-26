package PersonalPractice;


public class PersonalTest {
    public static void Main(String[] args){

        int[] array = {1, 2, 3, 4, 5};
        System.out.println(array);

        modifyArray(array);
        System.out.println(array);

        modifyElement(array[3]);
        System.out.println(array[3]);

    }

    public static void modifyArray(int[] array2) {
        for (int counter = 0; counter < array2.length; counter++)
            array2[counter] = 2 * counter;
    }

    public static void modifyElement(int element) {
        element = 2 * element;
        System.out.println(element);
    }
}


