package DatsStructs;

public class LinkedListII{
    NodeII n;
    
    public LinkedListII(int data){
        n = new NodeII(data);
    }
    
    public void printList(){
        while(n != null){
            n.printNode();
            n=n.next;
        }
    }
    
    public void appendToEnd(int data){
        NodeII end = new NodeII(data);
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
        n.next.prev = n;
    }
    
    public void goToStart(){
        while(n.prev != null){
            n = n.prev;
        }
    }
    
    
    public static void main(String []args){
         
         
    	LinkedListII x = new LinkedListII(5);
        x.appendToEnd(10);
        x.appendToEnd(-1);
        x.appendToEnd(100);
        x.goToStart();
        x.printList();
     }
}