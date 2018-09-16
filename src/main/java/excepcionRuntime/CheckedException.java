package excepcionRuntime;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class CheckedException {
	
	
	public static void main(String[] args) {
		
		crearNuevoArchivo("/Users/eduardocastillo/Documents/ArchivosCreados/NuevoArchivo.txt", "Contenido en el archivo");
	}
	
	
  private static void crearNuevoArchivo(String ruta, String contenido) {
	  
	  File file = new File(ruta);
	  
	  try {
	
		  file.createNewFile();
		  
		  FileWriter fw = new FileWriter(file);
		  BufferedWriter bw = new BufferedWriter(fw);
		  bw.write(contenido);
		  bw.close();
		  
	  } catch (IOException e) {
		e.printStackTrace();
	
	}
  
  }

}
