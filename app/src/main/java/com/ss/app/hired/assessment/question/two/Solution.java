package com.ss.app.hired.assessment.question.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static long solution(long n) {
        ArrayList<Integer> set = new ArrayList<>(List.of(1, 2, 3));
        sumUp(set, n);
        return 0;
    }

    static void sumUpRecursive(ArrayList<Integer> numbers, long target, ArrayList<Integer> partial) {
        int s = 0;
        for (int x : partial) s += x;
        if (s == target)
            System.out.println("sum(" + Arrays.toString(partial.toArray()) + ")=" + target);
        if (s >= target)
            return;
        for (int i = 0; i < numbers.size(); i++) {
            ArrayList<Integer> remaining = new ArrayList<>();
            int n = numbers.get(i);
            for (int j = i + 1; j < numbers.size(); j++) remaining.add(numbers.get(j));
            ArrayList<Integer> partial_rec = new ArrayList<>(partial);
            partial_rec.add(n);
            sumUpRecursive(remaining, target, partial_rec);
        }
    }

    static void sumUp(ArrayList<Integer> numbers, long target) {
        sumUpRecursive(numbers, target, new ArrayList<>());
    }
}
