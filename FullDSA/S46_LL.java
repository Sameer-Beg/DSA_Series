package DSA_Series.FullDSA;

public class S46_LL {
    Node head ;
    // Node class
    class Node{
        String data ;
        Node next  ;
        //co ntructor
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    // add operation there  are two type of add op add first and last
    //add first
    public void addfirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //add lst
    public void addlast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        // travers
        Node curNode = head ;
        while (curNode.next != null){
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    // print list
    public void printlist(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node curNode = head ;
        while (curNode != null){
            System.out.print(curNode.data +"-->" );
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }

    // delete first
    public void deletefirst(){
        if(head == null){
            System.out.println("the list empty");
            return;
        }
        head = head.next;
    }
    //delete last
    public void deletelast(){
        if(head == null){
            System.out.println("empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secoundlast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secoundlast = secoundlast.next;
        }
        secoundlast.next = null;
    }

    public static void main(String[] args) {
        S46_LL list = new S46_LL();
        list.addfirst("a");
        list.addfirst("is");
        list.printlist();

        list.addlast("listlast" +
                "");
        list.printlist();

        list.deletefirst();
        list.printlist();

        list.deletelast();
        list.printlist();




    }
}
