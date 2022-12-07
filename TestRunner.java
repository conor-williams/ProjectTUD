  
import junit.runner.Result;  
import junit.runner.JUnitCore;  
import junit.runner.notification.Failure;  
  
public class TestRunner {  
   public static void main(String[] args) {  
      Result result = JUnitCore.runClasses(testsofHelloWorld.class);  
          
      for (Failure fail : result.getFailures()) {  
         System.out.println(fail.toString());  
      }  
          
      System.out.println(result.wasSuccessful());  
   }  
}   
