/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;

/**
 *
 * @author LENOVO
 */
public class PooEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona primeraPersona = new Persona();
        Persona segundaPersona = new Persona("Mariano");
        
        
        
       primeraPersona.setNombre("Lucio");
        System.out.println(  segundaPersona.getNombre());
        
                
                
                
                
        
        
        
    }
    
}
