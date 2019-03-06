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
public class ControladorVentana3 {
    private Ventana3 ventana;
    private Modelo modelo;

    public ControladorVentana3(Modelo modelo) {
        this.modelo = modelo;
        this.ventana =new Ventana3();
        this.ventana.getBoton().setOnAction(new EventoBoton3());
        this.ventana.getBoton2().setOnAction(new EventoBoton4());
    }
    
     public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        
        this.ventana.mostrar(singleton.getStage());
    }
    
    class EventoBoton3 implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            ControladorVentana1 controlador = new ControladorVentana1(modelo);
            controlador.mostrarVista();
        }
    
}
    class EventoBoton4 implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            ControladorVentana2 controlador = new ControladorVentana2(modelo);
            controlador.mostrarVista();
        }
    
}
}
