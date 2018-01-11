package chap25.listing04;


// Demonstrate XOR mode.
import java.awt.*;
import java.awt.event.*;

public class XOR extends Frame {
  int chsX=100, chsY=100;

  public XOR() {
    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseMoved(MouseEvent me) {
        int x = me.getX();
        int y = me.getY();
        chsX = x-10;
        chsY = y-10;
        repaint();
      }
    });

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  }
   
  // Demonstrate XOR mode.
  public void paint(Graphics g) {
    g.setColor(Color.green);
    g.fillRect(20, 40, 60, 70);

    g.setColor(Color.blue);
    g.fillRect(110, 40, 60, 70);

    g.setColor(Color.black);
    g.fillRect(200, 40, 60, 70);

    g.setColor(Color.red);
    g.fillRect(60, 120, 160, 110);

    // XOR cross hairs
    g.setXORMode(Color.black);
    g.drawLine(chsX-10, chsY, chsX+10, chsY);
    g.drawLine(chsX, chsY-10, chsX, chsY+10);
    g.setPaintMode();  
  }    

  public static void main(String[] args) {
    XOR appwin = new XOR();

    appwin.setSize(new Dimension(300, 260));
    appwin.setTitle("XOR Demo");
    appwin.setVisible(true);
  }
}
