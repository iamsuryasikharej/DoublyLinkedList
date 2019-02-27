import java.sql.SQLOutput;

public class LinkedList {
    private Node head;
    public void addItem(int item){
            Node node=new Node();
            if (head==null) {
                head=node;
                head.data=item;
                head.nextNode=null;
                head.previousNode=null;
//                System.out.println(item+"added");
            }
            else{
                Node n=head;
                while(n.nextNode!=null){
                    n=n.nextNode;
                }
                n.nextNode=node;
                node.data=item;
                node.previousNode=n;

            }
        }

    public void printItem() {
        Node n = head;

        while (n.nextNode != null) {
            System.out.println(n.data);
            n=n.nextNode;
        }
        System.out.println(n.data);
    }
    public void printBackwards()
    {
        Node n=head;
        while(n.nextNode!=null){
            n=n.nextNode;
        }
        Node b=n;
        while(b.previousNode!=null){
            System.out.println(b.data);
            b=b.previousNode;
        }
        System.out.println(b.data);
    }

}
