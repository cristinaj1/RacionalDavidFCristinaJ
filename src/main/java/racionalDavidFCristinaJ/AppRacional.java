/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racionalDavidFCristinaJ;

/**
 *
 * @author Cris
 */
public class AppRacional {

    public static void main(String[] args) {
        Racional z = new Racional();
        Racional k = new Racional();
        Racional p = new Racional();
        z.numerador = 4;
        z.denominador = 5;
        k.numerador2 = 3;
        k.denominador2 = 4;

        p.denominador = p.aleatorio();
        p.numerador = p.aleatorio();

        System.out.println("El racional z es " + z.numerador + "/" + z.denominador
                + " el k es " + k.numerador + "/" + k.denominador
                + " y p es " + p.numerador + "/" + p.denominador);
        System.out.println("Si comparamos: " + z.numerador + "/" + z.denominador
                + " Y " + k.numerador2 +"/" + k.denominador2);
        z.igualdad(z.numerador, z.denominador, k.numerador2, k.denominador2);
        
    }

}
