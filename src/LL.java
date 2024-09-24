public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    //Inserting an element in singly linked list.
    //Moving the position of head and tail changes the structure of the linked list.
    //Hence, create a temp variable and use it instead of using head directly.

    /*
    --------Steps for inserting an element at thr first
    ->Create a new node object of Node class and pass the value that needs to be stored to the constructor.
    ->Add the newly created node to the existing list by pointing next reference variable of
        newly created node to the existing head
    -> Update the head to the newly added node.
    -> If tail is null, point it to the same object as head.
    ->Update the size of the linked list by incrementing it by 1.
    ->This adds the new node at the beginning of the linked list.
     */
    public void insertFirst(int val){
        Node node= new Node(val);
        node.next=head;
        head=node;
        if(tail==null)
            tail=head;
        size+=1;
    }
    /*
    --------Steps for inserting an element at the end of the linked list.
    ->Create a new node object of Node class and pass the value that needs to be stored to the constructor.
    ->Add the newly created node to the existing list by pointing the next reference variable of tail node to
        the newly created node.
    ->Update the tail to the new node inserted.
    ->If tail is null , call the insertFirst function.
     */
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node= new Node(val);
        tail.next=node;
        tail=node;
        size+=1;
    }

    public void insert(int val,int index){
            if(index==0)
                insertFirst(val);
            if(index==size)
                insertLast(val);
            Node temp=head;
            for (int i = 1; i < index; i++) {
                temp=temp.next;
            }
            Node node=new Node(val,temp.next);
            temp.next=node;
            size+=1;
    }

    public void deleteFirst(){
        head=head.next;
        if(head==null)
            tail=null;
        size--;
    }

    public Node get(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }

    public void deleteLast(){
        if(size<=1){
            deleteLast();
            return;
        }
        Node secondLast=get(size-2);
        tail=secondLast;
        tail.next=null;
    }

    public void delete(int index){
        if (index==0)
            deleteFirst();
        if(index==size-1)
            deleteLast();
        Node prev=get(index-1);
        prev.next=prev.next.next;
    }
    //To display the linked list.
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }


    private  class Node{
        //This reference variable holds the value of a node.
        private int value;
        //The reference variable next points to the object of Node type,
        private Node next;
        //These are the methods to access above private variables.
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        public Node(int value) {
            this.value = value;
        }
    }
}
