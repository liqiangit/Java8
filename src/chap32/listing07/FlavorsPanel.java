package chap32.listing07;

import javax.swing.JComboBox;
import javax.swing.JPanel;

class FlavorsPanel extends JPanel { 
 
  public FlavorsPanel() { 
    JComboBox<String> jcb = new JComboBox<String>(); 
    jcb.addItem("Vanilla"); 
    jcb.addItem("Chocolate"); 
    jcb.addItem("Strawberry"); 
    add(jcb); 
  } 
}
