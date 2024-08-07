package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.task14.DisplayFibonacciNumbersSeries;

import java.util.ArrayList;
import java.util.Arrays;

public class Task14Test {
    @Test
    void handleTest(){
        DisplayFibonacciNumbersSeries test1 = new DisplayFibonacciNumbersSeries(6);

        ArrayList<Integer> expected =  new ArrayList<>(Arrays.asList(0, 1, 1, 2, 3, 5, 8));
        ArrayList<Integer> result = test1.writeFibonacciSeries();

        Assertions.assertEquals(expected, result);
    }

}
