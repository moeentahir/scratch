package com.ss.app;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SameMethodInTwoClasses2Test {
    @Test
    void name() {
        SameMethodInTwoClasses2 sameMethodInTwoClasses2 =  new SameMethodInTwoClasses2();
        System.out.println(sameMethodInTwoClasses2.displayMessage());
    }

    @Test
    void something() {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(2);
        System.out.println(list.get(0) instanceof Object);
        System.out.println(list.get(1) instanceof Integer);

        for (Object object: list) {

        }

        list.stream().collect(Collectors.toList());


    }
}