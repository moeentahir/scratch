package com.ss.app.hired.skyscanner;

import java.util.*;

class Solution {

    private static final Map<Character, Character> openingChars = new HashMap<>();

    public static boolean solution(String input) {

        openingChars.put(']', '[');
        openingChars.put('}', '{');
        openingChars.put(')', '(');

        var charStack = new Stack<Character>();
        for (int i = 0; i < input.length() - 1; i++) {
            char currentChar = input.charAt(i);

            boolean isOpen = openingChars.containsValue(currentChar);

            if (isOpen) {
                charStack.push(currentChar);
            } else {
                if (charStack.empty()) {
                    return false;
                }

                Character lastPushedCharacter = charStack.pop();
                Character currentCharacterOpeningCharacter = openingChars.get(currentChar);
                if (lastPushedCharacter != currentCharacterOpeningCharacter) {
                    return false;
                }
            }

        }
        return true;
    }
}
