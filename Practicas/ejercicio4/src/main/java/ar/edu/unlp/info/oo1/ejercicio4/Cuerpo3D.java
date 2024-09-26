package ar.edu.unlp.info.oo1.ejercicio4;

public class Cuerpo3D {
	private Figura caraBasal;
	private double altura;
	
	public double getVolumen() {
		return caraBasal.getArea() * this.altura;
	}
	
	public double getSuperficieExterior() {
		return 2 * caraBasal.getArea() + caraBasal.getPerimetro() * this.altura;
	}

	public void setCaraBasal(Figura caraBasal) {
		this.caraBasal = caraBasal;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	

}
