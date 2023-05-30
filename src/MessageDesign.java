public interface MessageDesign <T> {
    String getFrom();
    String getTo();
    T getContent();
}
