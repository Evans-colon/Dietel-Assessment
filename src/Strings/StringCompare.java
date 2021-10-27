package Strings;

public class StringCompare {
    public static void main(String[] args) {

        String s1 = new String("hello");
        String s2 = "goodbye";
        String s3 = "Happy Birthday";
        String s4 = "happy birthday";

        if (s1.equals("hello"))
            System.err.println("s1 equals \"hello\"");
        else
            System.out.println("s1 does not equal\"hello\"");

        if(s1 == "hello")
            System.out.println("s1 is the same object as \"hello\"");
        else
            System.out.println("s1 is not the same object as \"hello\"");

        if(s3.equalsIgnoreCase(s4))
            System.out.printf("%s equals %s with the case ignored%n", s3, s4);
        else
            System.out.println("s3 does not equal s4");

        System.out.println(s1.compareTo(s2));
        System.out.println(s3.compareTo(s4));
        if(s3.regionMatches(0, s4, 0, 5));
        System.out.println("first 5 characters of s3 and 4 match");
    }


}
