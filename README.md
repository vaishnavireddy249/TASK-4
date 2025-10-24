# 🗒️ Java Notes App (File I/O Project)

## 📘 Overview
The **Java Notes App** is a simple **text-based notes manager** built using **Java File I/O** concepts.  
It allows users to create, read, and delete notes directly from the terminal — storing all data persistently in a text file (`notes.txt`).  

This project demonstrates how to use **FileWriter**, **FileReader**, and **BufferedReader** in Java for basic file operations.

---

## 🎯 Objective
> Build a text-based Notes Manager application that demonstrates:
- Writing data to a file using `FileWriter`
- Reading data from a file using `FileReader` / `BufferedReader`
- Clearing file content
- Managing a persistent record of user notes

---

## 🧰 Tools & Technologies
- **Language:** Java  
- **IDE/Editor:** Visual Studio Code  
- **Execution Environment:** Terminal  
- **Java Classes Used:**  
  - `FileWriter` – for writing data to a file  
  - `FileReader` & `BufferedReader` – for reading data from a file  
  - `Scanner` – for user input  

---

## 🧩 Features
✅ **Add Notes** – Users can type and save notes which get stored in `notes.txt`.  
📖 **View Notes** – Displays all notes stored in the file line-by-line.  
🗑️ **Clear All Notes** – Deletes all notes by clearing file contents.  
💾 **Persistent Storage** – Notes remain saved even after program exits.  
🧱 **Menu-Based Interface** – Simple numbered menu system for easy navigation.  

---

## 📁 File Structure

---

## ⚙️ How to Run the Project

### Step 1: Open in VS Code
- Create a new folder named `NotesApp`
- Inside it, create a file `NotesApp.java`
- Paste the complete Java code

### Step 2: Compile the Code
Open the terminal in VS Code and type:
javac NotesApp.java

### Step 3: Run the program
java NotesApp


### Example: 

====== Notes App ======
1. Add Note
2. View Notes
3. Clear All Notes
4. Exit
Enter your choice: 1
Enter your note: Finish File I/O Java Project
✅ Note saved successfully!

====== Notes App ======
1. Add Note
2. View Notes
3. Clear All Notes
4. Exit
Enter your choice: 2

🗒️ Your Notes:
---------------------------
1. Finish File I/O Java Project
---------------------------

