import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Test;

import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by mmadhusoodan on 8/2/15.
 */
public class TestClass {
    final private static Logger log = Logger.getLogger(TestClass.class);
    private static SimpleDateFormat hyphenDateFormat = new SimpleDateFormat("MM-dd-yyyy");
    private static SimpleDateFormat slashDateFormat = new SimpleDateFormat("MM/dd/yyyy");

    @Test
    public void TestReverseString() {

        log.info(QaHelper.reverseString("level"));
        log.info(QaHelper.reverseString("are"));
        log.info(QaHelper.reverseString(""));
        log.info(QaHelper.reverseString(" "));
        log.info(QaHelper.reverseString(null));

    }

    @Test
    public void TestsentenceRevese() {

        log.info(QaHelper.sentenceRevese("level is India"));
        log.info(QaHelper.sentenceRevese("are"));
        log.info(QaHelper.sentenceRevese(""));
        log.info(QaHelper.sentenceRevese(" "));
        log.info(QaHelper.sentenceRevese(null));

    }

    @Test
    public void TestFibbonachi() {

        log.info(QaHelper.fib(0));
        log.info(QaHelper.fib(1));
        log.info(QaHelper.fib(2));
        log.info(QaHelper.fib(6));

    }

    @Test
    public void TestFact() {

        log.info(QaHelper.fact(0));
        log.info(QaHelper.fact(1));
        log.info(QaHelper.fact(10));

    }

    @Test
    public void testAPK() {

        String str = "avery-debug-armeabi-v7a-3.0.0.1471.apk";
        str = str.split(".apk")[0];
        String aStr = str.split("v7a-")[1];
        String eStr = "3.0.0(1471)".replace('(', '.');
        eStr = eStr.replace(')', ' ');
        eStr = eStr.trim();
        assertEquals(aStr, eStr);
        log.info(eStr);

    }

    @Test
    public void tests() {

        String str = "1 Failed";
        log.info(str.toUpperCase());

    }

    @Test
    public void testMetricSystemFromNumbers() {

        String str = "1,000";
        int num = Integer.parseInt(str.replace(",", ""));
        log.info(num);

    }

    @Test
    public void testGetNumberFromSentence() {
        String input = "You Have 1,085 Photos and 113 Videos in Lyve";
        String video = input.split("Videos")[0].split("and ")[1].trim();
        String photo = input.split("Photos")[0].split("Have ")[1];
        log.info(photo + " " + video);
    }

    @Test
    public void testHumanReadableCurDate() {
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
    public void TestGetExecutionTimeInHHMMSS() {

        JSONParser parser = new JSONParser();
        long totalTime = 0l;
        try {
            Object obj = parser.parse(new FileReader("testrail_scripts/testrail.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("resultsList");
            for (int i = 0; i < jsonArray.size(); i++) {
                jsonObject = (JSONObject) jsonArray.get(i);
                long elapsed = (Long) (jsonObject.get("elapsed"));
                totalTime += elapsed;
            }
            log.info(QaHelper.getHHMMSSFromSeconds((int) totalTime));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
