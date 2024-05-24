package io.zipcoder.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void testImplementation() {
        Student student = new Student(1L, "John Doe");
        assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student student = new Student(1L, "John Doe");
        assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        Student student = new Student(1L, "John Doe");
        student.learn(10);
        assertEquals(10, student.getTotalStudyTime());
    }

}