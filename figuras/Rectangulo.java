package figuras;

/**
 * Clase Rectangulo, define los lados, base, altura y color
 * @version 2026-03-24
 * @author Sergio Domingo Muñoz
 * @since 2026-03-20
 */

import java.awt.Color;

/**
 * Clase Rectangulo, extiende la clase Figura
 * @param base Longitud de la base
 * @param altura Longitud de la altura
 * @param x Lado x del rectángulo
 * @param y Lado y del rectángulo
 * @param color Color del rectángulo
 * @param getBase Retorna valor de la base
 * @param getAltura Retorna valor de la altura
 * @param setBase Establece el valor de la base
 * @param setAltura Establece el valor de la altura
 * @param perimetro Calcula el perímetro del rectángulo
 * @param area Calcula el área del rectángulo
 */

public class Rectangulo extends Figura{
    private double base;
    private double altura;
    public Rectangulo (double x, double y, Color color, double base, double altura){
        super (x, y, color);this.base = base;this.altura = altura;
    }
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }
    public void setBase(double base){
        this.base = base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double perimetro (){
        return 2 * base + 2 * altura;
    }
    public double area (){
        return base * altura;
    }
}