package chap26.listing7;

// Demonstrate Lists.  
import java.awt.*; 
import java.awt.event.*; 
 
public class ListDemo extends Frame implements ActionListener { 
  List os, browser; 
  String msg = ""; 
 
  public ListDemo() { 

    // Use a flow layout.
    setLayout(new FlowLayout());

    // Create a multi-selection list.
    os = new List(4, true); 

    // Create a single-selection list.
    browser = new List(4); 
 
    // Add items to os list.
    os.add("Windows"); 
    os.add("Android"); 
    os.add("Solaris"); 
    os.add("Mac OS"); 
 
    // Add items to browser list.
    browser.add("Internet Explorer"); 
    browser.add("Firefox"); 
    browser.add("Chrome"); 
 
    // Make initial selections.
    browser.select(1); 
    os.select(0);
 
    // Add lists to the frame.
    add(os); 
    add(browser); 
 
    // Add action listeners. 
    os.addActionListener(this); 
    browser.addActionListener(this); 

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  } 
 
  public void actionPerformed(ActionEvent ae) { 
    repaint(); 
  } 
 
  // Display current selections. 
  public void paint(Graphics g) { 
    int idx[]; 
 
    msg = "Current OS: "; 
    idx = os.getSelectedIndexes(); 
    for(int i=0; i<idx.length; i++) 
      msg += os.getItem(idx[i]) + "  "; 
    g.drawString(msg, 6, 120); 
    msg = "Current Browser: "; 
    msg += browser.getSelectedItem(); 
    g.drawString(msg, 6, 140); 
  } 

  public static void main(String[] args) {
    ListDemo appwin = new ListDemo();

    appwin.setSize(new Dimension(300, 180));
    appwin.setTitle("ListDemo");
    appwin.setVisible(true);
  } 
}
