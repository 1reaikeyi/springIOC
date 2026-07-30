package eResource;

import org.springframework.stereotype.Component;

@Component
public class One implements  Resouse{
    @Override
    public void save() {
        System.out.println("save保存");
    }
}
