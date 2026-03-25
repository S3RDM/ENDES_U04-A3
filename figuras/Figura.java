package figuras;

/**
 * Clase Figura, define el centro, color y lados
 * @version 2026-03-24
 * @author Sergio Domingo Muñoz
 * @since 2026-03-20
 */

import java.awt.Color;

/**
 * Clase Figura, define el centro, color y lados
 * @param Punto Centro de la figura
 * @param Color Color
 * @param Figura Define lados y color
 * @param getXCentro Retorna valor x de centro
 * @param getYCentro Retorna valor y de centro
 * @param getColor Retorna color
 * @param setXCentro Establece el valor x de centro
 * @param setYCentro Establece el valor y de centro
 * @param setColor Establece color
 */
public abstract class Figura{
    private Punto centro;
    private Color color;
    public Figura(double x, double y, Color color){
        centro = new Punto (x, y);
        this.color = color;
    }
    public double getXCentro(){
        return centro.getX();
    }
    public double getYCentro(){
        return centro.getY();
    }
    public Color getColor(){
        return color;
    }
    public void setXCentro(double x){
        centro.setX (x);
    }
    public void setYCentro(double y){
        centro.setY (y);
    }
    public void setColor(Color color){
        this.color = color;
    }
    public abstract double perimetro();
    public abstract double area();
    public int esMayorQue (Figura otraFigura) {
        int codigo;
        if (this.area() > otraFigura.area()) codigo = 1;
        else
            if (this.area() < otraFigura.area()) codigo = -1;
            else codigo = 0;
        return codigo;
    }
}