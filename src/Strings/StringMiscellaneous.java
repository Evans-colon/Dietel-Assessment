package Strings;

public class StringMiscellaneous {
    public static void main(String[] args) {
        String s1 = "hello there";
        char[] charArray = new char[5];
        System.out.println(s1);
        System.out.println(s1.length());

        for(int count = s1.length() - 1; count >= 0; count--)
            System.out.println(s1.charAt(count));

        s1.getChars(0, 5, charArray, 0);
        for(char character : charArray)
            System.out.print(character);

        System.out.println();
    }
}
