package py.edu.uaa.pooj.util.tipoclases;

public class Circulo {
	
	public double resultado;
	public String color;
	public int x;
	public int y;
	public static double pi = 3.14;
	public int radio;
	
	
	
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	public int getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		this.radio = radio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void circuloArea() {
		
			resultado =  pi * radio * radio; 
	
	}
	
	public static void main(String[] args) {
		Circulo c =  new Circulo();
		c.setColor("negro");
		c.setX(3);
		c.setY(6);
		c.setRadio(22);
		c.circuloArea();
		
			Circulo c2 =  new Circulo();
			c2.setColor("azul");
			c2.setX(10);
			c2.setY(20);
			c2.setRadio(9);
			c2.circuloArea();
			
			System.out.println("El area del Circulo c es:" + " " + c.getResultado());
			System.out.println("El area del Circulo c2 es:" + " " + c2.getResultado());	
		System.out.println("Circulo c2 =" +  c2.getColor() + " " + " " + c2.getX() + " " + c2.getY() + " " + c2.pi );
		System.out.println("Circulo c =" +  c.getColor() + " " + " " + c.getX() + " " + c.getY() + " " + c.pi );
	} 
	
//	ROBERTO GAONA


}
