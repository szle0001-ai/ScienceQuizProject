package com.sciencequiz;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvTitle;
    private Button btnStart, btnHighScore, btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitle = findViewById(R.id.tvTitle);
        btnStart = findViewById(R.id.btnStartQuiz);
        btnHighScore = findViewById(R.id.btnHighScore);
        btnAbout = findViewById(R.id.btnAbout);

        btnStart.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, QuizActivity.class);
            startActivity(intent);
        });

        btnHighScore.setOnClickListener(v -> {
            SharedPreferences prefs = getSharedPreferences("quizPrefs", MODE_PRIVATE);
            int highScore = prefs.getInt("highscore", 0);
            Toast.makeText(this, "Highest Score: " + highScore, Toast.LENGTH_SHORT).show();
        });

        btnAbout.setOnClickListener(v -> {
            new AlertDialog.Builder(this)
                    .setTitle("About")
                    .setMessage("Science Quiz – a simple app to learn fun scientific facts with hints and scoring.")
                    .setPositiveButton("OK", null)
                    .show();
        });
    }
}