# testRnrUtils

## Basic Controller and 
```java
package dev.xethh.webtool.testRnrUtils.common;

public interface LoggerProvider{
    default Logger getLogger(){
        return LoggerFactory.getLogger(this.getClass());
    }
}

public interface BaseService extends LoggerProvider{
}

public interface BaseController extends LoggerProvider{
}
```
