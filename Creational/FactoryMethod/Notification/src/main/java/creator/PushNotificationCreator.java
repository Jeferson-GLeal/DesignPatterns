package creator;

import product.PushNotification;
import product.Notification;

public class PushNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
