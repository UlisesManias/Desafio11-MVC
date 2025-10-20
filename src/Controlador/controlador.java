/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Vista.frmConversorTemperatura;
import Modelo.modelo;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Alumno
 */
public class controlador implements ActionListener {
    
    private frmConversorTemperatura vista;
    private modelo modelo;
    
    public controlador(frmConversorTemperatura vista, modelo modelo){
        this.vista = vista;
        this.modelo = modelo;

        this.vista.getBtnConvertir().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        String Ingreso = vista.getTxtTemperatura().getText();
        
        if(Ingreso.isEmpty()){
            JOptionPane.showMessageDialog(vista, "Complete el campo requerido");
            return;
        }
        
        try{
            int txtIngreso = Integer.parseInt(Ingreso);
            int Resultado = 0;
            String tipo = vista.getComboBox().getSelectedItem().toString();
            
            switch(tipo){
                case "Celsius a Farenheit":
                    Resultado = modelo.celsiusAFarenheit(txtIngreso);
                    break;
                case "Farenheit a Celsius":
                    Resultado = modelo.farenheitACelsius(txtIngreso);
                    break;
                default:
                    JOptionPane.showMessageDialog(vista, "Seleccione una opción válida");
                    return;
            }
            
            vista.getTxtResultado().setText(String.valueOf(Resultado));
            
        }
        catch(NumberFormatException ex){
             JOptionPane.showMessageDialog(vista, "Ingrese un número válido");
        }
    }
}
