public class Salary implements MessageDesign<Integer> {
    private String fromAddress;
    private String toAddress;
    private Integer content;

    public Salary(String fromAddress, String toAddress, Integer content) {
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.content = content;
    }

    @Override
    public String getFrom() {
        return fromAddress;
    }

    @Override
    public String getTo() {
        return toAddress;
    }

    @Override
    public Integer getContent() {
        return content;
    }
}
