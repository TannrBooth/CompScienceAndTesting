package org.example;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class MissingNumber {
    public static int missingNumber(int[] nums, int maxNum) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        for(int i = 1; i <=maxNum; i += 1) {
            if(!set.contains(i)) {
                return i;
            }
        }
        return 0;
    }
}
