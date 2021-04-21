package calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=0,res=0;

		String sel=null;
		Scanner tec=new Scanner(System.in);
		
		System.out.println("seleccione la opcion\n");
		System.out.println("+:suma"
				+ "\n-:Resta"
				+ "\n*: Multiplicacion"
				+ "\n/:Division");
		sel=tec.next();
		switch(sel) {
		case "+":
			System.out.println("ha seleccionado suma\n");
			res=a+b;
			System.out.println("ingrese el primer numero");
			a=tec.nextInt();
			System.out.println("ingrese el segundo numero");
			b=tec.nextInt();
			res=a+b;
			System.out.println(a+"+" +b+ "="+ res);
		break;
		case "-":
			System.out.println("ha seleccionado Resta\n");
			System.out.println("ingrese el primer numero");
			a=tec.nextInt();
			System.out.println("ingrese el segundo numero");
			b=tec.nextInt();
			res=a-b;
			System.out.println(a+"+"+b+ "=" +res);
			break;
		case "*":
			System.out.println("ha seleccionado Multiplicacion\n");
			System.out.println("ingrese el primer numero");
			a=tec.nextInt();
			System.out.println("ingrese el segundo numero");
			b=tec.nextInt();
			res=a*b;
			System.out.println(a+"+"+b+ "=" +res);
			break;
		case "/":
			System.out.println("ha seleccionado Divicion\n");
			System.out.println("ingrese el primer numero");
			a=tec.nextInt();
			System.out.println("ingrese el segundo numero");
			b=tec.nextInt();
			res=a/b;
			System.out.println(a+"+"+b+ "=" +res);
			break;
			
			default:
				System.out.println("esa opcion no es valida");
			
			
		}
	}

}
