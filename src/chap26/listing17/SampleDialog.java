package chap26.listing17;
 
// Create a subclass of Dialog. 
class SampleDialog extends Dialog { 
  SampleDialog(Frame parent, String title) { 
    super(parent, title, false); 
    setLayout(new FlowLayout()); 
    setSize(300, 200); 
 
    add(new Label("Press this button:")); 

    Button b; 
    add(b = new Button("Cancel")); 
    b.addActionListener((ae) -> dispose()); 

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        dispose();
      }
    });
  } 

  public void paint(Graphics g) { 
    g.drawString("This is in the dialog box", 20, 80); 
  } 
} 
