package main;



import java.util.Scanner;

import clases.Cuenta;
import clases.Menu;


public class Main {

	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		int opcion=6;
		float saldo=0;
		float monto=0;
		
		
		Cuenta cuenta= new Cuenta(0);
		Menu menu1=new Menu();
		
		
		do {
            
			menu1.mostrarMenu();
			System.out.println("Ingrese la opcion:");
			opcion=scanf.nextInt();

            switch(opcion) {

            case 1:
                System.out.println("Su cuenta a sido creada con saldo 0");
            	
                break;

            case 2:
                System.out.println("Ingrese un saldo a depositar en su nueva cuenta\n");
                saldo=scanf.nextFloat();
                cuenta.ingresar(saldo);
                System.out.println("Su cuenta a sido creada con saldo:" +saldo);
                break;

            case 3:
            	System.out.println("Ingrese un saldo a depositar en su cuenta\n");
            	saldo=scanf.nextFloat();
            	cuenta.ingresar(saldo);
            	
            
                break;

            case 4:
            	System.out.println("Ingrese el monto que quiere retirar de su cuenta");
            	monto=scanf.nextFloat();
            	cuenta.extraer(monto);
            	
            	
                break;

            case 5: 
            	saldo=cuenta.getSaldo();
            	System.out.println("El saldo de su cuenta es de:" +saldo);
            	

                break;

            case 6:
                opcion=6;
                break;

            default:
                System.out.println("Opcion no existente\n");
                break;

            }


        }while(opcion!=6);
		scanf.close();
	}


}
