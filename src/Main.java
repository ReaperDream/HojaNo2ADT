import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	
	 
	public static void main(String[] args){
		
		Proceso process = new Proceso();
		 
		String texto= "";
        try{
            BufferedReader bf= new BufferedReader(new FileReader("datos.txt"));
            String temp= "";
            String bfRead;
            while((bfRead=bf.readLine()) !=null){ 
                //haz el ciclo mientras bfRead tenga datos
                temp= temp + bfRead; // guardado el texto del archivO
            }
            texto=temp;
        }catch(Exception e){
           System.err.println("No se encontró el archivo");
        }
		 
		int resultado = process.operacion(texto);

		System.out.println(String.valueOf("El resultado es: " + resultado));

	}
	
	  
	

	
}
