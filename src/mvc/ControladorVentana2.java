/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author jgonzalezar
 */
public class ControladorVentana2 {
    private Ventana2 ventana;
    private Modelo modelo;

    public ControladorVentana2(Modelo modelo) {
        this.modelo = modelo;
        this.ventana =new Ventana2();
        this.ventana.getBoton().setOnAction(new EventoBoton2());
        
    }
    
     public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        
        this.ventana.mostrar(singleton.getStage());
    }
    
    class EventoBoton2 implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            ControladorVentana3 controlador = new ControladorVentana3(modelo);
            controlador.mostrarVista();
            
            
        }
    
}
}
