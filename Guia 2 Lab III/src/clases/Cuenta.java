package clases;

public class Cuenta {
	
	float saldo ;

	public Cuenta(float saldo)
	{
		this.saldo = saldo;
	}
	
	public void ingresar(float c)
	{
		
		saldo=saldo + c;
		
	}
	
	public void extraer(float c)
	{
		
		 if(saldo < c) {

	            saldo=0;
	            System.out.println("El monto que ingreso es superior al saldo, saldo quedara en 0\n");
	            System.out.println("No se ha podido extraer la cantidad necesaria");

	        }else {

	            saldo= saldo - c;
	            System.out.println("Se ha extraido la cantidad de  "+c + "correctamente");
	        }
		
		
	}
	
	public float getSaldo()
	{
		return saldo;
	}
	
	
	

}
