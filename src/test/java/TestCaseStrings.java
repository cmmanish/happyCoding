import junit.framework.Assert;
import org.apache.log4j.Logger;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by mmadhusoodan on 8/2/15.
 */
public class TestCaseStrings extends BaseTestClass {
    final private static Logger log = Logger.getLogger(TestCaseStrings.class);

    @Test
    public void TestRepeatedWord() {
        Assert.assertEquals("Today", QaStrings.repeatedString("Today Today ds wer tda Today ds tada"));
        Assert.assertEquals("tada", QaStrings.repeatedString("a Today tada wer tda afadTodaay ds tada"));
        Assert.assertEquals("ds", QaStrings.repeatedString("Today ds ds wer tda Today ds ds"));
    }

    @Test
    public void TestReverseLowerCaseString() {

        testSectionName = "TestCaseA";
        log.info(QaStrings.reverseLowerCaseString("Level Is Palindrome"));
        log.info(QaStrings.reverseLowerCaseString("are"));
        log.info(QaStrings.reverseLowerCaseString(""));
        log.info(QaStrings.reverseLowerCaseString(" "));
        log.info(QaStrings.reverseLowerCaseString(null));

    }
    public void TestRecursiveReverseString() {
        testSectionName = "TestCaseA";

        log.info(QaStrings.recursiveReverseString("abcdef"));
        log.info(QaStrings.recursiveReverseString("are"));
        log.info(QaStrings.recursiveReverseString(""));
        log.info(QaStrings.recursiveReverseString(" "));
        log.info(QaStrings.recursiveReverseString(null));

    }

    @Test
    public void TestReverseString() {
        testSectionName = "TestCaseA";

        log.info(QaStrings.reverseString("level"));
        log.info(QaStrings.reverseString("are"));
        log.info(QaStrings.reverseString(""));
        log.info(QaStrings.reverseString(" "));
        log.info(QaStrings.reverseString(null));

    }

    @Test
    public void TestSentenceReverse() {

        testSectionName = "TestCaseA";
        log.info(QaStrings.sentenceReverse("level is Palindrome"));
        log.info(QaStrings.sentenceReverse("are"));
        log.info(QaStrings.sentenceReverse(""));
        log.info(QaStrings.sentenceReverse(" "));
        log.info(QaStrings.sentenceReverse(null));

    }

    @Test
    public void TestFibbonachi() {
        testSectionName = "TestCaseA";

        log.info(QaStrings.fib(0));
        log.info(QaStrings.fib(1));
        log.info(QaStrings.fib(2));
        log.info(QaStrings.fib(6));

    }

    @Test
    public void TestFact() {
        testSectionName = "TestCaseA";

        log.info(QaStrings.fact(0));
        log.info(QaStrings.fact(1));
        log.info(QaStrings.fact(10));

    }

    @Test
    public void TestAPK() {
        testSectionName = "TestCaseA";

        String str = "avery-debug-armeabi-v7a-3.0.0.1471.apk";
        str = str.split(".apk")[0];
        String aStr = str.split("v7a-")[1];
        String eStr = "3.0.0(1471)".replace('(', '.');
        eStr = eStr.replace(')', ' ');
        eStr = eStr.trim();
        assertEquals(aStr, eStr);
        runStatus = "passed";
        log.info(eStr);

    }

    @Test
    public void TestsUpperCase() {
        testSectionName = "TestCaseA";

        String str = "1 Failed";
        log.info(str.toUpperCase());
    }
}