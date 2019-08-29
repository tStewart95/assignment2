import org.junit.*;
import static org.junit.Assert.assertEquals;

public class JUnitTest {
    @Test
    public void test_validArrays(){
        int[] myArray = {0,1,2,3,4,5,6,7};

        Finder finder = new Finder();

        int max1 = 7;
        int min1 = 0;

        int actmax1 = finder.findMax(myArray);
        int actmin1 = finder.findMin(myArray);

        assertEquals(max1,actmax1);
        assertEquals(min1,actmin1);
    }

    @Test
    public void test_invalidArrays(){
        int[] myArray = {};
        int[] nullarray = null;

        Finder finder = new Finder();

        Integer actmax1 = finder.findMax(myArray);
        Integer actmin1 = finder.findMin(myArray);
        Integer actmax2 = finder.findMax(nullarray);
        Integer actmin2 = finder.findMin(nullarray);

        assertEquals(null,actmax1);
        assertEquals(null,actmax2);
        assertEquals(null,actmin1);
        assertEquals(null,actmin2);
    }
}
