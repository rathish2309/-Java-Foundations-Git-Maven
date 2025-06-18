package Collections.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

class Student{
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
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


    //add toString() method


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return rollNumber == student.rollNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNumber);
    }
}

public class RunnerTest {
    public static void main(String[] args) {
        HashSet<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Alice", 101));
        studentSet.add(new Student("Bob", 102));
        studentSet.add(new Student("Charlie", 103));
        studentSet.add(new Student("David", 101)); // Duplicate rollNumber

        System.out.println("Students in HashSet:");
        for (Student s : studentSet) {
            System.out.println(s);
        }

    }
}
