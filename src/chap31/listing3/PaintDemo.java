package chap31.listing3;
 
// Demonstrate painting directly onto a panel. 
class PaintDemo { 
 
  JLabel jlab; 
  PaintPanel pp; 
 
  PaintDemo() { 
 
    // Create a new JFrame container. 
    JFrame jfrm = new JFrame("Paint Demo"); 
   
    // Give the frame an initial size.   
    jfrm.setSize(200, 150);   
   
    // Terminate the program when the user closes the application. 
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
   
    // Create the panel that will be painted. 
    pp = new PaintPanel(); 
 
    // Add the panel to the content pane.  Because the default 
    // border layout is used, the panel will automatically be 
    // sized to fit the center region. 
    jfrm.add(pp);    
 
    // Display the frame.   
    jfrm.setVisible(true);   
  }   
    
  public static void main(String args[]) {   
    // Create the frame on the event dispatching thread.   
    SwingUtilities.invokeLater(new Runnable() {   
      public void run() {   
        new PaintDemo();   
      }   
    });   
  }   
}
