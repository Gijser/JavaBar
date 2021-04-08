package javabaropdracht;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;

public class BarmanView {
    
    public Button send;
    public Label tafel;
    public CheckBox box;
    
    public BarmanView(GridPane p){
        send = new Button("send");
        send.setOnAction(event -> send());
        
        tafel = new Label("");
        box = new CheckBox();
        
        p.setVgap(5);
        p.setHgap(8);
        p.setPadding(new Insets(10, 15, 10, 15));
        
        p.add(send, 0, 1);
        p.add(tafel, 0, 0);
        p.add(box, 1, 0);
    }
    
    public void send(){
        tafel.getText();
        
        TafelModel tafel = new TafelModel();
        DrankjeModel drankje = new DrankjeModel();
    }
}
