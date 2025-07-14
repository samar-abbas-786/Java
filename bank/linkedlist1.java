public class linkedlist1 {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void firstAdd(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
           

            newNode.next = head;
            head = newNode;
             return;
        }
    }

    public void addLast(String data) {

        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
           

            newNode.next = head;
            head = newNode;
             return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    public void printList() {
        Node currNode = head;
        while (currNode.next != null) {
            System.out.print(currNode.data+"-->");
            currNode = currNode.next;
        }
System.out.println("Null");    }

    public static void main(String[] args) {
        linkedlist1 list = new linkedlist1();

        list.firstAdd("a");
        list.firstAdd("is");
        list.printList();

    }

}
