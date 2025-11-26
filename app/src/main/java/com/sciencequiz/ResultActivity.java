package com.sciencequiz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    private TextView tvTotalScore, tvHighScore, tvHintsUsed;
    private Button btnPlayAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvTotalScore = findViewById(R.id.tvTotalScore);
        tvHighScore = findViewById(R.id.tvHighScore);
        tvHintsUsed = findViewById(R.id.tvHintsUsed);
        btnPlayAgain = findViewById(R.id.btnPlayAgain);

        int score = getIntent().getIntExtra("score", 0);
        int hints = getIntent().getIntExtra("hints", 0);

        tvTotalScore.setText("Total Score: " + score);
        tvHintsUsed.setText("Number of used hints: " + hints);

        SharedPreferences prefs = getSharedPreferences("quizPrefs", MODE_PRIVATE);
        int highScore = prefs.getInt("highscore", 0);

        if (score > highScore) {
            SharedPreferences.Editor editor = prefs.edit();
            editor.putInt("highscore", score);
            editor.apply();
            highScore = score;
        }

        tvHighScore.setText("Highest Score: " + highScore);

        btnPlayAgain.setOnClickListener(v -> {
            Intent intent = new Intent(ResultActivity.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        });
    }
}
