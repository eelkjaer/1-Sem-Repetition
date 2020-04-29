package ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

    public class StringToArrayListTest {
    ArrayList<String> testlist;
    StringToArrayList sta = new StringToArrayList();

    @BeforeEach
    public void setUp() throws Exception {
        testlist = new ArrayList<>();
        String obj1 = "test";
        sta.addToArrayList(testlist,obj1);

    }

    @Test
    public void addToArrayList(){
        assertTrue(sta.addToArrayList(testlist,"rigtigt test"));
        assertFalse(sta.addToArrayList(testlist,"test"));
        assertFalse(sta.addToArrayList(testlist,null));

    }
}