package Queue;

/**
 * Created by venkata_kalluri on 1/27/2017.
 */
public class Node<T> {
    private T data;
    private Node nextNode;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node(T data){
        this.data=data;

    }

    @Override
    public String toString(){
        return "Data: "+this.data;
    }
}
