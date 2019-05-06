/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin32;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Alumno alum = new Alumno("Pablo",5,new Enderezo("tomate",6));
        System.out.println(alum.toString());
        alum.cambiarNota(9);
        System.out.println(alum.toString());
        
        
        
        
    }
    
}
