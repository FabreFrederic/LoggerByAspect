package com.fabrefrederic.service;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class MyService {
    private final Logger LOGGER = Logger.getLogger(getClass());

    public void myFirstMethodLogDate() {
        LOGGER.info(new Date());
    }

    public void mySecondMethodWithTwoArgs(final String text, final Integer number) {
        LOGGER.info(text);
        LOGGER.info(number);
    }
}