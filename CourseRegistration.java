package com.example;

class Student {
    int id;
    String name;
    String course;

    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public String getCourse() {
        return course;
    }
}

public class App {
    public static void main(String[] args) {
        Student s = new Student(1, "Vaishnavi", "DevOps");
        System.out.println("Course: " + s.getCourse());
    }
}


package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testCourseRegistration() {
        Student s = new Student(1, "Test", "DevOps");
        assertEquals("DevOps", s.getCourse());
    }
}
