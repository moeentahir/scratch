package com.ss.app.hired.example.question.two;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static String solution(long[] arr) {

        int leftNodesSum = 0;
        int rightNodesSum = 0;
        int currentLevelNodesForEachHalf = 1;
        int leftNodesCount = currentLevelNodesForEachHalf;
        int rightNodesCount = currentLevelNodesForEachHalf;
        List<Long> leftNodes = new ArrayList<>();
        List<Long> rightNodes = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            if (leftNodesCount > 0) {
                if (arr[i] != -1) {
                    leftNodesSum += arr[i];
                }
                leftNodesCount--;
                leftNodes.add((arr[i]));

                System.out.println("Left " + arr[i]);
            } else if (rightNodesCount > 0) {
                if (arr[i] != -1) {
                    rightNodesSum += arr[i];
                }
                rightNodesCount--;
                rightNodes.add(arr[i]);

                System.out.println("Right " + arr[i]);
            }

            if (leftNodesCount == 0 && rightNodesCount == 0) {
                // start of next level
                currentLevelNodesForEachHalf *= 2;
                leftNodesCount = currentLevelNodesForEachHalf;
                rightNodesCount = currentLevelNodesForEachHalf;
            }
        }

        System.out.println(leftNodes);
        System.out.println(rightNodes);

        if (leftNodesSum > rightNodesSum) {
            return "Left";
        } else if (rightNodesSum > leftNodesSum) {

            return "Right";
        } else {
            return "";
        }
    }
}
