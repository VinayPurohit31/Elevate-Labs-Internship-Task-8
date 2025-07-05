import java.util.*;

public class Quiz {
    Scanner sc;
    List<Question> listOfQuestions = new ArrayList<>();


    public Quiz(Scanner sc) {
        this.sc = sc;

        String question1 = "Which keyword is used to define a class in Java?";
        String[] options1 = {"class", "define", "structure", "ClassName"};
        int correctOptionIndex1 = 0;
        listOfQuestions.add(new Question(question1, options1, correctOptionIndex1));

        String question2 = "What is the size of an int variable in Java?";
        String[] options2 = {"4 bytes", "2 bytes", "8 bytes", "Depends on system"};
        int correctOptionIndex2 = 0;
        listOfQuestions.add(new Question(question2, options2, correctOptionIndex2));

        String question3 = "Which method is the entry point of a Java program?";
        String[] options3 = {"start()", "main()", "run()", "init()"};
        int correctOptionIndex3 = 1;
        listOfQuestions.add(new Question(question3, options3, correctOptionIndex3));

        String question4 = "Which of these is not a Java primitive type?";
        String[] options4 = {"int", "boolean", "String", "char"};
        int correctOptionIndex4 = 2;
        listOfQuestions.add(new Question(question4, options4, correctOptionIndex4));

        String question5 = "Which company originally developed Java?";
        String[] options5 = {"Microsoft", "Oracle", "Sun Microsystems", "IBM"};
        int correctOptionIndex5 = 2;
        listOfQuestions.add(new Question(question5, options5, correctOptionIndex5));

        Collections.shuffle(listOfQuestions);
    }

    public void addQuestion() {
        System.out.println("Enter the question:");
        String enterQuestion = sc.nextLine();

        String[] enterOptions = new String[4];
        System.out.println("Enter 4 options (A-D):");
        for (int i = 0; i < 4; i++) {
            System.out.print("Option " + (i + 1) + ": ");
            enterOptions[i] = sc.nextLine();
        }

        System.out.print("Enter the correct option number (1–4): ");
        int enterCorrectOptionIndex = sc.nextInt();
        sc.nextLine();

        listOfQuestions.add(new Question(enterQuestion, enterOptions, enterCorrectOptionIndex - 1));
        System.out.println("Question added successfully.");
    }

    public int getQuestion() {
        int score = 0;
        System.out.println("\n Your quiz starts now!");

        for (Question question : listOfQuestions) {
            System.out.println("\n" + question);
            System.out.print("Enter option number (1–4): ");
            int enteredOptionNo = sc.nextInt();
            sc.nextLine();

            if (enteredOptionNo - 1 == question.getCorrectOptionIndex()) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }

        return score;
    }
}
