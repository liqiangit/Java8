package chap24.listing05;

class MyMouseAdapter extends MouseAdapter {
  MousePressedDemo mousePressedDemo;

  public MyMouseAdapter(MousePressedDemo mousePressedDemo) {
    this.mousePressedDemo = mousePressedDemo;
  }

  // Handle a mouse pressed.
  public void mousePressed(MouseEvent me) {
    mousePressedDemo.msg = "Mouse Pressed.";
    mousePressedDemo.repaint();
  }
}
