package com.zaizi.challenge;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ScoreEntryDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String score = execution.getVariable("score").toString();
        Logger logger = LoggerFactory.getLogger(ScoreEntryDelegate.class);
        logger.info("Score: {}", score);
    }

}

