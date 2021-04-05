package com.ss.app;

public class SameMethodInTwoClasses2 extends SameMethodInTwoClasses {

    String displayMessage2() {
        return (String) super.displayMessage();
    }
}
