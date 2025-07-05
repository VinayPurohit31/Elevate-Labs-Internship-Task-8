# Java CLI Quiz Application

This is a simple Java-based command-line quiz application. The app allows users to attempt a short quiz related to Java programming. It also supports adding new custom questions through the terminal.

---

## Features

- Pre-loaded Java quiz questions.
- Ability to add custom questions via the command line.
- User-friendly CLI (Command Line Interface).
- Displays score after quiz completion.
- Questions are shuffled each time the quiz starts.

---

## Files and Structure

Java-CLI-Quiz-App/
├── MainApp.java # Main class that runs the CLI menu

├── Quiz.java # Quiz logic: add questions, show questions, calculate score

├── Question.java # Model class for individual questions

└── README.md # Project documentation


---


## How to Compile and Run

### Step 1: Open terminal and navigate to the project folder

### Step 2: Compile the Java files

```bash
javac MainApp.java Quiz.java Question.java

This will compile all the source files.
Step 3: Run the application

java MainApp

This will start the application in your terminal.
How It Works
1. Main Menu Options

When you start the app, you will see the following options:

1. Add a Question
2. Start the Quiz
3. Exit

You can enter:

    1 to add a new question to the quiz.

    2 to begin the quiz with available questions.

    3 to exit the application.

2. Adding a Question

If you choose to add a question:

    You will be asked to enter the question text.

    Then, you will enter four answer options.

    Finally, you will specify which option number (1–4) is correct.

3. Taking the Quiz

When the quiz starts:

    Questions will be shown one at a time.

    You will input your answer as an option number (1–4).

    Correct answers increase your score.

    Your final score will be shown after all questions.

Example Output

Welcome to the Java CLI Quiz App!

Choose an option:
1. Add a Question
2. Start the Quiz
3. Exit
Your choice: 2

Your quiz starts now!

Question: Which keyword is used to define a class in Java?
1. class
2. define
3. structure
4. ClassName
Enter the number for the correct option: 1
You answer is right!

Quiz Completed!
Your Score: 5/5
