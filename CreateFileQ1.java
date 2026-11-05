import java.io.*;

class CreateFileQ1 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("student.txt");

            fw.write("Student Name: Pooja\n");
            fw.write("Roll Number: 253026172\n");
            fw.write("Course: BCA\n");
            fw.write("Semester: 3rd");

            fw.close();
            System.out.println("File created and data written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}