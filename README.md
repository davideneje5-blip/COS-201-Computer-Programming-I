# COS 201 — Computer Programming I

**Practical Coursework Repository (Weeks 1–3)**

---

## Student Information

- **Full Name:** `ENEJE DAVID UGONNA`
- **Matriculation Number:** `25/17922`
- **Programme of Study:** `Cybersecurity`
- **Course Code:** `COS 201`
- **Course Title:** `Computer Programming I`
- **Lecturer:** `Dr. Ajilore Opeoluwa`
- **Repository URL:** `https://github.com/davideneje5-blip/COS-201-Computer-Programming-I`

---

## Project Overview

This repository contains the complete practical programming coursework, source files, and technical documentation for **COS 201 — Computer Programming I** covering Weeks 1 through 3. The coursework demonstrates foundational software engineering principles, algorithm design, defensive input validation, testing rigor, and disciplined version control with Git and GitHub.

---

## Learning Objectives (Weeks 1–3)

### Week 1: Introduction to Programming and Problem-Solving
- Understand the nature of computer programs, software execution, and problem decomposition.
- Understand the Input-Processing-Output (IPO) model and Program Development Life Cycle (PDLC).
- Distinguish between algorithms, pseudocode, flowcharts, and source code.
- Write, compile, and execute an introductory Java program.
- Initialize version control and understand GitHub workflow.

### Week 2: Development Environment and First Java Program
- Understand the roles of the JDK, JVM, and `javac` compiler.
- Compile and execute Java programs from the terminal.
- Master class declaration, `main()` entry points, and output formatting with `println()`.
- Implement interactive console data collection with `Scanner`.
- Practice defensive error correction (syntax, runtime, logical).

### Week 3: Variables, Data Types, Expressions, and Input/Output
- Declare, initialize, and manipulate primitive data types (`int`, `double`) and reference types (`String`).
- Implement arithmetic operations, understand operator precedence, and avoid integer division truncation.
- Read diverse input tokens using `Scanner`.
- Format numerical output to two decimal places using `printf()`.
- Apply defensive programming to validate input ranges and handle edge cases (e.g., zero divisor).

---

## Project Directory Structure

```text
COS-201-Computer-Programming-I/
├── README.md                          # Project documentation and test verification
├── .gitignore                         # Excludes compiled .class and OS files
├── week01/
│   └── FirstProgram.java              # Introductory output and academic details
├── week02/
│   ├── HelloWorld.java                # Basic Java class structure and course metadata
│   └── StudentProfile.java            # Console-based interactive student profile
├── week03/
│   ├── SimpleCalculator.java          # Arithmetic calculator with zero-division handling
│   ├── AverageCalculator.java         # Student grade average calculator with 0-100 score validation
│   └── ItemCost.java                  # Inventory cost calculator with quantity/price validation
└── docs/
    └── assignment-guide.md            # In-depth study guide, concepts, and written paper exercises
```

---

## Java Source Code Catalog

| Week | Filename | Class Name | Description |
| :--- | :--- | :--- | :--- |
| **Week 1** | `week01/FirstProgram.java` | `FirstProgram` | Displays course code, programme placeholder, three discipline-specific reasons why programming matters, and an academic learning goal. |
| **Week 2** | `week02/HelloWorld.java` | `HelloWorld` | Outputs formatted course metadata, week number, topic, and learning goal using standard output statements. |
| **Week 2** | `week02/StudentProfile.java` | `StudentProfile` | Interactively prompts for a student's full name, matriculation number, programme, and course code, presenting them in a formatted student profile card. |
| **Week 3** | `week03/SimpleCalculator.java` | `SimpleCalculator` | Prompts for two double numbers; computes sum, difference, product, and quotient; guards defensively against division by zero; outputs to 2 decimal places. |
| **Week 3** | `week03/AverageCalculator.java` | `AverageCalculator` | Prompts for student name and 3 course scores; validates each score to strictly ensure range $0 \le \text{score} \le 100$; calculates total and average with floating-point precision. |
| **Week 3** | `week03/ItemCost.java` | `ItemCost` | Prompts for item description, quantity (integer $> 0$), and unit price ($\ge 0.0$); calculates total cost; outputs formatted purchase summary. |

---

## Prerequisites and Verification

Ensure the Java Development Kit (JDK 17 or higher) is installed on your system.

### Check Installed Versions:
```bash
javac -version
java -version
```

*Verified local environment:*
- Java Compiler: `javac 27` (OpenJDK)
- Java Runtime: `OpenJDK 64-Bit Server VM (build 27, mixed mode, sharing)`

