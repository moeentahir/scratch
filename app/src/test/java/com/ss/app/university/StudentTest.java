package com.ss.app.university;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getName() {
        Student student1 = new Student("moeen", 14);
        Student student2 = new Student("moeen", 14);


        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

//        final HashSet<Student> students = new HashSet<>();
//        students.add(student1);
//        students.add(student2);

//        System.out.println(students);
//
//        final List<Integer> result = Stream.of(1, 2, 3, 4, 5, 6)
//                .map(s -> s * 2)
//                .collect(Collectors.toList());
//
//        System.out.println(result);


        assertEquals("moeen", student1.getName());
    }

    @Test
    void setName() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void canEqual() {
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
    }
}