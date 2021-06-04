package com.moodanalyze;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodTest {
    @Test
    public void givenNullMoodShouldReturnHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = null;
        try{
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            mood = moodAnalyzer.analyseMood();
            Assert.assertEquals("HAPPY",mood);
        }catch (MoodAnalysisException e){
            e.printStackTrace();
        }
        }

    }

