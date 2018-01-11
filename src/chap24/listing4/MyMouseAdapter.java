package chap24.listing4;

// Handle only mouse click and drag events. 
class MyMouseAdapter extends MouseAdapter {
  AdapterDemo adapterDemo;

  public MyMouseAdapter(AdapterDemo adapterDemo) {
    this.adapterDemo = adapterDemo;
  }

  // Handle mouse clicked.
  public void mouseClicked(MouseEvent me) {
    adapterDemo.msg = "Mouse clicked";
    adapterDemo.repaint();
  }

  // Handle mouse dragged.
  public void mouseDragged(MouseEvent me) {
    adapterDemo.msg = "Mouse dragged";
    adapterDemo.repaint();
  } 
}
