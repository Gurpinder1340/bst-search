import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
 @Test 
 void ContainsValueInRoot() {
    BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);

    assertTrue(BstSearch.contains(root,10));
 }


   
  

}
