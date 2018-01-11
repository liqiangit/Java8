package chap25.listing06;

// Display fonts.
import java.awt.*;
import java.awt.event.*;
 
public class SampleFonts extends Frame {
  int next = 0;
  Font f;
  String msg;

  public SampleFonts() {
    f = new Font("Dialog", Font.PLAIN, 12);
    msg = "Dialog";
    setFont(f);

    addMouseListener(new MyMouseAdapter(this));

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  }
  
  public void paint(Graphics g) {
    g.drawString(msg, 10, 60);
  }

  public static void main(String[] args) {
    SampleFonts appwin = new SampleFonts();

    appwin.setSize(new Dimension(200, 100));
    appwin.setTitle("SampleFonts");
    appwin.setVisible(true);
  }
}
