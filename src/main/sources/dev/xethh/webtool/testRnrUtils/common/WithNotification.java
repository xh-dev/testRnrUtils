package dev.xethh.webtool.testRnrUtils.common;

public interface WithNotification {
    interface NotificationContent {}
    boolean notify(NotificationContent item);
}
