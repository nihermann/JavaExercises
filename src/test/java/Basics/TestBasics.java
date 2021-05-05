package Basics;

import static Basics.Basics.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TestBasics {
    @Test
    public void testInnenWinkel1(){
        float result = innenWinkelSumme(60, 60);
        float should_be = 60;

        assertEquals(should_be, result, 0.001);
    }

    @Test
    public void testInnenWinkel2(){
        float result = innenWinkelSumme(-20, 15);
        float should_be = -1;

        assertEquals(should_be, result, 0.001);

        result = innenWinkelSumme(20, -15);
        should_be = -1;

        assertEquals(should_be, result, 0.001);
    }

    @Test
    public void testInnenWinkel3(){
        float result = innenWinkelSumme(120, 60);
        assertEquals(-1, result, 0.001);
    }

    @Test
    public void testFahrenheitInCelcius(){
        assertEquals(0, fahrenheitInCelcius(32), 0.001);
        assertEquals(32, fahrenheitInCelcius(89.6), 0.001);
        assertEquals(100, fahrenheitInCelcius(212), 0.001);
    }

    @Test
    public void testFibonacci(){
        assertEquals(8, fib(5, 1, 1));
        assertEquals(3, fib(1, 2, 3));
        assertEquals(166774, fib(23, -10, 12));
    }

    @Test
    public void testRevert1D_1(){
        int[] int_array = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        assertArrayEquals(expected, revert(int_array));
    }

    @Test
    public void testRevert1D_2(){
        int[] int_array = {1, 2, 33, 4, 5, 10};
        int[] expected = {10, 5, 4, 33, 2, 1};
        assertArrayEquals(expected, revert(int_array));
    }

    @Test
    public void testRevert2D_1(){
        int[][] int_array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expected = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        assertArrayEquals(expected, revert(int_array));
    }

    @Test
    public void testRevert2D_2(){
        int[][] int_array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14},
                {15, 16, 17, 18}
        };
        int[][] expected = {
                {18, 17, 16, 15},
                {14, 13, 12, 11},
                {10, 9, 8, 7, 6},
                {5, 4, 3, 2, 1}
        };
        assertArrayEquals(expected, revert(int_array));
    }
}
