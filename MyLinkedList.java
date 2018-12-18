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
      return true;}
    else{//for all the rest
      Node last = end;//saves penultimate value
      end=new Node(value, null, last);//sets up last element
      last.setNext(end);//bridges penultimate and last
      size++;
      return true;}
  }
  public String toString(){
    Node current=start;
    String value="[";
    if (size>0){
    while(current.next()!=null){
      value+=current.toString()+", ";
      current=current.next();
    }
    return value+current.toString()+"]";}
    return value+"]";
  }
private Node getNthnode(int index){
    try{
    if (index<0 || index>=size) throw new IllegalArgumentException();//exception handled

    Node thatone= start;//loops through until it finds the index
    //this would be for the starting index (thatone index =0)
    for (int i=0;i<index;i++){
      thatone=thatone.next();
    }
    return thatone;
  }
    catch (IllegalArgumentException e){
      System.out.println("That getNthnode index is out of bounds.");
    //  System.exit(1);
    }
    return null;//should not happen
  }
public Integer get(int index){//identical to getNthnode but returns data
    try{
    if (index<0 || index>=size) throw new IllegalArgumentException();
    Node thatone= start;
    for (int i=0;i<index;i++){
      thatone=thatone.next();}//loops through by index
    return thatone.getData();
  }
    catch (IllegalArgumentException e){
      System.out.println("That get index is out of bounds.");
      }
      return -1;//should not happen
  }
public void clear(){
  start=new Node();
  end=start;
//  start.setData(null);
  size=0;
}

public Integer set(int index, int value){
  //must add exceptions
  try{
  if (index>size||index<0) throw new IllegalArgumentException();
  Node workingwith= this.getNthnode(index);//finds node to work with
  int oldata=workingwith.getData();//saves olddata for return
  workingwith.setData(value);//sets data to new value
  return oldata;}//returns old value
  catch (IllegalArgumentException e){//eror handling
  System.out.println("That set index is out of bounds.");
  //  e.printStackTrace();
  }
  return -1;//should not happen
  }

  public boolean contains(Integer value){
    for (int i=0;i<size;i++){
    if (this.get(i)==value) return true;}
    return false;
  }
  public int indexOf(Integer value){
      for (int i =0;i<size;i++){
        if (value==this.get(i)) return i;
      }
      return -1;
      }
  public void add (int index, Integer value){
    //special cases for start and end
    try{
    if (index>size||index<0) throw new IllegalArgumentException();
    if (index==0){
      Node next= start;
      start= new Node(value,next,null);
      next.setPrev(start);
      size++;}
    if (index==size-1){
      this.add(value);}
    if (index!=0&& index!=size-1){
      Node next=this.getNthnode(index);
      Node before=next.prev();
      Node addition= new Node(value, next, before);
      before.setNext(addition);
      next.setPrev(addition);
      size++;
    }
    }
    catch (IllegalArgumentException e){//eror handling
      System.out.println("That set index is out of bounds.");}
  }
  public void remove(int index){
    int toreturn = -1;//should never return this
    try{
      if (index>size||index<0) throw new IllegalArgumentException();//error handling
      if (index==0){//special case for start
       Node next= start.next();
      toreturn = start.getData();
       start=next;//sets start to one after
       next.setPrev(null);
      }
      if (index==size-1){//special case for end
      toreturn= end.getData();
      Node penultimate = end.prev();//sets end to one before
      end=penultimate;

      penultimate.setNext(null);}
      if (index!=0 && index!=size-1){//otherwise
    Node todelete= this.getNthnode(index);
    toreturn= todelete.getData();
    Node before = todelete.prev();
    Node after = todelete.next();
    before.setNext(after);
    after.setPrev(before);}
    size--;//reduces size
  }
  catch (IllegalArgumentException e){//eror handling
    System.out.println("That remove index is out of bounds.");}
    System.out.println(""+toreturn);
  }

  public boolean remove (Integer value){
    int index = this.indexOf(value);
    if (index==-1) return false;
    Node todelete=this.getNthnode(index);
    if (index==0){//special case for start
         Node next= start.next();
        int toreturn = start.getData();
         start=next;//sets start to one after
         next.setPrev(null);
        }
    if (index==size-1){//special case for end
        int toreturn= end.getData();
        Node penultimate = end.prev();//sets end to one before
        end=penultimate;
        penultimate.setNext(null);}
    if (index!=0&& index!=size-1){//otherwise
      int toreturn= todelete.getData();
      Node before = todelete.prev();
      Node after = todelete.next();
      before.setNext(after);
      after.setPrev(before);}
    size--;//reduces size
    return true;
  }
public void extend(MyLinkedList other){//exteends the list onto this
      end.setNext(other.start);
      other.start.setPrev(end);//links them
      end=other.end;//creates new end
      size+=other.size;//resets size
      other.size=0;//honestly not sure why it does this
      MyLinkedList mover= new MyLinkedList();
      other=mover;
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
