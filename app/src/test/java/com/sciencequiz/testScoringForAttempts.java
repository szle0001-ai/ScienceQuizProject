package com.sciencequiz;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class testScoringForAttempts {

    @Test
    public void testScoringForAttempts() {
        Question q = new Question(
                "Test?",
                new String[]{"A", "B", "C", "D"},
                1,
                new String[]{"h1", "h2", "h3"}
        );

        QuizManager qm = new QuizManager(Arrays.asList(q));

        // Wrong answer once -> second attempt correct
        qm.checkAnswer(0);  // wrong
        qm.checkAnswer(1);  // correct

        assertEquals(2, qm.getScore());
    }
}
