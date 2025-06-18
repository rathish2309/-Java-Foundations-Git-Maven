package Collections.Maps;

import java.util.*;

class Student {
    private String name;
    private int rollNumber;
    private final int totalMarks = 100;
    private int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

}


public class RunnerTest {
    public static void main(String[] args) throws Exception {
        Set<Student> s1 = new HashSet<>();
        s1.add(new Student("Shashank", 1, 90));
        s1.add(new Student("Nikhil", 2, 40));
        s1.add(new Student("Karan", 3, 50));
        s1.add(new Student("Karan", 1, 10));

        Map<Integer, String> m = new TreeMap<>();
        for (Student s : s1) {
            if (s.getTotalMarks() >= 60 && s.getTotalMarks() <= 100) {
                m.put(s.getRollNumber(), "A");
            } else if (s.getTotalMarks() >= 40 && s.getTotalMarks() <= 60) {
                m.put(s.getRollNumber(), "B");
            } else if (s.getTotalMarks() >= 0 && s.getTotalMarks() < 40) {
                m.put(s.getRollNumber(), "C");
            } else
                System.out.println("Please check your total marks !!");
        }

        System.out.println(m.containsKey(3));
        System.out.println(m.containsValue("A"));
        System.out.println(m.get(3));
    }
}
