package org.markjszy.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by mark on 12/11/14.
 */
public class EnglishGreeterTest {
    @Test
    public void testGreeting() {
        Person p = new Person();
        p.setFirstName("Bill");
        p.setLastName("Brasky");
        p.setLocation("Chicago");
        
        assertEquals(EnglishGreeter.greet(p), "Hello, Bill!");
    }
    
    @Test
    public void testMorningGreeting() {
        Person p = new Person();
        p.setFirstName("Bill");
        p.setLastName("Brasky");
        p.setLocation("Chicago");
        
        assertEquals(EnglishGreeter.morningGreet(p), "Good morning, Bill!");
    }
}
