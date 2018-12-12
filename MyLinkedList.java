public class MyLinkedList{
  private int size;
  private Node start,end;
  public MyLinkedList(int size1, Node start1, Node end1){
    size=size1;
    start=start1;
    end=end1;
  }
  public int size(){
    return size;
  }

  public boolean add(int value){
    if (size==1){
    end= new Node(value,null,start);
    start= new Node(start.getData(),end,null);
    System.out.println(end.getData());
    size++;
    return true;}
    return true;
  }
  public String toString(){
    String value="done";
    Node current=start;
    while(current.getNext()!=null){
      value+=current.getData();
      current=current.getNext();
    }
    return value;
  }
}
