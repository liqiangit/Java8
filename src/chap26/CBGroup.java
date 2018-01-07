package chap26;
// Demonstrate check box group.  
import java.awt.*; 
import java.awt.event.*; 
 
public class CBGroup extends Frame implements ItemListener { 
  String msg = ""; 
  Checkbox windows, android, solaris, mac; 
  CheckboxGroup cbg; 
 
  public CBGroup() { 

    // Use a flow layout.
    setLayout(new FlowLayout());

    // Create a check box group.
    cbg = new CheckboxGroup(); 

    // Create the check boxes and include them
    // in the group.
    windows = new Checkbox("Windows", cbg, true); 
    android = new Checkbox("Android", cbg, false); 
    solaris = new Checkbox("Solaris", cbg, false); 
    mac = new Checkbox("Mac OS", cbg, false); 
 
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
    msg = "Current selection: "; 
    msg += cbg.getSelectedCheckbox().getLabel(); 
    g.drawString(msg, 20, 120); 
  } 

  public static void main(String[] args) {
    CBGroup appwin = new CBGroup();

    appwin.setSize(new Dimension(240, 180));
    appwin.setTitle("CBGroup");
    appwin.setVisible(true);
  } 
}

