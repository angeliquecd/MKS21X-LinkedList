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
      size++;
      return true;
    }
    else{
    Node previously= end.prev();
    end= new Node(value,null,previously);
    size++;
    return true;}
  }
  public String toString(){
    Node current=start;
    String value="";
    while(current.next()!=null){
      value+=current.getData();
      current=current.next();
    }
    return value+current.toString();
  }
  public Integer get(int index){
//must add exceptions
return 4;
  }
  public Integer set(int index, int value){
//must add exceptions
return 4;
  }
  public boolean contains(Integer value){
    return true;
  }
  public int indexOf(Integer value){
    return 4;
  }
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
      data=0;
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
      String value=""+data;
      return value;
    }
  }

}
