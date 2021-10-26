package DataStructure;

public class Array {
    public static void main(String[] args) {
        int[] newArray = {12, 14, 16, 12, 23};
        System.out.println(sumTheArray(newArray));

    }

    public static void creatingTheArray(int[] array) {
        array = new int[7];
        int N = array.length;
        for (int i = 0; i < N; i++) {
            System.out.printf("%5d%8d%n", i, array[i]);
        }
    }

    public static int sumTheArray(int[] newArray){
        int N = newArray.length;
        int total = 0;

        for(int j = 0; j < N; j++){
            total += newArray[j];
            System.out.println(total);
        }
        return total;
    }



}
