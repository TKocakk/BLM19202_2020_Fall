/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

/**
 *
 * @author Tugce Kocak
 */
public class StackList<T> {

    Node<T> head;

    void push(T data) {
        Node<T> newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    T pop(){
        if(head==null){
            System.out.println("Empty Stack!");
            return null;
        }else{
            T data=head.data;
            head=head.next;
            return data;
        }
    }
    T peek(){
        if(head==null){
            return null;
        }else{
            return head.data;
        }
    }
    int size(){
        int size=0;
        Node <T> temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    void print(){
        Node <T> temp=head;
        while(temp!=null){
            System.out.print(temp.data +" ->");
            temp=temp.next;
        }
    }
    static StackList reverseStack(StackList stack){
        StackList reversed=new StackList();
        while(!stack.isEmpty()){
            reversed.push(stack.pop());
        }
        return reversed;
    }
    public static void main(String[] args) {
        StackList <String> s=new StackList();
        s.push("masa");
        s.push("sıra");
        s.push("koltuk");
        s.push("sandalye");
        s.push("telefon");
        s.push("sehpa");
        s.push("yastık");
        s.push("yatak");
        s.print();
        System.out.println("");
        System.out.println("Reversed: ");
        StackList reverse=reverseStack(s);
        reverse.print();
    }

    private boolean isEmpty() {
        return head==null;
    }
}
