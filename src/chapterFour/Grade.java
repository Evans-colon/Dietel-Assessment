package chapterFour;

public class Grade {
    public String calculateScore(int studentScore) {
        if (studentScore >= 90) {
            return "A";
        } else if (studentScore >= 80) {
            return "B";
        } else if (studentScore >= 70) {
            return "C";
        } else if (studentScore >= 60) {
            return "D";
        } else if (studentScore >= 50) {
            return "F";
        } else {
            return "invalid";
        }
    }
}



