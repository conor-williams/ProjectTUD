//import static junit.framework.Assert.assertEquals;  
//import junit.framework.Test;  
import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;
public class testsofHelloWorld {  
           
    HelloWorld obj = new HelloWorld();  
    
    @Test
    public void testHelloWorld1() {  
        assertEquals("Test of return in junit", 0, obj.tobetested("Hello"));  
    }  
 }
      
