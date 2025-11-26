package com.sciencequiz;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class QuizManagerTest {

    @Test
    public void testNextQuestionProgression() {
        List<Question> questions = Arrays.asList(
                new Question("Q1", new String[]{"A","B","C","D"}, 0, new String[]{"h1"}),
                new Question("Q2", new String[]{"A","B","C","D"}, 1, new String[]{"h1"})
        );
        QuizManager qm = new QuizManager(questions);
        qm.checkAnswer(0);
        qm.moveToNextQuestion();
        assertEquals("Q2", qm.getCurrentQuestion().getQuestionText());
    }


}