---

## Compilation and Execution Guide

Execute all commands from the root directory of this repository:

### Week 1
```bash
# Compile
javac week01/FirstProgram.java

# Run
java -cp week01 FirstProgram
```

### Week 2
```bash
# Compile
javac week02/HelloWorld.java week02/StudentProfile.java

# Run HelloWorld
java -cp week02 HelloWorld

# Run StudentProfile
java -cp week02 StudentProfile
```

### Week 3
```bash
# Compile
javac week03/SimpleCalculator.java week03/AverageCalculator.java week03/ItemCost.java

# Run SimpleCalculator
java -cp week03 SimpleCalculator

# Run AverageCalculator
java -cp week03 AverageCalculator

# Run ItemCost
java -cp week03 ItemCost
```

---

## Executed Test Cases and Verification Results

All programs have been compiled and verified through automated test suites:

### 1. `FirstProgram.java`
- **Input:** None (non-interactive console display).
- **Output:**
  ```text
  ==================================================
         COS 201: COMPUTER PROGRAMMING I
  ==================================================
  Course Code  : COS 201
  Course Title : Computer Programming I
  Programme    : CYBERSECURITY

  --- Why Programming is Essential to My Discipline ---
  Reason 1: It enables the design of automated tools and scripts for security analysis and vulnerability assessment.
  Reason 2: It builds deep problem-solving skills and a structured understanding of how software processes data.
  Reason 3: It allows engineers to inspect, understand, and secure application source code against system vulnerabilities.

  --- Personal Learning Goal for COS 201 ---
  Goal: To master foundational Java syntax, algorithmic problem-solving, and disciplined version control habits.
  ==================================================
  ```
- **Status:** PASS

### 2. `HelloWorld.java`
- **Input:** None (non-interactive console display).
- **Output:**
  ```text
  ==================================================
  COURSE       : COS 201
  COURSE TITLE : Computer Programming I
  PROGRAMME    : CYBERSECURITY
  WEEK         : 2
  TOPIC        : Development Environment and Java
  GOAL         : To learn how to write, compile, and run Java programs.
  ==================================================
  ```
- **Status:** PASS

### 3. `StudentProfile.java`
- **Input:**
  - Full Name: `David Eneje`
  - Matriculation Number: `25/12345`
  - Programme: `Cybersecurity`
  - Course Code: `COS 201`
- **Output:**
  ```text
  --------------------------------------------------
               OFFICIAL STUDENT PROFILE             
  --------------------------------------------------
  Student Name : David Eneje
  Matric Number: 25/12345
  Programme    : Cybersecurity
  Course Code  : COS 201
  Status       : Active Enrollment
  ==================================================
  ```
- **Status:** PASS

### 4. `SimpleCalculator.java`
- **Test Case 1 (Standard Operations):**
  - Inputs: `20`, `4`
  - Expected/Actual: Sum: `24.00`, Difference: `16.00`, Product: `80.00`, Quotient: `5.00`
  - Status: PASS
- **Test Case 2 (Defensive Zero-Divisor Handling):**
  - Inputs: `15`, `0`
  - Expected/Actual: Sum: `15.00`, Difference: `15.00`, Product: `0.00`, Quotient: `Division is undefined for a zero divisor.`
  - Status: PASS

### 5. `AverageCalculator.java`
- **Test Case 1 (Standard Scores):**
  - Inputs: `Amina Bello`, `70`, `80`, `90`
  - Expected/Actual: Total: `240.00 / 300.00`, Average: `80.00`
  - Status: PASS
- **Test Case 2 (Validation of Out-of-Range Scores):**
  - Inputs: `David Eneje`, `-10` (rejected), `85` (accepted), `105` (rejected), `95` (accepted), `90` (accepted)
  - Expected/Actual: Total: `270.00 / 300.00`, Average: `90.00`
  - Status: PASS

### 6. `ItemCost.java`
- **Test Case 1 (Standard Purchase):**
  - Inputs: `USB Flash Drive`, Quantity `3`, Unit Price `1500.00`
  - Expected/Actual: Total Cost: `NGN 4500.00`
  - Status: PASS
- **Test Case 2 (Validation of Negative/Zero Inputs):**
  - Inputs: `Ethernet Cable`, Quantity `-2` (rejected), `5` (accepted), Unit Price `-50` (rejected), `250.00` (accepted)
  - Expected/Actual: Total Cost: `NGN 1250.00`
  - Status: PASS

