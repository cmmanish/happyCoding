import org.apache.log4j.Logger;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mmadhusoodan on 8/2/15.
 */
public class TestCaseB extends BaseTestClass {
    final private static Logger log = Logger.getLogger(TestCaseB.class);
    private static SimpleDateFormat hyphenDateFormat = new SimpleDateFormat("MM-dd-yyyy");
    private static SimpleDateFormat slashDateFormat = new SimpleDateFormat("MM/dd/yyyy");

    @Test
    public void testMetricSystemFromNumbers() {
        testSectionName = "TestCaseA";
        String str = "1,000";
        int num = Integer.parseInt(str.replace(",", ""));
        log.info(num);

    }

    @Test
    public void testGetNumberFromSentence() {
        testSectionName = "TestCaseA";
        String input = "You Have 1,085 Photos and 113 Videos in Lyve";
        String video = input.split("Videos")[0].split("and ")[1].trim();
        String photo = input.split("Photos")[0].split("Have ")[1];
        log.info(photo + " " + video);
    }

    @Test
    public void testHumanReadableCurDate() {
        testSectionName = "TestCaseA";
        String hyphenDate = "03-25-2015";
        try {
            Date frmDate = hyphenDateFormat.parse(hyphenDate); // Handle the ParseException here
            String slashDateStr = slashDateFormat.format(frmDate);
            log.info("slashDateStr: " + slashDateStr);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}