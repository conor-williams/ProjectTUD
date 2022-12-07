import static junit.Assert.assertEquals;  
import junit.Test;  
public class testsofHelloWorld {  
           
    HelloWorld obj = new HelloWorld();  
     
    @Test  
    public void testHelloWorld1() {  
        assertEquals("Test of return in junit", 1, obj.tobetested());  
    }  
 }
      
