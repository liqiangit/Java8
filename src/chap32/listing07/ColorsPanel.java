package chap32.listing07;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

class ColorsPanel extends JPanel { 
 
  public ColorsPanel() { 
    JCheckBox cb1 = new JCheckBox("Red"); 
    add(cb1); 
    JCheckBox cb2 = new JCheckBox("Green"); 
    add(cb2); 
    JCheckBox cb3 = new JCheckBox("Blue"); 
    add(cb3); 
  } 
} 
