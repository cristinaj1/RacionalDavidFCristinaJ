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
        //Creamos los objetos los cuales se van a basar en el constructor
        Racional z = new Racional();
        Racional k = new Racional();
        Racional p = new Racional();

        //Le damos valores 
        z.numerador = 4;
        z.denominador = 5;
        k.numerador2 = 3;
        k.denominador2 = 4;

        //Aquí creamos uno con valores aleatorios
        p.denominador = p.aleatorio();
        p.numerador = p.aleatorio();

        //Imprimir los 3 racionales
        System.out.println("El racional z es " + z.numerador + "/" + z.denominador
                + " el k es " + k.numerador + "/" + k.denominador
                + " y p es " + p.numerador + "/" + p.denominador);

        //Comparar racionales
        System.out.println("Si comparamos: " + z.numerador + "/" + z.denominador
                + " Y " + k.numerador2 + "/" + k.denominador2);
        z.igualdad(z.numerador, z.denominador, k.numerador2, k.denominador2);

        //Sumar racionales
        z.Suma(z.numerador, z.denominador, k.numerador2, k.denominador2);
        int suma = ((z.numerador * k.denominador2 + k.numerador2 * z.denominador)
                / z.denominador * k.denominador2);
        System.out.println("La suma de z y k es igual a " + suma);

        //Dividir racionales
        z.division(z.numerador, z.denominador, k.numerador2, k.denominador2);

        int numeradorDiv = (z.numerador /= k.denominador2);
        int divisorDiv = (z.denominador /= k.numerador2);
        System.out.println("La división tiene de resultado: " + numeradorDiv + "/"
                + divisorDiv);
    }

}
