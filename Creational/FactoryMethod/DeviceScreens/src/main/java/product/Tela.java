package product;

public abstract class Tela {
    protected String backgroundColor;
    private String messageText;

    public Tela(String backgroundColor, String messageText) {
        this.backgroundColor = backgroundColor;
        this.messageText = messageText;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }
    public String getMessageText() {
        return messageText;
    }
}