# COS 201 — Computer Programming I: Comprehensive Coursework Study & Assignment Guide

**Course:** COS 201 — Computer Programming I  
**Lecturer:** Dr. Ajilore Opeoluwa  
**Target Programmes:** Computer Science (CSC), Cybersecurity (CYB), Information Systems (INS), Software Engineering (SEN), Industrial Chemistry (ICH)  
**Programming Language:** Java (Standard JDK 17+)  
**Repository:** `COS-201-Computer-Programming-I`

---

## Table of Contents
1. [Overview and Pedagogical Context](#1-overview-and-pedagogical-context)
2. [Week 1: Introduction to Programming and Problem-Solving](#2-week-1-introduction-to-programming-and-problem-solving)
   - [What is a Computer Program?](#what-is-a-computer-program)
   - [Programming and Problem-Solving](#programming-and-problem-solving)
   - [The Program Development Life Cycle (PDLC)](#the-program-development-life-cycle-pdlc)
   - [The Input-Processing-Output (IPO) Model](#the-input-processing-output-ipo-model)
   - [Representations: Algorithm vs. Pseudocode vs. Flowchart vs. Source Code](#representations-algorithm-vs-pseudocode-vs-flowchart-vs-source-code)
   - [Common Categories of Programming Errors](#common-categories-of-programming-errors)
   - [Compiling and Running FirstProgram.java](#compiling-and-running-firstprogramjava)
   - [Written Activities Designated for Paper Submission (Verbatim from Lecture Note)](#written-activities-designated-for-paper-submission)
3. [Week 2: Development Environment and First Java Program](#3-week-2-development-environment-and-first-java-program)
   - [Understanding the JDK, JVM, and Java Compiler](#understanding-the-jdk-jvm-and-java-compiler)
   - [Verifying the Environment: java -version and javac -version](#verifying-the-environment-java--version-and-javac--version)
   - [Compiling and Executing from the Terminal](#compiling-and-executing-from-the-terminal)
   - [Why the Class Name and Filename Must Match](#why-the-class-name-and-filename-must-match)
   - [Version Control: Saving vs. Committing vs. Pushing](#version-control-saving-vs-committing-vs-pushing)
   - [Syntax Error Case Study: Missing Semicolon](#syntax-error-case-study-missing-semicolon)
4. [Week 3: Variables, Data Types, Expressions, and Input/Output](#4-week-3-variables-data-types-expressions-and-inputoutput)
   - [Variables, Constants, and Data Types](#variables-constants-and-data-types)
   - [Primitive Types vs. Reference Types (String)](#primitive-types-vs-reference-types-string)
   - [Arithmetic Operators and Operator Precedence](#arithmetic-operators-and-operator-precedence)
   - [Type Conversion and Integer Division Pitfalls](#type-conversion-and-integer-division-pitfalls)
   - [Keyboard Input Using Scanner](#keyboard-input-using-scanner)
   - [Formatted Output with printf()](#formatted-output-with-printf)
   - [Defensive Programming and Input Validation](#defensive-programming-and-input-validation)
5. [Cybersecurity-Aware Programming Habits](#5-cybersecurity-aware-programming-habits)
6. [Complete Step-by-Step GitHub Submission Guide](#6-complete-step-by-step-github-submission-guide)

---

## 1. Overview and Pedagogical Context

COS 201 (Computer Programming I) establishes foundational software development principles for university students in computing disciplines. The coursework bridges theoretical problem-solving (algorithms, flowcharts, pseudocode) and hands-on implementation in Java, emphasizing clean structure, syntax rigor, defensive input validation, and modern version control with Git and GitHub.

---

## 2. Week 1: Introduction to Programming and Problem-Solving

### What is a Computer Program?
A **computer program** is a finite sequence of precise, ordered instructions written in a programming language that guides a computer's processor to perform a specific task, manipulate data, and produce meaningful results. Hardware without software cannot perform meaningful work; programs provide the operational logic.

### Programming and Problem-Solving
Programming is fundamentally an exercise in **problem-solving**:
1. **Understand the Problem:** Clarify the initial state, requirements, constraints, and desired output.
2. **Decompose the Problem:** Break a large computational goal into smaller, manageable sub-tasks.
3. **Design the Solution:** Devise algorithmic logic before touching any code editor.
4. **Implement the Solution:** Translate the design into formal programming language syntax.
5. **Verify and Refine:** Test with varied inputs and correct deficiencies.

### The Program Development Life Cycle (PDLC)
Professional software engineers follow structured stages:
```
+--------------------+      +--------------------+      +--------------------+
| 1. Problem         | ---> | 2. Algorithm       | ---> | 3. Coding &        |
|    Analysis        |      |    Design          |      |    Implementation  |
+--------------------+      +--------------------+      +--------------------+
                                                                   |
+--------------------+      +--------------------+                 |
| 5. Maintenance &   | <--- | 4. Testing &       | <---------------+
|    Documentation   |      |    Debugging       |
+--------------------+      +--------------------+
```
- **Phase 1: Problem Analysis:** Identify objectives, constraints, inputs, and outputs.
- **Phase 2: Algorithm Design:** Formulate step-by-step logic using natural language, flowcharts, or pseudocode.
- **Phase 3: Coding:** Translate the algorithm into valid Java source code.
- **Phase 4: Testing & Debugging:** Compile with `javac`, execute with `java`, detect and resolve errors.
- **Phase 5: Documentation & Maintenance:** Comment code, author user guides, maintain version control records.

### The Input-Processing-Output (IPO) Model
Every computational program operates on the **IPO model**:
- **Input:** Raw data supplied to the system via keyboard, files, sensors, or network sockets.
- **Processing:** Arithmetic operations, logical evaluations, data transformations, and state updates.
- **Output:** Transformed information displayed on screen, printed, stored in files, or transmitted.

```
+-------------------+       +--------------------+       +--------------------+
|       INPUT       | ----> |     PROCESSING     | ----> |       OUTPUT       |
|  (User Keyboard / |       |   (Arithmetic &    |       |  (Console Display /|
|   Raw Data)       |       |   Logical Branch)  |       |   Report Card)     |
+-------------------+       +--------------------+       +--------------------+
```

### Representations: Algorithm vs. Pseudocode vs. Flowchart vs. Source Code

| Representation | Definition | Characteristics | Primary Audience |
| :--- | :--- | :--- | :--- |
| **Algorithm** | A finite, unambiguous, step-by-step procedure to solve a problem. | Plain language, language-agnostic, conceptually clear. | Human problem solvers, analysts |
| **Pseudocode** | Informal, structured shorthand resembling programming constructs. | Uses keywords (`IF`, `THEN`, `WHILE`, `OUTPUT`), ignores strict syntax. | Programmers designing logic |
| **Flowchart** | Graphical diagram illustrating process flow using standard geometric shapes. | Visual symbols (rectangles, diamonds, parallelograms, arrows). | Visual learners, design documentation |
| **Source Code** | Formal implementation conforming strictly to a specific programming language. | Case-sensitive, strict grammar, compiled or interpreted. | Compilers/interpreters and developers |

#### Comparison Example: Calculating the Average of Three Scores
- **Algorithm:**
  1. Prompt for and accept three scores: score1, score2, and score3.
  2. Add the three scores together to obtain the total.
  3. Divide the total by 3 to compute the average.
  4. Display the total and average to the user.
- **Pseudocode:**
  ```text
  BEGIN
      INPUT score1, score2, score3
      total = score1 + score2 + score3
      average = total / 3.0
      OUTPUT total, average
  END
  ```
- **Flowchart Representation:**
  ```text
  [Start] --> [/Input score1, score2, score3/] --> [total = score1 + score2 + score3]
          --> [average = total / 3.0] --> [/Display total, average/] --> [End]
  ```
- **Java Source Code:**
  ```java
  double total = score1 + score2 + score3;
  double average = total / 3.0;
  System.out.printf("Average: %.2f%n", average);
  ```

### Common Categories of Programming Errors
1. **Syntax Errors:** Violations of Java's grammatical rules detected at compile time by `javac`. The program will not compile into bytecode.
   - *Example:* Omitting a semicolon `;` or misspelling `System`.
2. **Runtime Errors:** Errors that occur while the compiled program is actively executing, causing abnormal termination (exceptions).
   - *Example:* Division by zero using integer arithmetic, or passing non-numeric text to `Scanner.nextDouble()`.
3. **Logical Errors:** The program compiles and executes without crashing, but produces incorrect, unintended outputs due to faulty mathematical or algorithmic reasoning.
   - *Example:* Computing `total / 3` using integer division when floating-point precision is required, yielding `2.0` instead of `2.5`.

### Compiling and Running FirstProgram.java
Navigate to the directory containing the source code and use the standard JDK command-line tools:
```bash
cd week01
javac FirstProgram.java
java FirstProgram
```

---

### Written Activities Designated for Paper Submission
*(Extracted verbatim from Dr. Ajilore Opeoluwa's COS 201 Lecture Note, Page 14. These activities are designated for paper submission and must be completed by hand as instructed by the lecturer.)*

> [!IMPORTANT]
> **Lecturer Instruction:** The following written exercises are part of the Week 1 paper assignment. They must be solved on paper and submitted physically to the lecturer according to course guidelines. They are preserved here verbatim for reference.

#### Activity A — Identify the IPO Components
*For each problem, write the input, process and output:*
1. Calculate the area of a rectangle with length 12 and width 5.
2. Calculate the average of four examination scores.
3. Determine whether a number is positive, negative or zero.
4. Calculate the total price of six items costing ₦250 each.
5. Calculate the number of failed login attempts recorded in a sample security log.

#### Activity B — Write Algorithms
*Write an algorithm for each task (identifying input, processing steps, and output):*
1. Accept two numbers and display their sum.
2. Calculate the area of a circle using $A = \pi r^2$.
3. Accept a student's score and determine whether the student passed, using 50 as the pass mark.
4. Accept three numbers and display the largest.
5. Calculate the total cost of items purchased, given quantity and unit price.

#### Activity C — Pseudocode and Flowcharts
*Choose any two problems from Activity B. For each selected problem:*
1. Write the algorithm in numbered steps.
2. Convert the algorithm into pseudocode.
3. Draw a flowchart using the correct standard symbols (terminators, process rectangles, input/output parallelograms, decision diamonds, and flow arrows).

---

## 3. Week 2: Development Environment and First Java Program

### Understanding the JDK, JVM, and Java Compiler
Java employs a two-stage compilation and execution architecture:

```
+---------------------+           +----------------------+           +---------------------+
|  Java Source File   |  javac    |    Java Bytecode     |   java    |   Native Machine    |
|   (HelloWorld.java) | --------> |  (HelloWorld.class)  | --------> |    Instructions     |
|   Human-readable    | (Compiler)|   Platform-neutral   |   (JVM)   |  (Operating System) |
+---------------------+           +----------------------+           +---------------------+
```

- **JDK (Java Development Kit):** The comprehensive software development environment containing the compiler (`javac`), standard class libraries, documentation, and the runtime environment.
- **`javac` (Java Compiler):** Translates high-level Java source code (`.java`) into intermediate platform-neutral bytecode (`.class`).
- **JVM (Java Virtual Machine):** An abstract computing machine that loads compiled bytecode, verifies it for memory and type safety, and interprets/JIT-compiles it into native machine code executed by the host operating system.
- **JRE (Java Runtime Environment):** The runtime bundle (JVM + core libraries) needed to execute compiled Java programs.

### Verifying the Environment: java -version and javac -version
Before developing, verify that both the compiler and runtime are installed and visible in your system's PATH:
```bash
javac -version
java -version
```
*Expected Output:*
```text
javac 27 (or 17+)
openjdk version "27" ... OpenJDK Runtime Environment
```

### Compiling and Executing from the Terminal
Always compile source code first, then run the compiled class by its class name (without extension):
```bash
# Move to the week folder
cd week02

# Compile source code into bytecode
javac HelloWorld.java

# Run bytecode via the JVM
java HelloWorld
```

### Why the Class Name and Filename Must Match
In Java, if a class is declared `public`:
1. The source file **must** bear the exact name of the public class, including capitalization, appended with `.java`.
2. `public class HelloWorld` **must** reside in `HelloWorld.java`.
3. Java is case-sensitive: saving as `helloworld.java` or `HELLOWORLD.java` will trigger a compiler error:
   ```text
   class HelloWorld is public, should be declared in a file named HelloWorld.java
   ```

### Version Control: Saving vs. Committing vs. Pushing
Understanding Git workflow is essential:
1. **Saving (Ctrl+S / Editor):** Writes current modifications from RAM to your local hard drive. Git does not yet track these changes as a permanent project milestone.
2. **Committing (`git commit`):** Creates a permanent, cryptographically hashed snapshot of staged changes in your local repository history, paired with an explanatory commit message.
3. **Pushing (`git push origin main`):** Uploads all recorded local commits to the remote cloud hosting provider (GitHub), making your work visible to instructors, peers, and collaborators.

### Syntax Error Case Study: Missing Semicolon
Java statements terminate with a semicolon `;`. Consider this erroneous snippet:
```java
public class ErrorExample {
    public static void main(String[] args) {
        System.out.println("Learning Java")  // <--- Missing semicolon
    }
}
```
Attempting to compile with `javac ErrorExample.java` yields:
```text
ErrorExample.java:3: error: ';' expected
        System.out.println("Learning Java")
                                           ^
1 error
```
**Fix:** Append `;` at the end of statement line 3.

---

## 4. Week 3: Variables, Data Types, Expressions, and Input/Output

### Variables, Constants, and Data Types
- **Variable:** A named memory location allocated to store data values that can be modified during program execution.
- **Declaration:** Informs the compiler of the variable's identifier and type: `double score;`
- **Initialization:** Assigns an initial value upon creation: `double score = 85.5;`
- **Constant:** An immutable variable declared using the `final` keyword: `final double PI = 3.14159;`

### Primitive Types vs. Reference Types (String)
- **Primitive Types:** Fundamental data types storing raw values directly in memory:
  - `int` (32-bit integer, e.g., quantity)
  - `double` (64-bit IEEE 754 floating-point, e.g., scores, monetary values)
  - `boolean` (`true` or `false`, e.g., flags)
  - `char` (single 16-bit Unicode character, e.g., `'A'`)
- **Reference Types (`String`):** Objects storing memory addresses referencing complex data in the heap. `String` represents immutable sequences of characters:
  ```java
  String studentName = "David Eneje";
  ```

### Arithmetic Operators and Operator Precedence
Java supports basic arithmetic operators:
- Addition: `+`
- Subtraction: `-`
- Multiplication: `*`
- Division: `/`
- Modulus (Remainder): `%`

**Precedence:** Parentheses `()` evaluate first, followed by multiplicative operators (`*`, `/`, `%`), followed by additive operators (`+`, `-`). Evaluations occur left to right for operators of equal precedence.

### Type Conversion and Integer Division Pitfalls
When two integers are divided, Java performs **integer division**, discarding any fractional remainder (truncation towards zero):
```java
int a = 5;
int b = 2;
double result = a / b;  // Evaluates to 2, then widened to 2.0 (INCORRECT!)
```
**Correct Formulation:** Explicitly cast at least one operand to `double` or divide by a floating-point literal:
```java
double correctResult = (double) a / b;  // Evaluates to 2.5
double average = total / 3.0;           // Evaluates with floating-point precision
```

### Keyboard Input Using Scanner
The `java.util.Scanner` class parses primitive types and strings from standard input (`System.in`):
```java
Scanner input = new Scanner(System.in);
System.out.print("Enter name: ");
String name = input.nextLine(); // Reads full line including spaces
System.out.print("Enter age: ");
int age = input.nextInt();      // Reads integer token
```

### Formatted Output with printf()
The `System.out.printf()` method outputs text matching format specifiers:
- `%s` : String
- `%d` : Decimal integer
- `%.2f` : Floating-point number rounded to 2 decimal places
- `%n` : Platform-independent newline separator

```java
System.out.printf("Total Cost: NGN %.2f%n", 1250.5);
// Outputs: Total Cost: NGN 1250.50
```

### Defensive Programming and Input Validation
Programs must never assume user input is valid.
1. **Division by Zero:** Check divisors before dividing:
   ```java
   if (secondNumber != 0) {
       double quotient = firstNumber / secondNumber;
       System.out.printf("Quotient: %.2f%n", quotient);
   } else {
       System.out.println("Quotient: Division is undefined for a zero divisor.");
   }
   ```
2. **Score Range Validation (0–100):** Reject out-of-range inputs using conditional re-prompting loops:
   ```java
   while (score < 0.0 || score > 100.0) {
       System.out.print("Invalid score! Must be between 0 and 100. Re-enter: ");
       score = input.nextDouble();
   }
   ```
3. **Quantity and Price Integrity:** Quantities must be positive integers ($> 0$), and monetary prices must be non-negative ($\ge 0.0$).

---

## 5. Cybersecurity-Aware Programming Habits

Writing software with a security-first mindset begins in introductory programming:
1. **Input Validation:** Every external input is untrusted. Boundary checks prevent out-of-bounds calculations and unexpected states.
2. **Defensive Error Handling:** Catch edge cases (such as zero divisors) explicitly to avoid uncontrolled application crashes.
3. **No Hardcoded Secrets or Personal Data:** Never embed credentials, passwords, private personal tokens, or API keys in source files or Git commit histories.
4. **Resource Management:** Close scanner streams (`scanner.close()`) to avoid resource leaks.
5. **Clean Repository Hygiene:** Utilize `.gitignore` to prevent compiled binaries (`.class`), editor caches, or sensitive environment logs from leaking into public repositories.

---

## 6. Complete Step-by-Step GitHub Submission Guide

### Step 1: Confirm Local Repository Status
Open a terminal in your project directory:
```bash
cd /home/kelvin/Pictures/COS-201-Computer-Programming-I
git status
```
Confirm that:
- You are on branch `main`.
- All required directories (`week01`, `week02`, `week03`, `docs`) and files exist.

### Step 2: Test All Java Programs
Ensure all programs compile cleanly:
```bash
javac week01/FirstProgram.java
javac week02/HelloWorld.java week02/StudentProfile.java
javac week03/SimpleCalculator.java week03/AverageCalculator.java week03/ItemCost.java
```

### Step 3: Stage and Commit Changes
```bash
git add .
git commit -m "Complete COS 201 Practical Coursework for Weeks 1-3"
```

### Step 4: Push to Remote Repository
```bash
git push -u origin main
```

### Step 5: Verify on GitHub
1. Open your browser and navigate to:
   `https://github.com/davideneje5-blip/COS-201-Computer-Programming-I`
2. Verify that all folders and files (`README.md`, `week01/`, `week02/`, `week03/`, `docs/`) are visible and updated.

### Step 6: Submit to Lecturer
Open the official Google Form:  
`https://docs.google.com/forms/d/e/1FAIpQLScfFS-TTZZdgAZ9qPEFp8gNJpHCu0cYudvHJizNCbKOACAb1A/viewform?usp=header`

Fill out the form using the template:
```text
COS 201 — Practical Coursework Submission

Dear Lecturer,
I am submitting my complete practical programming coursework for Weeks 1 through 3.

Student Name          : [Your Full Name]
Matriculation Number  : [Your Matriculation Number]
Programme of Study    : [Your Programme of Study]
Course Code           : COS 201 — Computer Programming I
GitHub Repository URL : https://github.com/davideneje5-blip/COS-201-Computer-Programming-I

Submitted Programs:
1. week01/FirstProgram.java
2. week02/HelloWorld.java
3. week02/StudentProfile.java
4. week03/SimpleCalculator.java
5. week03/AverageCalculator.java
6. week03/ItemCost.java

Documentation:
- README.md (Setup, compile/run commands, test records)
- docs/assignment-guide.md (Comprehensive study guide & written paper activities)
```
