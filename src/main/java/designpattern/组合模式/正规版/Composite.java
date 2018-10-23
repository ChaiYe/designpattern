package designpattern.组合模式.正规版;

import java.util.ArrayList;
import java.util.List;

class Composite extends Component {



    private List<Component> children = new ArrayList<Component>();

    

    public Composite(String name) {

        super(name);

    }



    @Override
    public void Add(Component c) {

        children.add(c);

    }



    @Override
    public void Remove(Component c) {

        children.remove(c);

    }



    @Override

    public void Display(int depth) {

        String temp = "";

        for (int i = 0; i < depth; i++) 

            temp += '-';

        System.out.println(temp + name);

        

        for (Component c : children) {

            c.Display(depth + 2);

        }

    }

    

}