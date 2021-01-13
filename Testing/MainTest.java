package Homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void reverse() {
        Main text = new Main();
        assertEquals("cba", text.reverse("abc"));
        assertNotEquals("abc", text.reverse("abc"));
    }
}
