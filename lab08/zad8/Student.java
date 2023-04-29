package zad8;

import java.util.Arrays;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private String indexNumber;

    public Student(String firstName, String lastName, String indexNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    @Override
    public int compareTo(Student other) {
        String index1 = this.indexNumber.substring(1); // pomijamy pierwszy znak (literę P)
        String index2 = other.indexNumber.substring(1);
        return index1.compareTo(index2);
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Jan", "Kowalski", "s12345"),
                new Student("Adam", "Nowak", "s54321"),
                new Student("Maria", "Kowalczyk", "s99999"),
                new Student("Tomasz", "Lewandowski", "s11111")
        };

        System.out.println("Przed sortowaniem:");
        for (Student student : students) {
            System.out.println(student.getIndexNumber() + ": " + student.getFirstName() + " " + student.getLastName());
        }

        Arrays.sort(students);

        System.out.println("\nPo sortowaniu:");
        for (Student student : students) {
            System.out.println(student.getIndexNumber() + ": " + student.getFirstName() + " " + student.getLastName());
        }
    }
}
