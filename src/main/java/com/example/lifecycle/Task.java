package com.example.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Task implements BeanPostProcessor {

    private static final Logger LOGGER = LoggerFactory.getLogger(Task.class);

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        LOGGER.info("Bean " + beanName + " został utworzony.");
        return bean;
    }
}
