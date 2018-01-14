package chap32.listing07;

import javax.swing.JButton;
import javax.swing.JPanel;

// Make the panels that will be added to the tabbed pane. 
class CitiesPanel extends JPanel { 
 
  public CitiesPanel() { 
    JButton b1 = new JButton("New York"); 
    add(b1); 
    JButton b2 = new JButton("London"); 
    add(b2); 
    JButton b3 = new JButton("Hong Kong"); 
    add(b3); 
    JButton b4 = new JButton("Tokyo"); 
    add(b4); 
  } 
} 
