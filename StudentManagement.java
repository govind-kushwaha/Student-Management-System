import java.util.*;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Student Management System");
        System.out.print("Enter Student Name: ");

        String name = sc.nextLine();

        System.out.println("Welcome " + name);
    }
}