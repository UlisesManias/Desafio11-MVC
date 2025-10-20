/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Swing;

import Controlador.controlador;
import Modelo.modelo;
import Vista.frmConversorTemperatura;

/**
 *
 * @author Alumno
 */
public class Main {
        public static void main(String[] args) {
            frmConversorTemperatura vista = new frmConversorTemperatura();
            modelo modelo = new modelo();
            controlador controlador = new controlador(vista, modelo);

            // Mostrar la ventana
            vista.setVisible(true);
    }
}
