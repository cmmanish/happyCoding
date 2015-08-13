import org.apache.log4j.Logger;

import java.util.HashMap;

/**
 * Created by mmadhusoodan on 8/8/15.
 */
public class QaSearch {

    final private static Logger log = Logger.getLogger(QaStrings.class);

    public static HashMap<Integer, Integer> findPairSum(int[] array, int sum) {

        HashMap<Integer, Integer> pairs = new HashMap<Integer, Integer>();
        if (array.length == 0)
            log.info("empty Array");
        else {
            for (int i = 0; i < array.length; i++) {

                if (pairs.containsKey(array[i])) {
                    log.info(array[i] + ": " + pairs.get(array[i]));

                } else {
                    pairs.put(sum - array[i], i + 1);
                }
            }
        }
        return pairs;
    }

    public static int[] bubbleSort(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static boolean binarySearch(int array[], int b) {

        boolean flag = false;
        int low = 0;
        int high = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (b > array[mid]) {
                low = mid + 1;
            } else if (b < array[mid]) {
                high = mid + 1;
            } else
                flag = true;
        }
        return flag;
    }
}
