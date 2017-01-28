package Queue;

/**
 * Created by venkata_kalluri on 1/27/2017.
 */
public class demo {
    public static void main(String[] args){
        queue q=new queue();
        q.enqueue("hi");
        q.enqueue("bye");
        q.enqueue(10);


        System.out.println(q);

        System.out.println(q.dequeue());

        System.out.println(q);
    }

}
