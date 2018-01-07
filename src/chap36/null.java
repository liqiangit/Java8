package chap36;
// Create a handler for the tool bar buttons. 
EventHandler<ActionEvent> btnHandler = new EventHandler<ActionEvent>() {  
  public void handle(ActionEvent ae) {  
    response.setText(((Button)ae.getTarget()).getText());  
  }  
};  
 
// Set the tool bar button action event handlers. 
btnSet.setOnAction(btnHandler); 
btnClear.setOnAction(btnHandler); 
btnResume.setOnAction(btnHandler);

