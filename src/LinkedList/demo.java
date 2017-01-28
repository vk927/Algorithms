package LinkedList;

import java.util.List;

/**
 * Created by venkata_kalluri on 1/27/2017.
 */
public class demo {
    public static void main(String[] args){
        LinkedList ll=new LinkedList();

        ll.insert("a");
        ll.insert("b");
        ll.insert(1);
        ll.insert("c");

        System.out.println(ll);

        ll.delete();

        System.out.println(ll);
    }
}
