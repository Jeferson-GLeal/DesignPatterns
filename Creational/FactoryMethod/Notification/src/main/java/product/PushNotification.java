package product;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Enviando notificação Push.");
    }
}
