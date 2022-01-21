

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatriceTest {

    @Test
    void testCalculatrice() {
        int[] array = new int[] {0,1,2,3,4,5,3};
        assertEquals(1,Solution.calc(array,0,1));
        assertEquals(15,Solution.calc(array,0,5));
        assertEquals(0,Solution.calc(array,0,0));
        assertEquals(18,Solution.calc(array,0,6));

    }



}
