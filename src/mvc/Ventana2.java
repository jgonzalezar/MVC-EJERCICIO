/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author jgonzalezar
 */
public class Ventana2 {
    private Scene escena;
    private VBox layout;
    private Button boton;
    
    public Ventana2(){
        this.layout = new VBox();
        this.boton = new Button("next window");
        this.escena = new Scene (this.layout,300,300);
        this.layout.getChildren().add(boton);
    }

    public Button getBoton() {
        return boton;
    }

    public void setBoton(Button boton) {
        this.boton = boton;
    }
    
   public void mostrar (Stage stage){
        stage.setTitle("Ventana 2");
        stage.setScene(escena);
        stage.show();
    }
    
    
}
