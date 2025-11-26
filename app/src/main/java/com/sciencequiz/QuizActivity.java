package com.sciencequiz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Collections;
import java.util.List;

public class QuizActivity extends AppCompatActivity {

    private TextView tvQuestionNumber, tvQuestionText, tvFeedback;
    private Button btnA, btnB, btnC, btnD;

    private QuizManager quizManager;
    private static final int QUESTIONS_PER_GAME = 15; // out of 40

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        tvQuestionNumber = findViewById(R.id.tvQuestionNumber);
        tvQuestionText = findViewById(R.id.tvQuestionText);
        tvFeedback = findViewById(R.id.tvFeedback);

        btnA = findViewById(R.id.btnOptionA);
        btnB = findViewById(R.id.btnOptionB);
        btnC = findViewById(R.id.btnOptionC);
        btnD = findViewById(R.id.btnOptionD);

        // Prepare questions: random 15 from 40
        List<Question> allQuestions = QuestionsData.getQuestions();
        Collections.shuffle(allQuestions);
        List<Question> gameQuestions = allQuestions.subList(0, QUESTIONS_PER_GAME);

        quizManager = new QuizManager(gameQuestions);

        loadQuestion();

        btnA.setOnClickListener(v -> handleAnswer(0));
        btnB.setOnClickListener(v -> handleAnswer(1));
        btnC.setOnClickListener(v -> handleAnswer(2));
        btnD.setOnClickListener(v -> handleAnswer(3));
    }

    private void loadQuestion() {
        Question q = quizManager.getCurrentQuestion();
        tvQuestionNumber.setText("Question " + quizManager.getCurrentQuestionNumber()
                + " of " + quizManager.getTotalQuestions());
        tvQuestionText.setText(q.getQuestionText());

        String[] options = q.getOptions();
        btnA.setText("A) " + options[0]);
        btnB.setText("B) " + options[1]);
        btnC.setText("C) " + options[2]);
        btnD.setText("D) " + options[3]);

        tvFeedback.setText("");
    }

    private void handleAnswer(int index) {
        boolean correct = quizManager.checkAnswer(index);

        if (correct) {
            tvFeedback.setText("Correct!");
            if (quizManager.isLastQuestion()) {
                goToResult();
            } else {
                quizManager.moveToNextQuestion();
                loadQuestion();
            }
        } else {
            String hint = quizManager.getHint();
            tvFeedback.setText("Incorrect. Hint: " + hint);
        }
    }

    private void goToResult() {
        Intent intent = new Intent(QuizActivity.this, ResultActivity.class);
        intent.putExtra("score", quizManager.getScore());
        intent.putExtra("hints", quizManager.getUsedHints());
        startActivity(intent);
        finish();
    }
}