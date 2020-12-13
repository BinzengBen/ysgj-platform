package com.ysgj.food.platform.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DccpLogger {

    private final Logger logger;

    private DccpLogger(Class<?> clazz) {
        logger = LoggerFactory.getLogger(clazz);
    }

    private DccpLogger(String className) {
        logger = LoggerFactory.getLogger(className);
    }

    public static DccpLogger getLogger(Class<?> clazz) {
        return new DccpLogger(clazz);
    }

    public static DccpLogger getLogger(String className) {
        return new DccpLogger(className);
    }

    public void debug(String message) {
        if (logger.isDebugEnabled()) {
            logger.debug(message);
        }
    }

    public void debug(String message, Throwable t) {
        if (logger.isDebugEnabled()) {
            logger.debug(message, t);
        }
    }

    public void debug(String message, Object... obj) {
        if (logger.isDebugEnabled()) {
            logger.debug(message, obj);
        }
    }

    public void info(String message) {
        if (logger.isInfoEnabled()) {
            logger.info(message);
        }
        if (logger.isDebugEnabled()) {
            logger.debug(message);
        }
    }

    public void info(String message, Throwable t) {
        if (logger.isInfoEnabled()) {
            logger.info(message, t);
        }
        if (logger.isDebugEnabled()) {
            logger.debug(message, t);
        }
    }

    public void warn(String message) {
        if (logger.isWarnEnabled()) {
            logger.warn(message);
        }
        if (logger.isDebugEnabled()) {
            logger.debug(message);
        }
    }

    public void warn(String message, Throwable t) {
        if (logger.isWarnEnabled()) {
            logger.warn(message, t);
        }
        if (logger.isDebugEnabled()) {
            logger.debug(message, t);
        }
    }

    public void error(String message) {
        if (logger.isErrorEnabled()) {
            logger.error(message);
        }
        if (logger.isDebugEnabled()) {
            logger.debug(message);
        }
    }

    public void error(String message, Throwable t) {
        if (logger.isErrorEnabled()) {
            logger.error(message, t);
        }
        if (logger.isDebugEnabled()) {
            logger.debug(message, t);
        }
    }

}

