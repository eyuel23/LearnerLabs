package io.zipcoder.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void testConstructor() {
        Person person = new Person(1L, "John Doe");
        assertEquals(1L, person.getId());
        assertEquals("John Doe", person.getName());
    }

    @Test
    public void testSetName() {
        Person person = new Person(1L, "John Doe");
        person.setName("Jane Doe");
        assertEquals("Jane Doe", person.getName());
    }
}