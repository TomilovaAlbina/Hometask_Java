public class MailMessage {
    private String fromAddress;
    private String toAddress;
    private String content;


    public MailMessage(String fromAddress, String toAddress, String content) {
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.content = content;
    }

    public String getFrom() {
        return fromAddress;
    }

    public String getTo() {
        return toAddress;
    }

    public String getContent() {
        return content;
    }
}
