import java.util.ArrayList;
import java.util.List;

public class SequenceGenerator {
    public List<Integer> getList() {
        List<Integer> list = new ArrayList();
        for(int i = 1; i <= 100; i++) {
            list.add(i);
        }
        return list;
    }
}
