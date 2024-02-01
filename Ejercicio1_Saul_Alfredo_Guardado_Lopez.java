/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1_saul_alfredo_guardado_lopez;
import javax.swing.JOptionPane;

/**
 *
 * @author thega
 */
public class Ejercicio1_Saul_Alfredo_Guardado_Lopez {

    public static void main(String[] args) {
          String primerNombre;
          String segundoNombre;
          String primerApellido;
          String segundoApellido;
          String nombreCompleto;
          
          primerNombre = JOptionPane.showInputDialog("Escriba el primer nombre");
          segundoNombre = JOptionPane.showInputDialog("Escriba el segundo nombre");
          primerApellido = JOptionPane.showInputDialog("Escriba el primer apellido");
          segundoApellido = JOptionPane.showInputDialog("Escriba el segundo apellido");

          nombreCompleto = primerNombre + " " + segundoNombre + " " + primerApellido + " " + segundoApellido;
         
          JOptionPane.showMessageDialog(null, "El nombre completo es: " + nombreCompleto, "Resultado", JOptionPane.PLAIN_MESSAGE);
       
          System.exit (0);  
    }
}
