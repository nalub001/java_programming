package chapter18;

public class LinkedList {
    Node head;
    public static void main(String[] args){
        LinkedList iList = new LinkedList();

        iList = insert(iList, 1);
        iList = insert(iList, 19);
        printList(iList);

    }

    public static LinkedList insert(LinkedList list, int data){

        //create a new node with given data
        Node newNode = new Node(data);
        newNode.next = null;

        if(list.head == null){
            list.head = newNode;
        } else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }

    public static void deleteNode(LinkedList list, int position){
        if(list.head == null){
            return;
        }

        Node temp = list.head;

        if(position == 0){
            list.head = temp.next;
            return;
        }

        for(int i=0; temp != null && i<position-1; i++){
            temp = temp.next;
        }

        if(temp == null || temp.next == null)
            return;

        Node next = temp.next.next;
        temp.next = next;
    }
    public static void printList(LinkedList list){

        Node currNode = list.head;

        while(currNode != null){
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
        }
    }

    public static void push(LinkedList list, int data){
        Node newNode = new Node(data);
        newNode.next = list.head;
        list.head = newNode;
    }
}
