import java.time.LocalTime;

/**
 * Created by mmadhusoodan on 8/2/15.
 */
public class QaHelper {
    public static String getHHMMSSFromSeconds(int nSecondTime) {
        return LocalTime.MIN.plusSeconds(nSecondTime).toString();
    }

    public static String reverseString(String str) {

        String revStr = "";
        if (str == "" || str == null || str == " ")
            return "";
        else {
            for (int i = str.length() - 1; i >= 0; i--) {
                revStr += str.charAt(i);
            }
        }
        return revStr;
    }

    public static String sentenceRevese(String str) {

        String revSentence = "";
        if (str == null || str == "" || str == " ")
            return "";
        String word[] = str.split(" ");
        for (int i = 0; i < word.length; i++) {
            revSentence += reverseString(word[i]) + " ";
        }
        return revSentence.trim();
    }

    public static int fib(int n) {
        //0,1,1,2,3,5,8,13,21
        if (n == 0) return 0;
        else if (n == 1 || n == 2) return 1;
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int fact(int n) {
        //0,1,1,2,3,5,8,13,21
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else {
            return n * fact(n - 1);
        }
    }
}
