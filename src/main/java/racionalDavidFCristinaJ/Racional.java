/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racionalDavidFCristinaJ;

import java.util.Random;

/**
 *
 * @author cristina
 */
public class Racional {

    //Aquí están la variables
    int numerador;
    int denominador;
    int numerador2;
    int denominador2;

    //Constructor inicializado.
    public Racional() {
        this.numerador = 1;
        this.denominador = 1;
        this.numerador2 = 1;
        this.denominador2 = 1;
    }

    //Constructor con limitaciones
    public Racional(int numerador, int denominador, int numerador2, int denominador2) {
        this.numerador = numerador;
        this.denominador = denominador;
        this.numerador2 = numerador2;
        this.denominador2 = denominador2;

        if (denominador == 0) {
            denominador = 1;
        }
        if (denominador2 == 0) {
            denominador2 = 1;
        }
    }

    //Getters
    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public int getNumerador2() {
        return numerador2;
    }

    public int getDenominador2() {
        return denominador2;
    }

    //Este método nos ayuda a imprimir por consola.
    public void imprimirConsola() {
        System.out.println("Numero racional: " + numerador + "/" + denominador);

    }

    //Método to Stringpara que se puedan ver los constructores y lo valores
    //de las variables por consola
    @Override
    public String toString() {
        return "Racional{" + "a = " + numerador + ", b = " + denominador + '}';
    }

    //Parte suma
    public int Suma(int numerador, int denominador, int numerador2, int denominador2) {
        //Para el numerador.
        int resultado;
        //Para el denominador.
        int resultado2;
        numerador = this.numerador;
        denominador = this.denominador;
        numerador2 = this.numerador2;
        denominador2 = this.denominador2;

        //Esto es debido a que hay dos tipos de suma
        if (denominador == denominador2) {
            resultado = (numerador + numerador2);
            resultado2 = denominador;
        } else {
            resultado = (numerador * denominador2 + numerador2 * denominador);
            resultado2 = (denominador * denominador2);
        }
        return resultado;
    }

    //Parte resta
    public int resta(int numerador, int denominador, int numerador2, int denominador2) {
        int resultado;
        int resultado2;
        numerador = this.numerador;
        denominador = this.denominador;
        numerador2 = this.numerador2;
        denominador2 = this.denominador2;

        //Aquí ponemos los condicionales debido a que hay dos tipos de resta.
        if (denominador == denominador2) {
            resultado = (numerador - numerador2);
            resultado2 = denominador;
        } else {
            resultado = (numerador * denominador2 + numerador2 * denominador);
            resultado2 = (denominador * denominador2);
        }
        return resultado;
    }

    //Parte producto
    public int producto(int numerador, int denominador, int numerador2, int denominador2) {
        int resultado;
        int resultado2;
        numerador = this.numerador;
        denominador = this.denominador;
        numerador2 = this.numerador2;
        denominador2 = this.denominador2;

        //Calculamos la multiplicación
        resultado = (numerador *= numerador2);
        resultado2 = (denominador *= denominador2);

        return resultado;
    }

    //Parte división
    public int division(int numerador, int denominador, int numerador2, int denominador2) {
        int resultado;
        int resultado2;
        numerador = this.numerador;
        denominador = this.denominador;
        numerador2 = this.numerador2;
        denominador2 = this.denominador2;

        //Aquí indicamos la división
        resultado = (numerador /= denominador2);
        resultado2 = (denominador /= numerador2);
        System.out.println("El resultado es: " + resultado + "/"+ resultado2);
        return resultado;

    }

    //Parte comprobacion de igualdad
    public boolean igualdad(int numerador, int denominador, int numerador2, int denominador2) {
        boolean resultado;
        numerador = this.numerador;
        denominador = this.denominador;
        numerador2 = this.numerador2;
        denominador2 = this.denominador2;

        //Lo hacemos mediante if debido a que así es más sencillo
        if (numerador / denominador == numerador2 / denominador2) {
            System.out.println("Los racionales son iguales entre si");
            resultado = true;
        } else {
            System.out.println("Los racionales no son iguales entre si");
            resultado = false;
        }
        return resultado;
    }

    //Parte aletoria
    public int aleatorio() {
        numerador = this.numerador;
        denominador = this.denominador;
        Random random = new Random();
        int randomNumerador = random.nextInt();
        int randomDenominador = random.nextInt();
        //Aquñi lo limitamos.
        return random.nextInt(10);

    }
}
