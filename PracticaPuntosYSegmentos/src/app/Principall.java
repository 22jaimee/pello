package app;

import java.util.Random;

import clases.Punto;
import clases.Segmento;

public class Principall {

	public static void main(String[] args) {
		Random random=new Random();
		
		/**
		 * Crear 4 puntos con coordenadas aleatorias entre 0 y 10
		 */ 
		Punto p1 =new Punto(random.nextInt(10), random.nextInt(10));
		Punto p2 =new Punto(random.nextInt(10), random.nextInt(10));
		Punto p3 =new Punto(random.nextInt(10), random.nextInt(10));
		Punto p4 =new Punto(random.nextInt(10), random.nextInt(10));
		
		/**
		 * Crear 2 segmentos con los puntos generados
		 */
		Segmento s1=new Segmento(p1, p2);
		Segmento s2=new Segmento(p1, p2);
		
		/**
		 * Calcular la distancia entre los puntos de ambos segmentos
		 */
		s1.distancia();
	    s2.distancia();

	}

}
