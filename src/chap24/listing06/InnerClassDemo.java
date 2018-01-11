package chap24.listing06;

// Inner class demo.
import java.awt.*;
import java.awt.event.*;
 
public class InnerClassDemo extends Frame {
  String msg = "";

  public InnerClassDemo() {
    addMouseListener(new MyMouseAdapter());
    addWindowListener(new MyWindowAdapter());
  }

  // Inner class to handle mouse pressed events.
  class MyMouseAdapter extends MouseAdapter {
    public void mousePressed(MouseEvent me) {
      msg = "Mouse Pressed.";
      repaint();
    }
  }

  // Inner class to handle window close events.
  class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
      System.exit(0);
    }
  }

  public void paint(Graphics g) {
    g.drawString(msg, 20, 80);
  }    

  public static void main(String[] args) {
    InnerClassDemo appwin = new InnerClassDemo();

    appwin.setSize(new Dimension(200, 150));
    appwin.setTitle("InnerClassDemo");
    appwin.setVisible(true);
  }
}
