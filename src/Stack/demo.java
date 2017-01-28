package Stack;

/**
 * Created by venkata_kalluri on 1/27/2017.
 */
public class demo {
    public static void main(String[] args){
        stack s=new stack();
        s.push("bye");
        s.push("hi");
        s.push(10);

        System.out.println(s.peek());

        System.out.println(s);

        System.out.println(s.pop());

        System.out.println(s);
    }

}
