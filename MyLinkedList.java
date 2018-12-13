public class MyLinkedList{
  private int size;
  private Node start,end;
  public MyLinkedList(){
    size=0;
    start=new Node();
    end=start;
  }
  public int size(){
    return size;
  }

  public boolean add(Integer value){
    if (size==0){//special case
      start=new Node(value, null, null);
      end=start;
      return true;
    }
    else{
    Node previously= end.prev();
    end= new Node(value,null,);
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
  public Integer get(int index){
//must add exceptions
  }
  public Integer set(int index, int value){
//must add exceptions
  }
  public boolean contains(Integer value){}
  public int indexOf(Integer value){}
  public void add (int index, Integer value){
    //special cases for start and end
  }
  public void remove(int index, Integer value){
    //special case for start and end
  }
  private class Node{
    private int data;
    private Node next, prev;
    public Node (int data1, Node next1, Node prev1){
      data=data1;
      next=next1;
      prev=prev1;
    }
    public Node(){
      data=null;
      next=null;
      prev=null;
    }
    public int getData(){
      return data;
    }
    private Node next(){
      return next;
    }
    private Node prev(){
      return prev;
    }
    public void setData(int data1){
      data=data1;
    }
    private void setNext (Node other){
      next=other;
    }
    public void setPrev(Node other){
      prev=other;
    }
    public String toString(){
      value=""+data;
      return value;
    }
  }

}
