import java.util.Arrays;

public class Question {
    private String question;
    private String[] options;
    private int correctOptionIndex;

    Question(){

    }
    Question(String question,String[] options,int correctOptionIndex){
        this.question=question;
        this.options=options;
        this.correctOptionIndex=correctOptionIndex;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectOptionIndex() {
        return correctOptionIndex;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(question).append("\n");
        for (int i = 0; i < options.length; i++) {
            sb.append((i + 1)).append(". ").append(options[i]).append("\n");
        }
        return sb.toString();
    }



}
