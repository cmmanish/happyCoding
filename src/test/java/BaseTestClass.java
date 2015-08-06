import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

import java.io.File;
import java.io.FileWriter;

/**
 * Created by mmadhusoodan on 8/3/15.
 */
public class BaseTestClass {
    final private static Logger log = Logger.getLogger(BaseTestClass.class);

    protected String runStatus = "failed";
    protected String testSectionName = "";
    protected String testName = "";
    private JSONObject eachResult = new org.json.simple.JSONObject();
    private long startTime = 0;
    private long endTime = 0;
    private long elapsed = 0;
    File file = new File(filePath);
    private static JSONObject railsTestJSON = new org.json.simple.JSONObject();
    private static JSONArray resultsList = new JSONArray();
    private static String testrailDir = "testrail_scripts/";
    private static FileWriter fileWriter = null;
    protected static String fileName = "testrail.json";
    protected static String filePath = testrailDir + "/" + fileName;

    @Rule
    public TestName name = new TestName();

    @Before
    public void beforeMethod() {
        try {
            fileWriter = new FileWriter(filePath);
            railsTestJSON.put("resultsList", resultsList);
            log.info("<--------- Start Test --------------------------------------------------------->");
            if (!file.exists()) {
                log.info(fileName + " doesn't exist : So creating it at " + filePath);
                file.createNewFile();
                log.info(fileName + " filed created ");
            }
            fileWriter = new FileWriter(filePath);
            railsTestJSON.put("resultsList", resultsList);

            elapsed = 0l;
            runStatus = "failed";
            testName = "";
            testSectionName = "";
            startTime = System.currentTimeMillis(); // Get the start Time
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After
    public void afterMethod() {
        testName = name.getMethodName();
        endTime = System.currentTimeMillis(); // Get the end Time
        elapsed = (endTime - startTime) / 1000;
        try {
            eachResult.put("elapsed", elapsed);
            eachResult.put("testSectionName", testSectionName);
            eachResult.put("runStatus", runStatus);
            eachResult.put("testName", testName);
            resultsList.add(eachResult);

            fileWriter.append(railsTestJSON.toString());
            fileWriter.flush();
            fileWriter.close();
            log.info("elapsed time for run test = " + elapsed);
            log.info("runStatus = " + runStatus);
            log.info("<--------- End Test --------------------------------------------------------->");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
