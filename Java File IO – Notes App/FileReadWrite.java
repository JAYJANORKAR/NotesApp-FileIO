package com.internship.calculator;


	import java.io.*;
	import java.util.Scanner;
	
	public class FileReadWrite {
	
	    private static final String FILE_NAME = "notes.txt";

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n===== Notes App =====");
	            System.out.println("1. Add a Note");
	            System.out.println("2. View Notes");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            sc.nextLine(); // consume newline

	            switch (choice) {
	                case 1:
	                    addNote(sc);
	                    break;
	                case 2:
	                    viewNotes();
	                    break;
	                case 3:
	                    System.out.println("Exiting... Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }
	        } while (choice != 3);
	        sc.close();
	    }

	    private static void addNote(Scanner sc) {
	        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
	            System.out.print("Enter your note: ");
	            String note = sc.nextLine();
	            fw.write(note + "\n");
	            System.out.println("Note saved successfully!");
	        } catch (IOException e) {
	            System.out.println("Error while saving note: " + e.getMessage());
	        }
	    }

	    private static void viewNotes() {
	        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
	            String line;
	            System.out.println("\n--- Your Notes ---");
	            while ((line = br.readLine()) != null) {
	                System.out.println("- " + line);
	            }
	            System.out.println("------------------");
	        } catch (FileNotFoundException e) {
	            System.out.println("No notes found yet. Add one first!");
	        } catch (IOException e) {
	            System.out.println("Error while reading notes: " + e.getMessage());
	        }
	    
	}


}
