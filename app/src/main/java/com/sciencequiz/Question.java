package com.sciencequiz;

public class Question {
    private String questionText;
    private String[] options;
    private int correctIndex; // 0..3
    private String[] hints;   // up to 3 hints

    public Question(String questionText, String[] options, int correctIndex, String[] hints) {
        this.questionText = questionText;
        this.options = options;
        this.correctIndex = correctIndex;
        this.hints = hints;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectIndex() {
        return correctIndex;
    }

    public String[] getHints() {
        return hints;
    }
}