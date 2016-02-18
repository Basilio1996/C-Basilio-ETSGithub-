package Hucha;

import java.util.Scanner;

public class MenuHucha {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		String menu = "1º añadir dinero: \n "; 
		menu = menu + "2º Extraer dinero: \n";
		menu = menu + "3º Salir \n";
		Hucha hu = new Hucha();
		boolean repetir = true;
		
		do{
			System.out.println(menu);
			System.out.println("Dinero actual: " + hu.getEuros());
			System.out.print("Elige una opcion: ");
			int opt = teclado.nextInt();
			
			if(opt ==1 ){
				System.out.println("Indica la cantidad que quieres ingresar: ");
				double cantidad = teclado.nextDouble();
				hu.añadir(cantidad);
				
			}else
				if(opt==2){
				System.out.println("¿Qué cantidad quieres retirar?");
				double quitar = teclado.nextDouble();
				hu.sacar(quitar);
				}else
					if(opt == 3){
						repetir = false;
					}
						
		}while(repetir);
		
		teclado.close();
	}

}
