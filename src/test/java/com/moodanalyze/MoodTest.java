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

        }catch (MoodAnalysisException e){

        }
        Assert.assertEquals("HAPPY",mood);
        }

        @Test
        public void givenNullMoodShouldThrowException(){
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
            try{
                moodAnalyzer.analyseMood(null);

            }catch (MoodAnalysisException e){
                Assert.assertEquals("Enter valid message",e.getMessage());
            }
        }
    }

