import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class LinkedListTest {

  LinkedList list = new LinkedList("head node");


  @Test
  public void testHeadNode(){
    assertEquals("head node", list.head.data);
  }

  @Test
  public void testInsertNode(){
    list.insert("node 1");
    assertEquals("node 1", list.head.next.data);
  }

  @Test
  public void testFindNode(){
    list.insert("node 1");
    list.insert("node 2");
    assertEquals("node 2", list.find("node 2").data );
  }

  @Test
  public void testUpdateNode(){
    list.insert("node 1");
    list.insert("node 2");
    list.update("node 2", "node updated");
    assertEquals("node updated",list.find("node updated").data );
  }

  @Test
  public void testFindParent(){
    list.insert("node 1");
    list.insert("node 2");
    assertEquals("node 1", list.findParent("node 2").data);
  }

  @Test
  public void testDeleteNode(){
    list.insert("node 1");
    list.insert("node 2");
    list.delete("node 2");
    assertEquals(list.find("node 2"), null);
  }

  @Test 
  public void testPopNode(){
    list.insert("node 1");
    list.insert("node 2");
    Node poppedNode = list.pop();
    assertEquals("node 2", poppedNode.data);
    assertEquals(null, list.find("node 2"));
  }

  @Test
  public void testTailNode(){
    list.insert("node 1");
    list.insert("node 2");
    list.insert("node 3");
    Node tailNode = list.tail();
    assertEquals("node 3", tailNode.data);
  }


}