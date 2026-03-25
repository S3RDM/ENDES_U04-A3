package figuras;

/**
 * Clase Triangulo, define los lados y color
 * @version 2026-03-24
 * @author Sergio Domingo Muñoz
 * @since 2026-03-20
 */

import java.awt.Color;

/**
 * Clase Triangulo, extiende la clase Figura
 * @param lado1 Longitud del lado 1
 * @param lado2 Longitud del lado 2
 * @param lado3 Longitud del lado 3
 * @param x Lado x del rectángulo
 * @param y Lado y del rectángulo
 * @param color Color del rectángulo
 * @param getLado1 Retorna valor del lado 1
 * @param getLado2 Retorna valor del lado 2
 * @param getLado3 Retorna valor del lado 3
 * @param setLado1 Establece valor del lado 1
 * @param setLado2 Establece valor del lado 2
 * @param setLado3 Establece valor del lado 3
 * @param perimetro Calcula el perímetro del rectángulo
 * @param area Calcula el área del rectángulo
 */

public class Triangulo extends Figura{
    private double lado1;
    private double lado2;
    private double lado3;
    public Triangulo(double x, double y, Color color, double lado1, double lado2, double lado3){
        super (x, y, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public double getLado1(){
        return lado1;
    }
    public double getLado2(){
        return lado2;
    }
    public double getLado3(){
        return lado3;
    }
    public void setLado1(double lado1){
        this.lado1 = lado1;
    }
    public void setLado2(double lado2){
        this.lado2 = lado2;
    }
    public void setLado3(double lado3){
        this.lado3 = lado3;
    }
    public double perimetro (){
        return lado1 + lado2 + lado3;
    }
    public double area (){
        double sp = perimetro() / 2;
        return Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3)); 
    }
}