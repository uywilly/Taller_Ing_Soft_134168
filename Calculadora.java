public class Calculadora{
	public static void main(String[] args){
		if(args.length==3){
			try{
				int op1 = Integer.parseInt(args[1]);
				int op2 = Integer.parseInt(args[2]);
				System.out.println(op1+op2);
			}
			catch(Exception ex){
				System.out.println("Params incorrectos");
			}
			
		}else{
			System.out.println("Uso: Calculadors operador");
		}
		
	}

}