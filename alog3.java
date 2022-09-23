import java.util.Scanner;

public class alog3 {
    public static void main(String[] args) {
        String s = "qwers";
        String answer = "";
        int num = s.length();
        int cent = num / 2;
        if (num % 2 == 0) {
            answer = s.substring(cent-1, cent+1);
        } else {
            answer = s.substring(cent, cent+1);
        }
        System.out.printf(answer);
    }
}
