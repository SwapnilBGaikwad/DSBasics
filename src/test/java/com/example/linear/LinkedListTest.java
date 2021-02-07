package com.example.linear;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LinkedListTest {
    @Test
    public void test() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Assert.assertEquals(4, list.size());
        list.remove(0);
        Assert.assertEquals(3, list.size());
        Assert.assertEquals(2, list.get(0).intValue());
        Integer[] integers = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integers));
    }
}