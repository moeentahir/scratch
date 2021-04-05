package com.ss.app.hired.assessment.question.angles;

public class Solution {
    public static String solution(String angles) {
        int missingOpeningBrackets = 0;
        int notMatchedSoFar = 0;


        for (int i = 0; i < angles.length(); i++) {
            if (angles.charAt(i) == '<') {
                notMatchedSoFar++;
            } else if (angles.charAt(i) == '>') {
                if(notMatchedSoFar > 0){
                    notMatchedSoFar--;
                } else {
                    missingOpeningBrackets ++;
                }
            }
            System.out.println(angles.charAt(i));
        }


        StringBuilder anglesBuilder = new StringBuilder(angles);
        for(int i = 0; i< missingOpeningBrackets; i++) {
            anglesBuilder.insert(0, "<");
        }

        anglesBuilder.append(">".repeat(Math.max(0, notMatchedSoFar)));

        return anglesBuilder.toString();
    }
}
