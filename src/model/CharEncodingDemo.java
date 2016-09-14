package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CharEncodingDemo {
		private String nombre;
		private String edad;
		private String especialidad;
		private String sexo;
		private String rfc;
		private String email;
		private String password;
		//arraylist
		private ArrayList<Doctor> array;
		//crear imprimir
		private FileOutputStream outputFile;
		private OutputStreamWriter writer;
		private BufferedWriter bufferedWriter1;
		private PrintWriter printWriter;
		//leer
		private FileInputStream inputFile;
		private InputStreamReader reader;
		private BufferedReader bufferedReader;
		private String ruta = "\\dataBase.txt";
								//"C:\\Users\\w9who\\Desktop\\dataBase.txt";
	public void crear(String nombre, String edad, String especialidad, String sexo, String rfc, String email, String password){
		this.nombre = nombre;
		this.edad = edad;
		this.especialidad = especialidad;
		this.sexo = sexo;
		this.rfc = rfc;
		this.email = email;
		this.password = password;
		//System.out.println("especialidad "+especialidad);
		
		
		String path2 = System.getProperty("user.home");
		System.out.println("Path2 "+path2);
			path2 = path2 + ruta;
			ruta = path2;
			System.out.println("ruta "+ruta);
		
		try{
			 //Character enconding.(1)
			
			
	    outputFile = new FileOutputStream(ruta, true);
		writer = new OutputStreamWriter(outputFile, "8859_1");
		bufferedWriter1 = new BufferedWriter(writer);
		printWriter = new PrintWriter(bufferedWriter1, true);
		//System.out.println("Writing using encoding: " + writer.getEncoding());
	
		
		
		

		//printWriter.println("//::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		//Print Java primitive values, one on each line.
		
		printWriter.println("NOMBRE: ");
		printWriter.println(nombre);
		printWriter.println("EDAD: ");		 
		printWriter.println(edad);	
		printWriter.println("ESPECIALIDAD: ");
		printWriter.println(especialidad);
		printWriter.println("SEXO:");
		printWriter.println(sexo);
		printWriter.println("RFC:");		
		printWriter.println(rfc);		
		printWriter.println("EMAIL:");		
		printWriter.println(email);
		printWriter.println("PASSWORD:");	
		printWriter.println(password);	
		
		printWriter.println("//::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		
		
		
		 writer.close();
		 printWriter.close();
		 bufferedWriter1.close();

	}catch (IOException e) {
        // NumberFormatException nFe
    }
	}
	
	public ArrayList<Doctor> extraer(){
		String path2 = System.getProperty("user.home");
		
		path2 = path2 + ruta;
	ruta = path2;
	System.out.println("ruta "+ruta);
		
		try{

		//declaracion para leer
		inputFile = new FileInputStream(ruta);
		reader = new InputStreamReader(inputFile, "8859_1");
		bufferedReader = new BufferedReader(reader);
		//System.out.println("Reading using enconding: " + reader.getEncoding());


		//Read the (exact number of) Java primitive values.
		//in the same order they were written out, one on each line
		String cadena = "";
			//StringTokenizer mistokens;
			String a = "";
			array = new ArrayList();
			Doctor doc = null;
		while(bufferedReader.ready()){
			
				
			  
			  nombre = bufferedReader.readLine();
			  //System.out.println(nombre);
	          nombre = bufferedReader.readLine();
	          //System.out.println("nombre: "+nombre);
	          
	          edad = bufferedReader.readLine();
	          //System.out.println(edad);
	          edad = bufferedReader.readLine();
	          //System.out.println("edad "+edad);
	          
	          especialidad = bufferedReader.readLine();
	          //System.out.println(especialidad);
	          especialidad = bufferedReader.readLine();
	          //System.out.println("especia " + especialidad);
	          
	          sexo = bufferedReader.readLine();
	         // System.out.println(sexo);
	          sexo = bufferedReader.readLine();
	         //System.out.println("sexo " + sexo);
	          
	          rfc = bufferedReader.readLine();
	          //System.out.println(rfc);
	          rfc = bufferedReader.readLine();
	         // System.out.println("rfc " + rfc);
	          
	          email = bufferedReader.readLine();
	          //System.out.println(email);
	          email = bufferedReader.readLine();
	         // System.out.println("email " + email);
	          
	          password = bufferedReader.readLine();
	        //  System.out.println(password);
	          password = bufferedReader.readLine();
	         //System.out.println("pass " + password);
	          
	          
	        	  a = bufferedReader.readLine();
	        	  a = bufferedReader.readLine();
	        	  System.out.println(a);
	        	 
	        	  doc = new Doctor(nombre, edad, especialidad, sexo, rfc, email, password);
	        	  array.add(doc);
	        	
	          
			  
			
		}
				
		
			bufferedReader.close();

			
		  

		  
		}
		catch (IOException e) {
	        // NumberFormatException nFe
	    }
		return array;
		
		
	}



//-------------------------------------------
	public void nuevoFichero(){
		
		
		
		String path2 = System.getProperty("user.home");
		System.out.println("Path2 "+path2);
			path2 = path2 + ruta;
			ruta = path2;
			System.out.println("ruta "+ruta);
		
		try{
			 //Character enconding.(1)
			
			
	    outputFile = new FileOutputStream(ruta, true);
		writer = new OutputStreamWriter(outputFile, "8859_1");
		bufferedWriter1 = new BufferedWriter(writer);
		
		
		 writer.close();
		 
		 bufferedWriter1.close();

	}catch (IOException e) {
        // NumberFormatException nFe
    }
	}


}