import dev.annVald.javarush.quest.Node;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NodeTest {
    public static Node node;

    @BeforeAll
    public static void setNode(){
        node = new Node(7);
        node.setText("story text");
        node.setPicture("picture");
        node.getOption1().setTextForChoice("option1 text");
        node.getOption1().setNextNodeId(11);
        node.getOption2().setTextForChoice("option2 text");
        node.getOption2().setNextNodeId(12);

    }

    @Test
    public void testGetId(){
        int expected = 7;
        assertEquals(expected,node.getId());
    }
    @Test
    public void testGetText(){
        String expected = "story text";
        assertEquals(expected, node.getText());
    }
    @Test
    public void testSetText(){
        String expected ="new story";
        node.setText(expected);
        assertEquals(expected, node.getText());
    }

    @Test
    public void testGetOption1Text(){
        String expected = "option1 text";
        assertEquals(expected,node.getOption1Text());
    }
 @Test
    public void testGetOption2Text(){
     String expected = "option2 text";
     assertEquals(expected,node.getOption2Text());
 }

 @Test
    public void testGetNextNodeIdForOption1(){
        int expected =11;
        assertEquals(expected,node.getNextNodeIdForOption1());
    }
    @Test
    public void testGetNextNodeIdForOption2(){
        int expected =12;
        assertEquals(expected,node.getNextNodeIdForOption2());
    }
    @Test
    public void testGetOption1(){
        Node.Option expected = new Node(1).new Option();
        expected.setNextNodeId(11);
        expected.setTextForChoice("option1 text");
        assertEquals(expected, node.getOption1());
    }
    @Test
    public void testGetOption2(){
        Node.Option expected = new Node(1).new Option();
        expected.setNextNodeId(12);
        expected.setTextForChoice("option2 text");
        assertEquals(expected, node.getOption2());
    }
    @Test
    public void testGetPicture(){
        String expected = "picture";
        assertEquals(expected,node.getPicture());
    }
    @Test
    public void testSetPicture(){
        node.setPicture("new picture");
        assertEquals("new picture",node.getPicture());
    }
    @Test
    public void testSetAndtGetTextForChoice(){
        Node.Option option = new Node(1).new Option();
        String expected ="option text";
        option.setTextForChoice(expected);
        assertEquals(expected,option.getTextForChoice());
    }
    @Test
    public void testSetAndGetNextNodeId(){
        Node.Option option = new Node(1).new Option();
        int expected =12;
        option.setNextNodeId(expected);
        assertEquals(expected,option.getNextNodeId());
    }
    @Test
    public void testNodeEqualsWhenTrue(){
        Node compareNode = new Node(7);
        compareNode.setText("story text");
        compareNode.setPicture("picture");
        compareNode.getOption1().setTextForChoice("option1 text");
        compareNode.getOption1().setNextNodeId(11);
        compareNode.getOption2().setTextForChoice("option2 text");
        compareNode.getOption2().setNextNodeId(12);
        assertTrue(node.equals(compareNode));
    }

    @Test
    public void testNodeEqualsWhenFalse(){
        Node compareNode = new Node(9);
        compareNode.setText("story text");
        compareNode.setPicture("picture");
        compareNode.getOption1().setTextForChoice("option3 text");
        compareNode.getOption1().setNextNodeId(11);
        compareNode.getOption2().setTextForChoice("option2 text");
        compareNode.getOption2().setNextNodeId(12);
        assertFalse(node.equals(compareNode));
    }

    @Test
    public void testOptionEqualsWhenTrue(){
        Node.Option compareOption = new Node(8).new Option();
        compareOption.setTextForChoice("option1 text");
        compareOption.setNextNodeId(11);
        assertTrue(node.getOption1().equals(compareOption));
    }
    @Test
    public void testOptionEqualsWhenFalse(){
        Node.Option compareOption = new Node(8).new Option();
        compareOption.setTextForChoice("option8 text");
        compareOption.setNextNodeId(1);
        assertFalse(node.getOption1().equals(compareOption));
    }
    @Test
    public void testNodeEqualsWithSameObjects(){
        assertTrue(node.equals(node));
    }
    @Test
    public void testOptionEqualsWithSameObjects(){
        assertTrue(node.getOption1().equals(node.getOption1()));
    }
    @Test
    public void testNodeEqualsWithString(){
        String compare = "something";
        assertFalse(node.equals(compare));
    }
    @Test
    public void testOptionEqualsWithString(){
        String compare = "something";
        assertFalse(node.getOption1().equals(compare));
    }
    @Test
    public void testOptionEqualsNull(){
        assertFalse(node.getOption1().equals(null));
    }

    @Test
    public void testNodeHashCodeWhenObjectsAreEqual(){
        Node compareNode = new Node(7);
        compareNode.setText("story text");
        compareNode.setPicture("picture");
        compareNode.getOption1().setTextForChoice("option1 text");
        compareNode.getOption1().setNextNodeId(11);
        compareNode.getOption2().setTextForChoice("option2 text");
        compareNode.getOption2().setNextNodeId(12);
        Node compareNode2 = new Node(7);
        compareNode2.setText("story text");
        compareNode2.setPicture("picture");
        compareNode2.getOption1().setTextForChoice("option1 text");
        compareNode2.getOption1().setNextNodeId(11);
        compareNode2.getOption2().setTextForChoice("option2 text");
        compareNode2.getOption2().setNextNodeId(12);
        assertTrue(compareNode.hashCode()==compareNode2.hashCode());
    }

    @Test
    public void testOptionHashCodeWhenObjectsAreEqual(){
        Node.Option compareOption = new Node(8).new Option();
        compareOption.setTextForChoice("option1 text");
        compareOption.setNextNodeId(11);
        assertTrue(node.getOption1().hashCode()==compareOption.hashCode());
    }





}
