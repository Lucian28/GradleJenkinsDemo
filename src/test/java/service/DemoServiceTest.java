package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DemoServiceTest {

    DemoService classUnderTest = new DemoService();

    @Test
    void add() {
        //given
        List<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        //when

        //then
        Assertions.assertEquals(15, classUnderTest.add(numberList));
    }

    @Test
    void max() {
        //given
        List<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        //when

        //then
        Assertions.assertEquals(5, classUnderTest.max(numberList));
    }

    @Test
    void min() {
        //given
        List<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        //when

        //then
        Assertions.assertEquals(1, classUnderTest.min(numberList));
    }
}