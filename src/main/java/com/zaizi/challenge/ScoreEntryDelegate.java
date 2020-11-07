package com.zaizi.challenge;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ScoreEntryDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String score = execution.getVariable("score").toString();
        System.out.println(score);
    }

}

