import junit.framework.Assert;
import org.apache.log4j.Logger;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by mmadhusoodan on 8/2/15.
 */
public class TestCaseA extends BaseTestClass {
    final private static Logger log = Logger.getLogger(TestCaseA.class);

    @Test
    public void TestRepeatedWord() {
        Assert.assertEquals("Today", QaHelper.repeatedString("Today Today ds wer tda Today ds tada"));
        Assert.assertEquals("tada", QaHelper.repeatedString("a Today tada wer tda afadTodaay ds tada"));
        Assert.assertEquals("ds", QaHelper.repeatedString("Today ds ds wer tda Today ds ds"));
    }

    @Test
    public void TestReverseLowerCaseString() {

        testSectionName = "TestCaseA";
        log.info(QaHelper.reverseLowerCaseString("Level Is Palindrome"));
        log.info(QaHelper.reverseLowerCaseString("are"));
        log.info(QaHelper.reverseLowerCaseString(""));
        log.info(QaHelper.reverseLowerCaseString(" "));
        log.info(QaHelper.reverseLowerCaseString(null));

    }
    public void TestRecursiveReverseString() {
        testSectionName = "TestCaseA";

        log.info(QaHelper.recursiveReverseString("abcdef"));
        log.info(QaHelper.recursiveReverseString("are"));
        log.info(QaHelper.recursiveReverseString(""));
        log.info(QaHelper.recursiveReverseString(" "));
        log.info(QaHelper.recursiveReverseString(null));

    }

    @Test
    public void TestReverseString() {
        testSectionName = "TestCaseA";

        log.info(QaHelper.reverseString("level"));
        log.info(QaHelper.reverseString("are"));
        log.info(QaHelper.reverseString(""));
        log.info(QaHelper.reverseString(" "));
        log.info(QaHelper.reverseString(null));

    }

    @Test
    public void TestSentenceReverse() {

        testSectionName = "TestCaseA";
        log.info(QaHelper.sentenceReverse("level is Palindrome"));
        log.info(QaHelper.sentenceReverse("are"));
        log.info(QaHelper.sentenceReverse(""));
        log.info(QaHelper.sentenceReverse(" "));
        log.info(QaHelper.sentenceReverse(null));

    }

    @Test
    public void TestFibbonachi() {
        testSectionName = "TestCaseA";

        log.info(QaHelper.fib(0));
        log.info(QaHelper.fib(1));
        log.info(QaHelper.fib(2));
        log.info(QaHelper.fib(6));

    }

    @Test
    public void TestFact() {
        testSectionName = "TestCaseA";

        log.info(QaHelper.fact(0));
        log.info(QaHelper.fact(1));
        log.info(QaHelper.fact(10));

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