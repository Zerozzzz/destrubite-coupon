package org.ling.distribute.coupon.template.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {

    private RedisTemplate<String, String> template;

    @Test
    @DisplayName("true")
    public void test() {
        int[][] matrix = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotate(matrix);
        Arrays.sort(matrix, Comparator.comparing(a -> a[0]));
    }


    public void rotate(int[][] matrix) {
        if(matrix.length == 1) {
            return;
        }

        int n = matrix.length;
        int circles = n / 2;


        for(int circle = 0; circle < circles; circle++) {
            for(int i = 0; i < n - circle - 1; i++) {
                int temp = matrix[circle][circle + i];
                matrix[circle][circle + i] = matrix[n - circle - 1][circle + i];
                matrix[n - circle - 1][circle + i] = matrix[n - circle - 1][n - circle - 1];
                matrix[n - circle - 1][n - circle - 1] = matrix[circle + i][n - circle - 1];
                matrix[circle + i][n - circle - 1] = temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
