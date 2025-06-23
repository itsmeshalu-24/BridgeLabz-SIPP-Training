public class QuizGrader {

    public static void main(String[] args) {
        // Sample correct answers and student's answers
        String[] correctAnswers = {
            "A", "C", "B", "D", "A", "B", "C", "D", "A", "B"
        };

        String[] studentAnswers = {
            "a", "c", "B", "d", "b", "B", "c", "D", "A", "c"
        };

        int score = calculateScore(correctAnswers, studentAnswers);
        System.out.println("\nTotal Score: " + score + " out of " + correctAnswers.length);
    }

    public static int calculateScore(String[] correct, String[] student) {
        int score = 0;

        System.out.println("Quiz Feedback:");
        for (int i = 0; i < correct.length; i++) {
            if (student[i].equalsIgnoreCase(correct[i])) {
                System.out.println("Question " + (i + 1) + ": Correct");
                score++;
            } else {
                System.out.println("Question " + (i + 1) + ": Incorrect (Correct: " + correct[i] + ")");
            }
        }

        return score;
    }
}
