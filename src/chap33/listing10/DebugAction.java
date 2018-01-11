package chap33.listing10;

jmiCut.addActionListener(this);  
jmiCopy.addActionListener(this);  
jmiPaste.addActionListener(this); 

// Create a Debug tool bar. 
JToolBar jtb = new JToolBar("Debug"); 
 
// Load the images. 
ImageIcon set = new ImageIcon("setBP.gif"); 
ImageIcon clear = new ImageIcon("clearBP.gif"); 
ImageIcon resume = new ImageIcon("resume.gif"); 
 
// Create the tool bar buttons. 
JButton jbtnSet = new JButton(set); 
jbtnSet.setActionCommand("Set Breakpoint"); 
jbtnSet.setToolTipText("Set Breakpoint"); 
 
JButton jbtnClear = new JButton(clear);  
jbtnClear.setActionCommand("Clear Breakpoint"); 
jbtnClear.setToolTipText("Clear Breakpoint"); 
 
JButton jbtnResume = new JButton(resume); 
jbtnResume.setActionCommand("Resume"); 
jbtnResume.setToolTipText("Resume"); 
 
// Add the buttons to the toolbar. 
jtb.add(jbtnSet); 
jtb.add(jbtnClear); 
jtb.add(jbtnResume); 
 
// Add the tool bar to the north position of 
// the content pane. 
jfrm.add(jtb, BorderLayout.NORTH);

// Add the tool bar action listeners. 
jbtnSet.addActionListener(this); 
jbtnClear.addActionListener(this); 
jbtnResume.addActionListener(this);

// A class to create an action for the Debug menu 
// and tool bar. 
class DebugAction extends AbstractAction { 
  public DebugAction(String name, Icon image, int mnem, 
                    int accel, String tTip) { 
    super(name, image); 
    putValue(ACCELERATOR_KEY, 
             KeyStroke.getKeyStroke(accel,  
                                    InputEvent.CTRL_DOWN_MASK));  
    putValue(MNEMONIC_KEY, mnem); 
    putValue(SHORT_DESCRIPTION, tTip); 
  } 
 
  // Handle events for both the tool bar and the 
  // Debug menu. 
  public void actionPerformed(ActionEvent ae) {     
    String comStr = ae.getActionCommand();  
 
    jlab.setText(comStr + " Selected"); 
 
    // Toggle the enabled status of the 
    // Set and Clear Breakpoint options. 
    if(comStr.equals("Set Breakpoint")) { 
      clearAct.setEnabled(true); 
      setAct.setEnabled(false); 
    } else if(comStr.equals("Clear Breakpoint")) { 
      clearAct.setEnabled(false); 
      setAct.setEnabled(true); 
    } 
  } 
}
