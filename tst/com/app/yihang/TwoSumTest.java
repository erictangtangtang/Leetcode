package com.app.yihang;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void testTwoSum(){
        int target = 9;
        int[] array = new int[]{2,7,11,15};
        int[] result = new int[]{0,1};
        Assert.assertArrayEquals(result, new TwoSum().twoSum(target, array));
    }
}