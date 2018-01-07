package chap33;
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

