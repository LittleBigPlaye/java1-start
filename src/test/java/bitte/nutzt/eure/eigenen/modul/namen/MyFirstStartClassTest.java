package bitte.nutzt.eure.eigenen.modul.namen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyFirstStartClassTest {

    @Test
    void should_return_name_rosalie() {
        // Given
        MyFirstStartClass myFirstStartClass = new MyFirstStartClass();

        // When
        String name = myFirstStartClass.getName();

        // Then
        assertEquals("Rosalie", name, "Her name should be Rosalie!");
    }
}