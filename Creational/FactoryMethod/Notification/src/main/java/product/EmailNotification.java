package product;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Enviando notificação por Email.");
    }
}
