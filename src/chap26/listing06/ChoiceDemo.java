package chap26.listing06;

// Demonstrate Choice lists.  
import java.awt.*; 
import java.awt.event.*; 
 
public class ChoiceDemo extends Frame implements ItemListener { 
  Choice os, browser; 
  String msg = ""; 
 
  public ChoiceDemo() { 

    // Use a flow layout.
    setLayout(new FlowLayout());

    // Create choice lists.
    os = new Choice(); 
    browser = new Choice(); 
 
    // Add items to os list.
    os.add("Windows"); 
    os.add("Android"); 
    os.add("Solaris"); 
    os.add("Mac OS"); 
 
    // Add items to browser list.
    browser.add("Internet Explorer"); 
    browser.add("Firefox"); 
    browser.add("Chrome"); 
 
    // Add choice lists to window.
    add(os); 
    add(browser); 
 
    // Add item listeners. 
    os.addItemListener(this); 
    browser.addItemListener(this); 

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  } 
 
  public void itemStateChanged(ItemEvent ie) { 
    repaint(); 
  } 
 
  // Display current selections. 
  public void paint(Graphics g) { 
    msg = "Current OS: "; 
    msg += os.getSelectedItem(); 
    g.drawString(msg, 20, 120); 
    msg = "Current Browser: "; 
    msg += browser.getSelectedItem(); 
    g.drawString(msg, 20, 140); 
  } 

  public static void main(String[] args) {
    ChoiceDemo appwin = new ChoiceDemo();

    appwin.setSize(new Dimension(240, 180));
    appwin.setTitle("ChoiceDemo");
    appwin.setVisible(true);
  } 
}
