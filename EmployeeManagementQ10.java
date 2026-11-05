import java.io.*;
import java.util.*;

class EmployeeManagementQ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("employees.txt");

            System.out.print("Enter ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            System.out.print("Enter Salary: ");
            String salary = sc.nextLine();

            fw.write(id + "," + name + "," + dept + "," + salary);
            fw.close();

            System.out.print("Search Employee ID: ");
            String search = sc.nextLine();

            BufferedReader br = new BufferedReader(
                new FileReader("employees.txt"));

            String line;
            boolean found = false;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data[0].equals(search)) {
                    System.out.println("Employee Record: " + line);
                    found = true;
                }
            }

            if (!found)
                System.out.println("Employee record not found.");

            br.close();

        } catch (IOException e) {
            System.out.println("File not found or error occurred.");
        }
    }
}
