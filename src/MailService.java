import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<MailMessage> {

    private Map<T, List<T>> mailBox = new HashMap<>();

    public Map<T, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(MailMessage t) {
        if (mailBox.containsKey(t.getTo)) {
            List<T> statement = mailBox.get((t.getTo));
            mailBox.put(t.getTo, statement);
        }

    }
}
