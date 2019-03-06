/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author jgonzalezar
 */
public class Ventana1 {
    private Scene escena;
    private VBox layout;
    private Button boton;
    private GridPane gridP;
    private TextField nombreTF;
    private TextField correoTF;
    private Label nombre;    
    private Label correo;    
    
    public Ventana1(){
        this.layout = new VBox();
        this.boton = new Button("next");
        this.escena = new Scene (this.layout,300,300);
        this.layout.getChildren().add(boton);
    }

    public Button getBoton() {
        return boton;
    }

   
    public void mostrar (Stage stage){
        stage.setTitle("Ventana 1");
        stage.setScene(escena);
        stage.show();
    }
    
}
