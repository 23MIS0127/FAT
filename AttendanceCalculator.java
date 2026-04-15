package com.example;

public class App {

    public static double calculateAttendance(int attended, int total) {
        return ((double) attended / total) * 100;
    }

    public static void main(String[] args) {
        double result = calculateAttendance(75, 100);
        System.out.println("Attendance: " + result + "%");
    }
}


package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAttendance() {
        assertEquals(75.0, App.calculateAttendance(75, 100), 0.01);
        assertEquals(50.0, App.calculateAttendance(25, 50), 0.01);
    }
}
