package chap32.listing07;

import java.awt.FlowLayout;

// Demonstrate JTabbedPane. 
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities; 
 
public class JTabbedPaneDemo { 
 
  public JTabbedPaneDemo() { 
 
    // Set up the JFrame.
    JFrame jfrm = new JFrame("JTabbedPaneDemo");
    jfrm.setLayout(new FlowLayout());
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrm.setSize(400, 200); 

    // Create the tabbed pane.
    JTabbedPane jtp = new JTabbedPane(); 
    jtp.addTab("Cities", new CitiesPanel()); 
    jtp.addTab("Colors", new ColorsPanel()); 
    jtp.addTab("Flavors", new FlavorsPanel()); 
    jfrm.add(jtp); 

    // Display the frame.
    jfrm.setVisible(true);
  } 

  public static void main(String[] args) { 

    // Create the frame on the event dispatching thread.
    SwingUtilities.invokeLater( 
      new Runnable() { 
        public void run() { 
          new JTabbedPaneDemo(); 
        } 
      } 
    ); 
  }
} 
