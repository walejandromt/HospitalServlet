package model;

import java.util.ArrayList;

public class Hospital{
	private ArrayList<Doctor> a;
	private CharEncodingDemo demon;
	private Doctor doctor;
	private BaseDatos datos;

	public Hospital(){
		
	}
	
	public Hospital(ArrayList a, CharEncodingDemo demon){
		this.a = a;
		this.demon = demon;
		
	}
	
	public Hospital(Doctor doctor){
		
		this.doctor = doctor;
		//a.add(doctor);
	}


	
	public void abrir(){
		
		demon = new CharEncodingDemo();
		System.out.println("Holaaa");
		
		demon.crear(doctor.getNombre(), doctor.getEdad(), doctor.getEspecialidad(), doctor.getSexo(), doctor.getRfc(), doctor.getEmail(), doctor.getPassword());
		//System.out.
		
		//a.add(doctor);
	}
	
	public Doctor buscar(String email, String password){
		
		demon = new CharEncodingDemo();
		
		a = demon.extraer();
			//System.out.println("extraer;" + a.get(1).getNombre());
		for(int x = 0; x<=a.size()-1; x++){
			if(a.get(x).getEmail().equals(email)){
				System.out.println("hay un email parecido" + a.get(x).getNombre());
				if(a.get(x).getPassword().equals(password)){
				doctor = new Doctor(a.get(x).getNombre(), a.get(x).getEdad(),a.get(x).getEspecialidad(), a.get(x).getSexo(), a.get(x).getRfc(), a.get(x).getEmail(), a.get(x).getPassword());
				}
			}
		}
		
		return doctor;
	}
	
	public boolean validar(String email, String password){
		boolean val = false;
		demon = new CharEncodingDemo();
		
		a = demon.extraer();
			//System.out.println("extraer;" + a.get(1).getNombre());
		for(int x = 0; x<=a.size()-1; x++){
			if(a.get(x).getEmail().equals(email)){
				
				if(a.get(x).getPassword().equals(password)){
				val = true;
				}
			}
		}
		
		return val;
	}
	
	public void abrirNuevoFichero(){
		
		demon = new CharEncodingDemo();
		demon.nuevoFichero();
		
	}
	//--------------------------------JAVA BEANS GET AND SET
	
	

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	

}