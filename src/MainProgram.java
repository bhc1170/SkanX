nano Main.java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting SkanX Scan...");
        try {
            File file = new File("scanfile.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println("Scanning: " + line);
                if (line.contains("virus") || line.contains("malware")) {
                    System.out.println("Threat Detected: Virus found in file!");
                } else {
                    System.out.println("No Threat Detected.");
                }
            }
            scanner.close();
            System.out.println("Scan complete.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}


