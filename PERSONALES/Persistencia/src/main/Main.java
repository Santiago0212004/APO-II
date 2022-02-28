package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		String path = "D:/usuarios/1044607243/Documents/Files/alfa.txt";
		
		File file = new File(path);

		//Datos de entrada desde el archivo file
		FileInputStream fis = new FileInputStream(file);
		
		//BufferedReader
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader reader = new BufferedReader(isr);
		
		String data = "";
		String line = null;
		
		while((line = reader.readLine()) != null) {
			data += line+"\n";
		}
		fis.close();
		
	

		//Edicion del archivo
		data += "Leido por Eclipse JAVA";
				
		FileOutputStream fos =  new FileOutputStream(file);
		fos.write(data.getBytes()); 
		fos.close();
		
		File folder = new File("D:/usuarios/1044607243/Documents");
		System.out.println(folder.exists());
		
		String[] filenames = folder.list();
		for(String name : filenames) System.out.println(name);
		
		
		File newFolder = new File("D:/usuarios/1044607243/Documents/Alfa/Beta/Gamma");
		newFolder.mkdirs();
		
		reader.close();
		
	}	
	
}
