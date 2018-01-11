package chap26.listing01;
// Demonstrate Labels.
import java.awt.*; 
import java.awt.event.*;
 
public class LabelDemo extends Frame { 
  public LabelDemo() { 

    // Use a flow layout.
    setLayout(new FlowLayout());

    Label one = new Label("One"); 
    Label two = new Label("Two"); 
    Label three = new Label("Three"); 
 
    // Add labels to frame.
    add(one); 
    add(two); 
    add(three); 

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  } 

  public static void main(String[] args) {
    LabelDemo appwin = new LabelDemo();

    appwin.setSize(new Dimension(300, 100));
    appwin.setTitle("LabelDemo");
    appwin.setVisible(true);
  } 
}
