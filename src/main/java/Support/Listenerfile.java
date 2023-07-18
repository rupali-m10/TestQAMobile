package Support;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerfile implements ITestListener {

    public void onTestStart(ITestResult result) {
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("On success test");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("FailedTest");
    }





}
