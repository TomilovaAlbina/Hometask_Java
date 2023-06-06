import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<MessageDesign<T>> {
    public static class OverriddenHashMap<Key, Value> extends HashMap<Key, Value> {
        @Override
        public Value get(Object key) {
            Value statement;
            statement = super.get(key);
            try {
                if (statement == null) {
                    statement = (Value) new LinkedList <> ();
                }
            } catch (ClassCastException e) {
                throw new RuntimeException(e);
            }
            return statement;
        }
    }

    private final Map<String, List<T>> mailBox;

    public MailService() {
        mailBox = new OverriddenHashMap<>();
    }


    @Override
    public void accept(MessageDesign<T> t) {
        List<T> statement = mailBox.get((t.getTo()));
        statement.add(t.getContent());
        mailBox.put(t.getTo(), statement);
    }


    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }
}
