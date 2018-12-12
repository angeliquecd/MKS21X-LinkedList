public class Driver{
  public static void main(String[] args){
    Node start = new Node(4,null,null);
    MyLinkedList listy = new MyLinkedList(1,start,start);
    listy.add(6);
    System.out.println(listy.toString());
  }
}
