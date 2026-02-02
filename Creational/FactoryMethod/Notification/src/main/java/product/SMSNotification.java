package product;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Enviando notificação por SMS.");
    }
}
