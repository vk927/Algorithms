package LinkedList;

/**
 * Created by venkata_kalluri on 1/27/2017.
 */
public class LinkedList<T> {
    private Node head;

    public void insert(T data){
        Node newN=new Node(data);
        if(head==null)
            head=newN;
        else{
            newN.setNextNode(head);
            head=newN;
        }
    }


    public void delete(){
        System.out.println("deleted node is "+this.head);
        this.head=this.head.getNextNode();
    }

    @Override
    public String toString(){
        String res="{ ";
        if(head==null){
            return "Nothing";

        }
        else{
            Node point=this.head;

            while(point.getNextNode()!=null){
                res+=point+"-> ";
                point=point.getNextNode();
            }

            res+=point+"}";
        }
        return res;
    }
}
