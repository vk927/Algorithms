package Queue;

/**
 * Created by venkata_kalluri on 1/27/2017.
 */
public class queue<T> {
    private Node<T> root;
    private Node<T> tail;

    public void enqueue(T data){
        Node newN= new Node(data);
        if(root==null) {
            root = newN;
            tail=newN;
        }
        else{
            //Node tail2=tail;
            tail.setNextNode(newN);
            tail=newN;
        }

    }


    public T dequeue(){
        if(root==null)
            return null;
        else{
            T tmp=this.root.getData();
            this.root=this.root.getNextNode();
            return tmp;
        }
    }

    @Override
    public String toString(){
        String res="{ ";
        if(root==null)
            return res+"Nothing }";
        else{
            Node current=root;
            while(current.getNextNode()!=null){
                res+=current+"=> ";
                current=current.getNextNode();
            }
            return res+current+" }";
        }
    }

}
