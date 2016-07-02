public class LinkList {
  public Node head;

  public LinkList(String data) {
    this.head = new Node(data);
  }
  public void insert(String data) {
    if (this.head.next == null) {
      this.head.next = new Node(data);
    } else {
      insert(data, this.head);
    }
  } 
  private void insert(String data, Node currentNode) {
    if (currentNode.next == null) {
      currentNode.next = new Node(data);
    } else {
      insert(data, currentNode.next);
    }
  }
  







  public void print() {
    System.out.println(this.head.data);

    if (this.head.next != null){
      print(this.head.next);
    }
  }

  private void print(Node currentNode) {
    System.out.println(currentNode.data);

    if (currentNode.next != null){
      print(currentNode.next);
    }
  }

  public static void main(String args[]){
    LinkList list = new LinkList("head node");
  
    list.insert("node 1"); 
    list.insert("node 2");
    list.insert("node 3");

    list.print();
  }
}