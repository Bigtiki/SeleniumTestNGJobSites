package listenerTestNG;


import Pages.MasterPage;
import Test.TestBase;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class ListenerTestNG implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("\nTest Started and the test Case is --> "+ result.getName());
    }
    @Override
    public void onTestFailure(ITestResult result) {
 //   	 try {
//    	MasterPage obj= new MasterPage(TestBase.getDriver());
//			obj.takeScreenShot(result.getName());
			   System.out.println("\nTest Failed and the test Case is --> "+ result.getName());
	//	} catch (IOException e) {
		//	e.printStackTrace();
		//}
     
    }
    @Override
    public void onTestSuccess(ITestResult result) {
      //  try {
//           MasterPage obj= new MasterPage(TestBase.getDriver());
//
//            obj.takeScreenShot(result.getName());
            System.out.println("\nTest Success and the test Case is --> "+ result.getName());
       // } catch (IOException e) {
         //   e.printStackTrace();
       // }
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("\nTest Skipped and the test Case is --> "+ result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
         System.out.println("\nTest case finish and the test Case is --> "+ context.getName());
    }
}
