import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<MessageDesign<T>> {

    private Map<String, List<T>> mailBox = new HashMap<>();


    @Override
    public void accept(MessageDesign<T> t) {

        List<T> statement = mailBox.get((t.getTo()));
        if (statement == null) {
            statement = new LinkedList<>();
            statement.add(t.getContent());
            mailBox.put(t.getTo(), statement);
        } else {
            statement.add(t.getContent());
        }
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }
}
