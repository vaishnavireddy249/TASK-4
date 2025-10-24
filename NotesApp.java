import java.io.*;
import java.util.*;

public class NotesApp {

    private static final String FILE_NAME = "notes.txt";

    public static void addNote() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your note: ");
        String note = sc.nextLine();

        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(note + System.lineSeparator());
            System.out.println(" Note saved successfully!");
        } catch (IOException e) {
            System.out.println(" Error writing note: " + e.getMessage());
        }
    }

    public static void viewNotes() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\n Your Notes:");
            System.out.println("---------------------------");
            int count = 0;
            while ((line = reader.readLine()) != null) {
                count++;
                System.out.println(count + ". " + line);
            }
            if (count == 0) {
                System.out.println("(No notes found)");
            }
            System.out.println("---------------------------\n");
        } catch (FileNotFoundException e) {
            System.out.println(" No notes found yet. Add one first!");
        } catch (IOException e) {
            System.out.println(" Error reading notes: " + e.getMessage());
        }
    }

    public static void clearNotes() {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            writer.write("");
            System.out.println(" All notes cleared!");
        } catch (IOException e) {
            System.out.println(" Error clearing notes: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("====== Notes App ======");
            System.out.println("1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Clear All Notes");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addNote();
                    break;
                case 2:
                    viewNotes();
                    break;
                case 3:
                    clearNotes();
                    break;
                case 4:
                    System.out.println(" Exiting.!");
                    break;
                default:
                    System.out.println(" Invalid choice! Try again.");
            }
        } while (choice != 4);
    }
}
