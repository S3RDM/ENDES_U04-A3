package figuras;

/**
 * Clase Cuadrado, define los lados del cuadrado y el color
 * @version 2026-03-24
 * @author Sergio Domingo Muñoz
 * @since 2026-03-20
 */

import java.awt.Color;

/**
 * Clase Cuadrado, extiende a la clase Rectangulo
 * @param x Lado x
 * @param y Lado y
 * @param color Color del cuadrado
 * @param lado Longitud del lado
 */
public class Cuadrado extends Rectangulo {
    public Cuadrado(double x, double y, Color color, double lado) {
        super(x, y, color, lado, lado);
    }
}