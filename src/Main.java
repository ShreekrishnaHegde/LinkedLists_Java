 public class Main {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(3);
        list.insertFirst(8);
        list.insertLast(11);
        list.insertLast(15);
        list.insert(1000,2);
        list.display();
        list.deleteLast();
        list.display();
        list.delete(3);
        list.display();



    }


}
 /*
->Not continuous memory allocation
->New item can be added anywhere in the memory
--Singly linked list--
->Every element has info. about next element.(crush ex.)
->Head is the reference variable that points to the first element of the linked list.
->Tail is the reference variable that points to the last element of the linked list.
  */