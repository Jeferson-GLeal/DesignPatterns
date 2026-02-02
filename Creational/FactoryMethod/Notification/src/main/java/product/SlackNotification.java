package product;

public class SlackNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Enviando notificação via Slack.");
    }
}
