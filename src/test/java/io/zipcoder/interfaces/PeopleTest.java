package io.zipcoder.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {
    @Test
    public void testAdd() {
        People people = new People();
        Person person = new Person(1L, "John Doe");
        people.add(person);
        assertTrue(people.contains(person));
    }

    @Test
    public void testRemove() {
        People people = new People();
        Person person = new Person(1L, "John Doe");
        people.add(person);
        people.remove(person);
        assertFalse(people.contains(person));
    }

    @Test
    public void testFindById() {
        People people = new People();
        Person person = new Person(1L, "John Doe");
        people.add(person);
        Person foundPerson = people.findById(1L);
        assertEquals(person, foundPerson);
    }


}