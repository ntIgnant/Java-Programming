public abstract class Message {
    private String recipient;

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    // Method to be overriden
    public abstract int getSize();
}
