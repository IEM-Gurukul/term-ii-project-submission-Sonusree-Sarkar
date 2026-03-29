[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title
Library Management System
---

## Problem Statement (max 150 words)
Managing a library manually is time-consuming and prone to errors. Keeping track of users, books, issued and returned items, and fines requires significant effort. This project automates library operations by providing a system that allows administrators and users to manage books, issue and return them efficiently, and track transactions. It ensures proper record-keeping, reduces manual errors, and makes library management faster and more organized.
---

## Target User
- Library administrators who manage books and users.
- Students or library members who borrow and return books.
- Anyone needing a simple system to track library transactions.
---

## Core Features
- Add, view, and manage users.
- Add, view, and manage books.
- Issue books to users.
- Return books with overdue fine calculation.
- View currently issued books.
- Maintain transaction history for all users.
- 
- 
- 

---

## OOP Concepts Used

- Abstraction:
- Inheritance:
- Polymorphism:
- Exception Handling:
- Collections / Threads:

---

## Proposed Architecture Description

The Library Management System is organized into the following components:

1. **User Class** – Represents a library member with attributes like ID and name.  
2. **Admin Class** – Represents the administrator who can add or remove books and view all transactions.  
3. **Book Class** – Encapsulates information about books including title, author, and availability.  
4. **Transaction Class (Abstract)** – Parent class for IssueTransaction and ReturnTransaction, storing common attributes such as bookName, userName, and date.  
5. **IssueTransaction Class** – Handles book issuance operations, updating the transaction history.  
6. **ReturnTransaction Class** – Handles book returns and calculates overdue fines if applicable.  
7. **LibraryService Class** – Acts as a controller, managing users, books, and transactions.  
8. **Main Class** – Entry point of the program demonstrating the functionality of the system.

All classes interact through **LibraryService**, which provides methods to issue, return, and list books. Users interact with the system through the **console interface**.
---

## How to Run

1. Open the project in VS Code or any Java IDE.  
2. Compile all Java files in the `src/` folder.  
3. Run `Main.java`.  
4. Follow the console prompts to:  
   - Add users  
   - Add books  
   - Issue books  
   - Return books  
   - View transactions and issued books
5. Observe the console outputs for confirmation of each action.
---

## Git Discipline Notes
Minimum 10 meaningful commits required.


- Minimum 10 meaningful commits have been made, representing the progress of the project:  
  1. Initial commit with project setup  
  2. Added Book class  
  3. Added User class  
  4. Added Admin class with inheritance  
  5. Added abstract Transaction class  
  6. Implemented IssueTransaction class  
  7. Implemented ReturnTransaction class with fine calculation  
  8. Added LibraryService class for managing books and transactions  
  9. Added Main class for program execution and demonstration  
  10. Added final report and README.md  

- All commits have descriptive messages and were pushed to GitHub regularly.