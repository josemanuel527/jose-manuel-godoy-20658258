
public class cuenta {

	
	
	//atributos
	private String nombre;
	private String numerocuenta;
	private double interes;
	private double saldo;
	
	
	
	
	
	//consctructor por defecto 
	
	public cuenta() {
		
		
	}
	
	//consctructor con parametros
	public cuenta(String nombre,String numerocuenta,double interes, double saldo) {
		this.nombre = nombre;
		this.numerocuenta = numerocuenta;
		this.interes=interes;
		this.saldo=saldo;
	}
	
	
	//constructor copia
	public cuenta(cuenta f) {
		nombre=f.nombre;
		numerocuenta=f.numerocuenta;
		interes=f.interes;
		saldo=f.saldo;
		
	}
	
	
	// metodos gett 

	public String geTNombre(){
		return this.nombre;		
	}
	
	public String geTNumerocuenta(){
		return this.numerocuenta;		
	}
	
	public double geTInteres(){
		return this.interes;	
	}
	
	public double geTSaldo(){
		return this.saldo;	
	}
	
	//metodos set
	
	public void seTNombre(String c){
		this.nombre=c;
	}
	
	public void seTNumerocuenta(String cu){		
		this.numerocuenta=cu;
	}
	
	public void seTInteres(double i){	
		this.interes=i;
	}
	
	public void seTSaldo(double s){
		this.saldo=s;
		
	}

	
	//ingreso de dinero 
	
	public void ingresar (double importe) {
		   if(importe>0) {
			   this.saldo += importe;
			
		}
		   
	} 
		// retiro de dinero 
	
		public void retirar (double importe) {
			if(this.saldo - importe < 0) {
			this.saldo =0;
			}else {
				this.saldo -=importe;
		}
	}
			
		// tranferencia 
		public void transferencia(cuenta f , double saldo) {
		    this.retirar(saldo);
		    f.ingresar(saldo);
		    
		    
		    
		 
		}
 
}
		
