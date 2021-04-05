package com.ss.app.hired.example.question.one;

class Solution {
    public static long solution(long[] numbers) {
        if(numbers.length == 0) {
            return 0;
        }

        long result = Long.MIN_VALUE;
        for (long number: numbers
             ) {
            if(number > result) {
                result = number;
            }
        }

        return result;
    }
}
