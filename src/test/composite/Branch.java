package test.composite;

import java.util.ArrayList;
import java.util.List;

public class Branch  implements  Component{

    String name = "";

    public Branch(String name) {
        this.name = name;
    }

    List<Component> child = new ArrayList<>();

    @Override
    public void dispaly(int i) {
        System.out.println("this is a brach "+i +" name = "+name);
        child.forEach(e->e.dispaly(i+1));
    }


    public void addChild(Component c){
        child.add(c);
    }
    public void removeChild(Component c){
        child.remove(c);
    }
}
