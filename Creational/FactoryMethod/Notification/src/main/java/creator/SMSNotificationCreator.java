package creator;

import product.SMSNotification;
import product.Notification;

public class SMSNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
