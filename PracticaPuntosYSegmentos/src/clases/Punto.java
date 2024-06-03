package clases;

public class Punto {
	int x;
	int y;
	
	/**
	 * Crea un punto en las coordenadas (0,0) 
	 * @param cordenada x es 0
	 * @param cordenada y es 0
	 */
	public Punto() {
		this.x=0;
		this.y=0;
	}
	
	/**
     * Constructor que recibe como parámetros dos enteros.
     * @param  la coordenada x del punto
     * @param  la coordenada y del punto
     */
	public Punto(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	/**
     * Obtiene el punto del eje x
     * @return el punto del eje x
     */
	public int getX() {
        return x;
    }
	
	/**
     * Establece el punto del eje x
     * @param  punto del eje x
     */
	public void setX(int x) {
        this.x = x;
    }
	
	/**
     * Obtiene el punto del eje y
     * @return el punto del eje y
     */
	public int getY() {
        return y;
    }
	
	/**
     * Establece el punto del eje y
     * @param  punto del eje y
     */
	public void setY(int y) {
        this.y = y;
    }
	
	@Override
    public String toString() {
        return "("+ x +","+ y +")";
    }

}
