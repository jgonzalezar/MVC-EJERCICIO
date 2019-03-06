/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author jgonzalezar
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        //registrar variable en el singleton
        Singleton singleton = Singleton.getSingleton();
        singleton.setStage(primaryStage);
        
        //modelo en memoria
        Modelo modelo = new Modelo();
        //invocamos el controlador de la vista que quiero visualizar
        
        ControladorVentana1 ventana = new ControladorVentana1(modelo);
        
        ventana.mostrarVista();
    }
    
    public static void main(String[] args) {
        launch(args);
    }

    
    
}
