package doubleLinkedList;

/**
 * Created by venkata_kalluri on 1/27/2017.
 */
public class DLinkedList<T> {
    private Node head;
    private Node tail;

    public void insert(T data){
        Node newN=new Node(data);
        if(head==null){
            this.head=newN;
            this.tail=newN;
        }
        else{
            newN.setNextNode(this.head);
            this.head.setPrevNode(newN);

            this.head=newN;
        }

    }


    public String reverseDisplay(){
        String res="{ ";
        if(tail==null){
            return res+"Nothing";
        }
        else{
            Node point =tail;
            while(point.getPrevNode()!=null){
                res+=point+"-> ";
                point=point.getPrevNode();

            }
            return res+point+"}";
        }
    }

    public void reverseLL(){
        if(head==null){
            System.out.println("Nothing");
        }
        else{
            Node current=this.head;
            Node tmp=null;
            while(current!=null){
                tmp=current.getPrevNode();
                current.setPrevNode(current.getNextNode());
                current.setNextNode(tmp);
                current=current.getPrevNode();
            }

            this.head=tmp.getPrevNode();
        }
    }

    @Override
    public String toString(){
        String res="{ ";
        if(head==null){
            return res+"Nothing }";
        }
        else{
            Node point= head;
            while(point.getNextNode()!=null){
                res+=point+"- >";
                point=point.getNextNode();

            }
            return res+point+" }";
        }
    }
}
