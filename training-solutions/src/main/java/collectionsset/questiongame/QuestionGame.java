package collectionsset.questiongame;

import java.util.*;

public class QuestionGame {

    private List<RightAnswer> rightAnswers = new LinkedList<>();

    public QuestionGame(List<RightAnswer> rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public Set<String> drawWinners() {
        Set<String> winners = new HashSet<>();
        Random random = new Random();
        while (winners.size() != 5) {
            if (rightAnswers.size() == 0) {
                throw new IllegalArgumentException("Not enough right answers!");
            }
            int number = random.nextInt(rightAnswers.size());
            String winner = rightAnswers.get(number).getName();
            winners.add(winner);
            rightAnswers.remove(number);
        }
        return winners;
    }

    public List<RightAnswer> getRightAnswers() {
        return rightAnswers;
    }
}
