package creator;

import product.EmailNotification;
import product.Notification;

public class EmailNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
