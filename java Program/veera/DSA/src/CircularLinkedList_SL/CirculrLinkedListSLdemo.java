package CircularLinkedList_SL;
public class CirculrLinkedListSLdemo {
    public static void main(String[] args){
        CirculrLinkedListSLclass lst=new CirculrLinkedListSLclass();
        lst.insertAtBeginning(7);
        lst.insertAtBeginning(15);
        lst.insertAtLast(5);
        lst.insertAtPosition(3,3);
        lst.insertAtPosition(2,0);
        lst.deleteWithPosition(4);
//        lst.reverse();
        lst.display();
    }
}
