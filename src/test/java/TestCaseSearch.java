import org.apache.log4j.Logger;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by mmadhusoodan on 8/2/15.
 */
public class TestCaseSearch extends BaseTestClass {
    final private static Logger log = Logger.getLogger(TestCaseSearch.class);
    private static SimpleDateFormat hyphenDateFormat = new SimpleDateFormat("MM-dd-yyyy");
    private static SimpleDateFormat slashDateFormat = new SimpleDateFormat("MM/dd/yyyy");

    @Test
    public void testMetricSystemFromNumbers() {
        testSectionName = "TestCaseSearch";
        String str = "1,000";
        int num = Integer.parseInt(str.replace(",", ""));
        log.info(num);

    }

    @Test
    public void testGetNumberFromSentence() {
        testSectionName = "TestCaseSearch";
        String input = "You Have 1,085 Photos and 113 Videos in Lyve";
        String video = input.split("Videos")[0].split("and ")[1].trim();
        String photo = input.split("Photos")[0].split("Have ")[1];
        log.info(photo + " " + video);
    }

    @Test
    public void testHumanReadableCurDate() {
        testSectionName = "TestCaseSearch";
        String hyphenDate = "03-25-2015";
        try {
            Date frmDate = hyphenDateFormat.parse(hyphenDate); // Handle the ParseException here
            String slashDateStr = slashDateFormat.format(frmDate);
            log.info("slashDateStr: " + slashDateStr);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void TestBubbleSort() {
        testSectionName = "TestCaseSearch";
        int array[] = new int[]{1, 5, 4, 0, 55, 43, 3};
        log.info(Arrays.toString(QaSearch.bubbleSort(array)));

        int array1[] = new int[]{10, 8, 7, 6, 5, 4, 3};
        log.info(Arrays.toString(QaSearch.bubbleSort(array1)));
        runStatus = "passed";
    }

    @Test
    public void TestBinarySearch() {
        testSectionName = "TestCaseSearch";
        int array[] = new int[]{1, 5, 14, 20, 35, 43, 50};
        log.info(QaSearch.binarySearch(array, 9));

        int array1[] = new int[]{1, 5, 14, 20, 35, 43, 50};
        log.info(QaSearch.binarySearch(array1, 35));
        runStatus = "passed";
    }

    @Test
    public void TestfindPairSum() {
        testSectionName = "TestCaseSearch";
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        QaSearch.findPairSum(array, 10);
        runStatus = "passed";
    }

}