package dev.xethh.webtool.testRnrUtils.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface LoggerProvider {
    default Logger getLogger(){
        return LoggerFactory.getLogger(this.getClass());
    }
}
