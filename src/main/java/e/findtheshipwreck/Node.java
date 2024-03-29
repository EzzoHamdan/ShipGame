
package e.findtheshipwreck;

public class Node {
    int shipNO; 
    Integer location;
    Node next;
    
    public Node(int shipNo, int location){
        this.shipNO=shipNo;
        this.location = location;
        next=null;
    }
    
}
