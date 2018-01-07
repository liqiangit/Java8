package chap35;
lvSelModel.selectedItemProperty().addListener( 
                                  new ChangeListener<String>() { 
  public void changed(ObservableValue<? extends String> changed, 
                      String oldVal, String newVal) { 
 
    String selItems = ""; 
    ObservableList<String> selected = 
              lvTransport.getSelectionModel().getSelectedItems(); 
 
    // Display the selections. 
    for(int i=0; i < selected.size(); i++) 
      selItems += "\n      " + selected.get(i); 
           
    response.setText("All transports selected: " + selItems); 
  } 
});

