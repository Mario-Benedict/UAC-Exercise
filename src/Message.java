public abstract class Message {
    protected final ILogin login;
    protected final String sender;
    protected final String recipient;
    protected final String content;

    public Message(ILogin login, String sender, String recipient, String content) {
        this.login = login;
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
    }

    public void send(String username, String password) {
        return;
    }
}
