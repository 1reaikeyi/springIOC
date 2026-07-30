package a7spring_p_c_util;

import java.util.List;

public class Server {
    private List<String> order;

    public void setOrder(List<String> order) {
        this.order = order;
    }
    public void printAll() {
        for(String str : order) {
            System.out.println(str);
        }
    }
}
