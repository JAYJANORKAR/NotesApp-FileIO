# Java File I/O – Notes App

## Objective:
A simple text-based Notes Manager built using Java.
This app allows users to create and view notes that are saved permanently in a text file using File I/O.

---

## Key Concepts Used:
- File I/O: Reading and writing data to files using FileWriter, FileReader, and BufferedReader.
- Exception Handling: Managing file-related errors gracefully using try-catch.
- Loops & Conditionals: For menu-driven user interaction.
- User Input Handling: Using the Scanner class for console-based input.

---

## Features:
- Add new notes directly from the console.
- View all saved notes from the text file.
- Data persists even after the program ends.
- Error handling for missing files and I/O issues.

---

## Technologies Used:
- Language: Java SE
- Core Concepts: File I/O, Exception Handling, Loops, Scanner

---

## Code Structure:
FileReadWrite.java    →  Main Java source file
notes.txt        →  Text file used for storing notes (auto-created)

---

## How to Run:
1. Save the file as FileReadWrite.java
2. Compile the code: javac FileReadWrite.java
3. Run the program: java FileReadWrite
4. Your notes will be stored in notes.txt in the same directory.

---

## Example Output:
===== Notes App =====
1. Add a Note
2. View Notes
3. Exit
Enter your choice: 1
Enter your note: Learn Java File I/O
Note saved successfully!

---

## Learning Objectives:
- Understand how to use FileWriter and BufferedReader in Java.
- Learn to handle exceptions like IOException and FileNotFoundException.
- Build a simple console-based Java project using OOP fundamentals.

---

## Conclusion:
This project demonstrates the practical use of Java File I/O and Exception Handling to manage data persistence.
It’s an excellent mini-project for beginners exploring Java fundamentals.
