package Hucha;

public class Hucha {
	
	private double euros;
	
	public Hucha (){
		euros = 0;	
	}

	public double getEuros() {
		return euros;
	}

	public void añadir(double cantidad) {
		euros = euros + cantidad;
	}

	public double sacar (double extraer){
		if (extraer <= euros){
		euros = euros - extraer;
		return extraer;
		}else{
			extraer = euros;
			euros = 0;
			return extraer;
		
		}
	}
	
	public String toString(){
		return "Euros: " + euros;
	}
}
