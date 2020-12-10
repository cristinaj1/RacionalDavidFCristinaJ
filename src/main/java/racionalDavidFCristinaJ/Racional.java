/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racionalDavidFCristinaJ;

/**
 *
 * @author cristina
 */
public class Racional {

    int numerador;
    int denominador;
    int numerador2;
    int denominador2;

    public Racional() {
        this.numerador = 1;
        this.denominador = 1;
        this.numerador2 = 1;
        this.denominador2 = 1;
    }

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

    public void imprimirConsola() {
        System.out.println("Numero racional: " + numerador + "/" + denominador);

    }

    @Override
    public String toString() {
        return "Racional{" + "a = " + numerador + ", b = " + denominador + '}';
    }

    public int Suma(int numerador, int denominador, int numerador2, int denominador2) {
        int resultado = 0;
        numerador = this.numerador;
        denominador = this.denominador;
        numerador2 = this.numerador2;
        denominador2 = this.denominador2;
        if (denominador == denominador2) {
            resultado = (numerador + numerador2)/denominador;
        } else {
            resultado = (numerador * denominador2 + numerador2 * denominador)/(denominador * denominador2);
        }
        return resultado;
    }
    public int resta(int numerador, int denominador, int numerador2, int denominador2) {
        int resultado = 0;
        numerador = this.numerador;
        denominador = this.denominador;
        numerador2 = this.numerador2;
        denominador2 = this.denominador2;
        //Aquí ponemos los condicionales donde 
        if (denominador == denominador2) {
            resultado = (numerador - numerador2)/denominador;
        } else {
            resultado = (numerador * denominador2 + numerador2 * denominador)/(denominador * denominador2);
        }
        return resultado;
    }
}
