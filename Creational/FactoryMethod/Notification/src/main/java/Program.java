import creator.*;
import product.Notification;

public class Program {
    public static void main(String[] args) {
        NotificationCreator emailCreator = new EmailNotificationCreator();
        NotificationCreator smsCreator = new SMSNotificationCreator();
        NotificationCreator pushCreator = new PushNotificationCreator();
        NotificationCreator slackCreator = new SlackNotificationCreator();

        emailCreator.createNotification().notifyUser();
        smsCreator.createNotification().notifyUser();
        pushCreator.createNotification().notifyUser();
        slackCreator.createNotification().notifyUser();
    }
}
