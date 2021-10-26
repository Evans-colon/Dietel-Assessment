package PersonalPractice;

public class DaysOfChristmas {
    public static void main(String[] args) {
        for(int day = 1; day <= 12; day++){
            System.out.print("on the " + day);

            switch (day) {
                case 1:
                    System.out.print("first day of christmas, my true love gave to me");
                    break;
                case 2:
                    System.out.print("second day of christmas, my true love gave to me");
                    break;
                case 3:
                    System.out.print("third day of christmas, my true love gave to me");
                    break;
                case 4:
                    System.out.print("forth day of christmas, my true love gave to me");
                    break;
                case 5:
                    System.out.print("fifth day of christmas, my true love gave to me");
                    break;
                case 6:
                    System.out.print("sixth day of christmas, my true love gave to me");
                    break;
                case 7:
                    System.out.print("seventh day of christmas, my true love gave to me");
                    break;
                case 8:
                    System.out.print("eighth day of christmas, my true love gave to me");
                    break;
                case 9:
                    System.out.print("ninth day of christmas, my true love gave to me");
                    break;
                case 10:
                    System.out.print("tenth day of christmas, my true love gave to me");
                    break;
                case 11:
                    System.out.print("eleventh day of christmas, my true love gave to me");
                    break;
                default:
                    System.out.print("twelfth day of christmas, my true love gave to me");
                    switch (day) {
                        case 12:
                            System.out.println("twelve drummers drumming,");
                        case 11:
                            System.out.println("Eleven pipers piping");
                        case 10:
                            System.out.println("Ten lords are leaping");
                        case 9:
                            System.out.println("Nine ladies dancing");
                        case 8:
                            System.out.println("Eight maids are milking");
                        case 7:
                            System.out.println("Seven sawns are swimming");
                        case 6:
                            System.out.println("Six geese are laying");
                        case 5:
                            System.out.println("Five golden ring");
                        case 4:
                            System.out.println("Four calling birds");
                        case 3:
                            System.out.println("Three french hens");
                        case 2:
                            System.out.println("Two turtle doves");
                        default:
                            System.out.println("And a partridge in a pear tree");
                    }
                    System.out.println();
                    break;
            }
        }
    }
}
