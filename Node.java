public class Node{
  private int data;
  private Node next, prev;
  public Node (int data1, Node next1, Node prev1){
    data=data1;
    next=next1;
    prev=prev1;
  }
  public int getData(){
    return data;
  }
  public Node getNext(){
    return next;
  }
  public Node getPrev(){
    return prev;
  }
}
