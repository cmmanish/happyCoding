import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by mmadhusoodan on 8/2/15.
 */
public class QaHelper {
    final private static Logger log = Logger.getLogger(QaHelper.class);

    public static String repeatedString(String iStr) {

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        String word[] = iStr.split(" ");
        for (int i = 0; i < word.length; i++) {

            if (hashMap.get(word[i]) == null) {
                hashMap.put(word[i], 1);
            } else {
                int count = hashMap.get(word[i]).intValue();
                count += 1;
                hashMap.put(word[i], new Integer(count));
            }
        }

        TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>();
        sortedMap.putAll(hashMap);

        log.info(sortedMap.firstKey());
        return sortedMap.firstKey();
    }

    public static String recursiveReverseString(String s) {

        String rev = "";
        if (s != null && s.length() > 0) {
            rev = rev + reverseString(s.substring(0, s.length()));
        }
        return rev;
    }

    public static String reverseString(String str) {

        String revStr = "";
        if (str.equalsIgnoreCase("") || str.equalsIgnoreCase(" "))
            return "";
        else {
            for (int i = str.length() - 1; i >= 0; i--) {
                revStr += str.charAt(i);
            }
        }
        return revStr;
    }

    public static String sentenceReverse(String str) {

        String revSentence = "";
        if (str.equalsIgnoreCase("") || str.equalsIgnoreCase(" "))
            return "";
        String word[] = str.split(" ");
        for (int i = 0; i < word.length; i++) {
            revSentence += reverseString(word[i]) + " ";
        }
        return revSentence.trim();
    }

    public static int fib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1 || n == 2)
            return 1;
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int fact(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else {
            return n * fact(n - 1);
        }
    }
}
