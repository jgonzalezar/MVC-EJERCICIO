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
public class Ventana3 {
    private Scene escena;
    private VBox layout;
    private Button boton;
    private Button boton2;
    
    public Ventana3(){
        this.layout = new VBox();
        this.boton = new Button("volver a 1");
        this.boton2 = new Button("volver a 2");
        
        this.layout.getChildren().add(boton);
        this.layout.getChildren().add(boton2);
        this.escena = new Scene (this.layout,300,300);
    }

    public Button getBoton() {
        return boton;
    }

    public Button getBoton2() {
        return boton2;
    }

   
    public void mostrar (Stage stage){
        stage.setTitle("Ventana 3");
        stage.setScene(escena);
        stage.show();
    }
    
}
