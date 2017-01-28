package doubleLinkedList;

/**
 * Created by venkata_kalluri on 1/27/2017.
 */
public class demo {
    public static void main(String[] args){
        DLinkedList dll=new DLinkedList();
        dll.insert(10);
        dll.insert("ABC");
        dll.insert("xyz");
        dll.insert(90);

        System.out.println(dll);

//        System.out.println(dll.reverseDisplay());
//
//        System.out.println(dll);


        dll.reverseLL();

        System.out.println(dll);
    }

}
