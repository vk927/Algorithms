package Stack;

/**
 * Created by venkata_kalluri on 1/27/2017.
 */
public class stack<T> {
    private Node<T> root;

    public void push(T data){
        Node newN=new Node(data);
        if(root==null)
            root=newN;
        else{
            newN.setNextNode(this.root);
            this.root=newN;
        }

    }


    public T peek(){
        if(root!=null)
            return  this.root.getData();
        else
            return null;
    }
    public T pop(){
        T tmp=root.getData();
        this.root=this.root.getNextNode();
        return tmp;
    }

    @Override
    public String toString(){
        String res="{ ";
        if(this.root==null)
            return res+"Nothing }";
        else{
            Node point=this.root;
            while(point.getNextNode()!=null){
                res+=point+"-> ";
                point=point.getNextNode();
            }
            return res+point+"}";
        }
    }
}
