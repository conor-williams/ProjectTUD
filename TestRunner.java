  
import org.junit.runner.Result;  
import org.junit.runner.JUnitCore;  
import org.junit.runner.notification.Failure;  
  
public class TestRunner {  
   public static void main(String[] args) {  
      Result result = JUnitCore.runClasses(testsofHelloWorld.class);  
          
      for (Failure fail : result.getFailures()) {  
         System.out.println(fail.toString());
         System.exit(1);
      }  
          
      System.out.println(result.wasSuccessful());
      System.exit(0);
   }  
}   
