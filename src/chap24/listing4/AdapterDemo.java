package chap24.listing4;

// Demonstrate adaptor classes.
import java.awt.*;
import java.awt.event.*;

public class AdapterDemo extends Frame {
  String msg = "";

  public AdapterDemo() {
     addMouseListener(new MyMouseAdapter(this));
     addMouseMotionListener(new MyMouseAdapter(this));
     addWindowListener(new MyWindowAdapter());
  }

  // Display the mouse information.
  public void paint(Graphics g) {
    g.drawString(msg, 20, 80);
  }    

  public static void main(String[] args) {
    AdapterDemo appwin = new AdapterDemo();

    appwin.setSize(new Dimension(200, 150));
    appwin.setTitle("AdapterDemo");
    appwin.setVisible(true);
  }
}
