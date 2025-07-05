import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quiz quiz = new Quiz(sc);

        int choice;

        System.out.println("Welcome to the Java CLI Quiz App");

        do {
            System.out.println("\n Choose an option:");
            System.out.println("1. Add a Question");
            System.out.println("2. Start the Quiz");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    quiz.addQuestion();
                    break;
                case 2:
                    int score = quiz.getQuestion();
                    System.out.println("\nQuiz Completed!");
                    System.out.println("Your Score: " + score + "/" + quiz.listOfQuestions.size());
                    break;
                case 3:
                    System.out.println("Exiting... Thanks for playing!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}
