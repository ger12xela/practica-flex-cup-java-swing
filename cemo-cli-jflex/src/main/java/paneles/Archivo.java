package paneles;

import java.io.*;

public class Archivo {
	private File archivo;
	
	public Archivo (String nombre) {
		archivo = new File(nombre);
		
	}
	
	public String getContenido() throws IOException {
		String contenido = "";
		FileReader fr = new FileReader(archivo);
		BufferedReader lector = new BufferedReader(fr);
		String linea = lector.readLine();
		while (linea != null) {
			contenido += linea+"\n";
			linea = lector.readLine();
		}
		lector.close();
		fr.close();
		return contenido;
	}
	
	public void Guardar(String contenido) throws IOException {
		PrintWriter escritor = new PrintWriter(archivo);
		escritor.write(contenido);
		escritor.close();
		
	}

}
