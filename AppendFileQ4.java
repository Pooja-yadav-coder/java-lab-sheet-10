import java.io.*;
import java.util.*;

class AppendFileQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("students.txt", true);

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter roll number: ");
            String roll = sc.nextLine();

            System.out.print("Enter marks: ");
            String marks = sc.nextLine();

            fw.write("\n" + name + " " + roll + " " + marks);
            fw.close();

            System.out.println("Record added successfully.");
        } catch (IOException e) {
            System.out.println("File error.");
        }
    }
}
