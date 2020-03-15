package latihan3.defensivecopy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyDataStructure {
    List<String> list = new ArrayList<String>();

    public void add(String s) {
        list.add(s);
    }
    
    public List<String> getList() {
        return Collections.unmodifiableList(list);
    }
}