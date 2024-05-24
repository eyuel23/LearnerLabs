package io.zipcoder.interfaces;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class InstructorTest {
    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(1L, "John Doe");
        assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(1L, "John Doe");
        assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(1L, "John Doe");
        Student student = new Student(2L, "Jane Doe");
        instructor.teach(student, 5);
        assertEquals(5, student.getTotalStudyTime());
    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor(1L, "John Doe");
        Student student1 = new Student(2L, "Jane Doe");
        Student student2 = new Student(3L, "Jim Doe");
        Learner[] learners = {student1, student2};
        instructor.lecture(learners, 10);
        assertEquals(5, student1.getTotalStudyTime());
        assertEquals(5, student2.getTotalStudyTime());
    }

}