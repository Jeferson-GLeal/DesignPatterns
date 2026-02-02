package creator;

import product.SlackNotification;
import product.Notification;

public class SlackNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new SlackNotification();
    }
}
