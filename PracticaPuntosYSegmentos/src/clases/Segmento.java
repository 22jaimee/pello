package clases;

public class Segmento {
	Punto a;
	Punto b;
	
	/**
     * Constructor por defecto. Crea un segmento entre los puntos (0,0) y (1,1).
     */
	public Segmento() {
		Punto a=new Punto(0,0);
		Punto b=new Punto(1,1);
	}
	
	/**
     * Constructor crea un segmento mediante parametros.
     */
	public Segmento(Punto a, Punto b) {
        this.a = a;
        this.b = b;
    }
	
	/**
     * Obtiene el punto de inicio del segmento.
     * @return el punto de inicio del segmento
     */
    public Punto getA() {
        return a;
    }
    
    /**
     * Establece el punto de inicio del segmento.
     * @param a el nuevo punto de inicio del segmento
     */
    public void setA(Punto a) {
        this.a = a;
    }
    
    /**
     * Obtiene el punto de fin del segmento.
     * @return el punto de fin del segmento
     */
    public Punto getB() {
        return b;
    }
    
    /**
     * Establece el punto de fin del segmento.
     * @param b el nuevo punto de fin del segmento
     */
    public void setB(Punto b) {
        this.b = b;
    }
    
    /**
     * Calcula la distancia del segmento
     * @return resultado de la formula para calcular la distancia
     */
    public double distancia() {
    	int x1 = a.getX();
    	int y1 = a.getY();
    	int x2 = a.getX();
    	int y2 = a.getY();
		return Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
    }
    
    /**
     * Devuelve una representación en cadena del segmento en el formato [(x1,y1),(x2,y2)].
     * @return una cadena que representa el segmento
     */
    @Override
    public String toString() {
        return "["+a.toString()+","+b.toString()+"]";
    }

}
