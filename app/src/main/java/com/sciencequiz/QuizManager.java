package com.sciencequiz;

import java.util.List;

import java.util.List;

public class QuizManager {

    private final List<Question> questions;
    private int currentQuestionIndex = 0;
    private int attemptsForCurrent = 0;
    private int score = 0;
    private int usedHints = 0;

    public QuizManager(List<Question> questions) {
        this.questions = questions;
    }

    public Question getCurrentQuestion() {
        return questions.get(currentQuestionIndex);
    }

    public int getCurrentQuestionNumber() {
        return currentQuestionIndex + 1;
    }

    public int getTotalQuestions() {
        return questions.size();
    }

    public int getScore() {
        return score;
    }

    public int getUsedHints() {
        return usedHints;
    }

    /**
     * Returns true if answer is correct, false otherwise.
     * Also updates score according to attempt count.
     */
    public boolean checkAnswer(int selectedIndex) {
        Question q = getCurrentQuestion();

        if (selectedIndex == q.getCorrectIndex()) {
            // scoring: 3 points 1st try, 2 points 2nd, 1 point 3rd+
            if (attemptsForCurrent == 0) {
                score += 3;
            } else if (attemptsForCurrent == 1) {
                score += 2;
            } else {
                score += 1;
            }
            attemptsForCurrent = 0;
            return true;
        } else {
            attemptsForCurrent++;
            return false;
        }
    }

    public String getHint() {
        String[] hints = getCurrentQuestion().getHints();
        // Show at most 3 hints, don’t crash if attempts > hints.length
        int hintIndex = attemptsForCurrent - 1;
        if (hintIndex >= 0 && hintIndex < hints.length) {
            usedHints++;
            return hints[hintIndex];
        } else {
            return "No more hints available.";
        }
    }

    public boolean isLastQuestion() {
        return currentQuestionIndex == questions.size() - 1;
    }

    public void moveToNextQuestion() {
        if (currentQuestionIndex < questions.size() - 1) {
            currentQuestionIndex++;
            attemptsForCurrent = 0;
        }
    }
}
