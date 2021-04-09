
public class meil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		
		cuenta cuenta1 = new cuenta();
		
		cuenta1.seTNombre("luis miguel");
		cuenta1.seTNumerocuenta("34567890977");
		cuenta1.seTSaldo(5500);
	
		
		cuenta1.ingresar(500);
		
		cuenta1.retirar(56);
		 
		cuenta1.ingresar(56);
        
	
	   cuenta cuenta2 = new cuenta("luis miguel", "27837362762", 1.70, 5000);
	   
	   cuenta2.ingresar(3000);
	   
	   
	   
	   cuenta1.ingresar(200);
	   
	   
	   cuenta2.transferencia(cuenta1, 200);
	   
	   cuenta2.retirar(500);
	 
	   System.out.println(cuenta1.geTSaldo());
	   System.out.println(cuenta2.geTSaldo());
	   
	   
	   
}
}