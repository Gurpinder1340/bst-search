import static org.junit.jupiter.api.Assertions.*;

import java.net.IDN;

import org.junit.jupiter.api.Test;

public class BstSearchTest {
   @Test 
   void containValueInRoot() {
     BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);

     assertTrue(BstSearch.contains(root,10));

   }


  @Test 
  void ContainValueInLeftNode() {
    BinaryTreeNode<Integer> root = 
      new BinaryTreeNode<>(10,
        new BinaryTreeNode<>(5),
        new BinaryTreeNode<>(15));

        assertTrue(BstSearch.contains(root, 5));


  }
 
      
  }