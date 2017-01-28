package doubleLinkedList;

/**
 * Created by venkata_kalluri on 1/27/2017.
 */
public class Node<T> {
    private T data;
    private Node<T> nextNode;
    private Node<T> prevNode;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<T> getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(Node<T> prevNode) {
        this.prevNode = prevNode;
    }

    public Node(T data){

        this.data=data;
    }

    public String toString(){
        return "DATA: "+this.data;
    }
}
