package chap26.listing02;

// Demonstrate Buttons. 
import java.awt.*; 
import java.awt.event.*; 
 
public class ButtonDemo extends Frame implements ActionListener { 
  String msg = ""; 
  Button yes, no, maybe; 
 
  public ButtonDemo() { 

    // Use a flow layout.
    setLayout(new FlowLayout());

    // Create some buttons.
    yes = new Button("Yes"); 
    no = new Button("No"); 
    maybe = new Button("Undecided"); 
 
    // Add them to the frame.
    add(yes); 
    add(no); 
    add(maybe); 
 
    // Add action listeners for the buttons.
    yes.addActionListener(this); 
    no.addActionListener(this); 
    maybe.addActionListener(this); 

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  } 

  // Handle button action events. 
  public void actionPerformed(ActionEvent ae) { 
    String str = ae.getActionCommand(); 
    if(str.equals("Yes")) { 
      msg = "You pressed Yes."; 
    } 
    else if(str.equals("No")) { 
      msg = "You pressed No."; 
    } 
    else { 
      msg = "You pressed Undecided."; 
    } 
 
    repaint(); 
  } 
 
  public void paint(Graphics g) { 
     g.drawString(msg, 20, 100); 
  } 

  public static void main(String[] args) {
    ButtonDemo appwin = new ButtonDemo();

    appwin.setSize(new Dimension(250, 150));
    appwin.setTitle("ButtonDemo");
    appwin.setVisible(true);
  } 
}
