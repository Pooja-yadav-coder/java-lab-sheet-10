import java.io.*;
import java.util.*;

class FileInfoQ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        File f = new File(sc.nextLine());

        System.out.println("Exists: " + f.exists());
        System.out.println("Name: " + f.getName());
        System.out.println("Path: " + f.getAbsolutePath());
        System.out.println("Size: " + f.length() + " bytes");
        System.out.println("Is File: " + f.isFile());
        System.out.println("Is Directory: " + f.isDirectory());
        System.out.println("Readable: " + f.canRead());
        System.out.println("Writable: " + f.canWrite());
    }
}
