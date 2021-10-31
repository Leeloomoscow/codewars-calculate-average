import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MyTest {
    private static final double DELTA = 1e-15;
    @Test
    public void testSomething() {
        assertEquals(1, Kata.find_average(new int[]{1, 1, 1}), DELTA);
        assertEquals(2, Kata.find_average(new int[]{1, 2, 3}), DELTA);
    }

    private static class Kata {
        public static double find_average(int[] array) {
            double sum = 0;
            for (int j : array) {
                sum += j;
            }
            return sum / array.length;
        }
    }
}

    


