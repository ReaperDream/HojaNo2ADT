
public class Proceso implements Interfaz{
	
	Pila pila = new Pila();
	
	@Override
	public int operacion(String vector) {
		// TODO Auto-generated method stub
		
		int respuesta = 0;
		
		String[] espacio = vector.split(" ");
		
		for(int i=0;i<espacio.length;i++){
			try{
			pila.Agregar(Integer.parseInt(espacio[i]));
			}catch(Exception e){
			try{
				int a= (int)pila.remover();
				int b= (int)pila.remover();
				switch(espacio[i]){
					case("+"):
						respuesta = a+b;
						pila.Agregar(respuesta);
						System.out.println(a + "+" +b);
						break;
					case("-"):
						respuesta = a-b;
						pila.Agregar(respuesta);
						System.out.println(a + "-" +b);
						break;
					case("*"):
						respuesta = a*b;
						pila.Agregar(respuesta);
						System.out.println(a + "*" +b);
						break;
					case("/"):
						respuesta = a/b;
						pila.Agregar(respuesta);
						System.out.println(a + "/" +b);
						break;
					default:
						System.out.println("Codigo no aceptado");
				}
			}catch(Exception error){
				System.out.println("Codigo no aceptado");
				
		}
			
	}}
		return respuesta;
}}
