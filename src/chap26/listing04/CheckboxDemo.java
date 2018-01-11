package chap26.listing04;

// Demonstrate check boxes.  
import java.awt.*; 
import java.awt.event.*; 
 
public class CheckboxDemo extends Frame implements ItemListener { 
  String msg = ""; 
  Checkbox windows, android, solaris, mac; 
 
  public CheckboxDemo() { 

    // Use a flow layout.
    setLayout(new FlowLayout());

    // Create check boxes.
    windows = new Checkbox("Windows", true); 
    android = new Checkbox("Android"); 
    solaris = new Checkbox("Solaris"); 
    mac = new Checkbox("Mac OS"); 

    // Add the check boxes to the frame.
    add(windows); 
    add(android); 
    add(solaris); 
    add(mac); 
 
    // Add item listeners.
    windows.addItemListener(this); 
    android.addItemListener(this); 
    solaris.addItemListener(this); 
    mac.addItemListener(this); 

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  } 
 
  public void itemStateChanged(ItemEvent ie) { 
    repaint(); 
  } 
 
  // Display current state of the check boxes. 
  public void paint(Graphics g) { 
    msg = "Current state: "; 
    g.drawString(msg, 20, 120); 
    msg = "   Windows: " + windows.getState(); 
    g.drawString(msg, 20, 140); 
    msg = "   Android: " + android.getState(); 
    g.drawString(msg, 20, 160); 
    msg = "   Solaris: " + solaris.getState(); 
    g.drawString(msg, 20, 180); 
    msg = "   Mac OS: " + mac.getState(); 
    g.drawString(msg, 20, 200); 
  } 

  public static void main(String[] args) {
    CheckboxDemo appwin = new CheckboxDemo();

    appwin.setSize(new Dimension(240, 220));
    appwin.setTitle("CheckboxDemo");
    appwin.setVisible(true);
  } 
}
