import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.*;

class AStringChecker implements StringChecker{
    public boolean checkString(String s){
        if(s.contains("a"))
            return true;
        
        return false;
    }
}
public class ListTests{
    StringChecker sc;

    List<String> testString = new ArrayList<>();
    List<String> exceptString = new ArrayList<>();
    List<String> s1 = new ArrayList<>(Arrays.asList("abb", "baa", "uhs", "idh"));
    List<String> s2 = new ArrayList<>(Arrays.asList("abb", "baa"));
    
    List<String> s3 = new ArrayList<>(Arrays.asList("aaa", "aaa"));
    List<String> s4 = new ArrayList<>(Arrays.asList("bbb", "bbb"));
    List<String> s5 = new ArrayList<>(Arrays.asList("aaa", "aaa", "ttt"));
    List<String> s6 = new ArrayList<>();
    

    @Test 
    public void testFilter() {
        sc = new AStringChecker();
        // failure-inducing input
        assertEquals(s2, ListExamples.filter(s1, sc));

        // input that doesn’t induce a failure
        assertEquals(s3, ListExamples.filter(s5, sc));
        assertEquals(s6, ListExamples.filter(s4, sc));
    }

    @Test
    public void testmerge() {
        //List<String> s3 = new ArrayList<>(Arrays.asList("zzz", "yyy"));
        //List<String> s4 = new ArrayList<>(Arrays.asList("aaa", "bbb"));
        //List<String> s5 = new ArrayList<>(Arrays.asList("aaa", "bbb", "yyy", "zzz"));
        //assertEquals(s5, ListExamples.merge(s3, s4));
    }



    
}
