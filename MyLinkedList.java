public class MyLinkedList{
  private int size;
  private Node start,end;
  public MyLinkedList(int size, Node start, Node end){
    size=size;
    start=start;
    end=end;
  }
  public int size(){
    return size;
  }
  public boolean add(int value){
    Node before=end.prev;
    end= new Node(value,null,before);
  }
  public String toString(){
    String value="";
    Node current=start;
    while(current .next!=null){
      value+=current.data;
    }
  }
}
