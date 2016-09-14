package model;

public class Doctor{
 private String nombre;
 private String edad;
 private String especialidad;
 private String sexo;
 private String rfc;
 private String email;
 private String password;

 public Doctor(){}

 public Doctor(String nombre, String edad, String especialidad, String sexo, String rfc, String email, String password){

 		this.nombre = nombre;
 		this.edad = edad;
 		this.especialidad = especialidad;
 		this.sexo = sexo;
 		this.rfc = rfc;
 		this.email = email;
 		this.password = password;

 		}
 
 public Doctor(String email, String password){

		this.email = email;
		this.password = password;

		}
public boolean vacio(){
	boolean val = false;
	if(nombre != "" && email != "" && password != "" || nombre != null && email != null && password != null ){
		val = true;
	}
	
	return val;
}
 //::::::::::::::::::::::::::::::::::::GET AND SET::::::::::::::::::::::::::::::::::: 		

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getEdad() {
	return edad;
}

public void setEdad(String edad) {
	this.edad = edad;
}

public String getEspecialidad() {
	return especialidad;
}

public void setEspecialidad(String especialidad) {
	this.especialidad = especialidad;
}

public String getSexo() {
	return sexo;
}

public void setSexo(String sexo) {
	this.sexo = sexo;
}

public String getRfc() {
	return rfc;
}

public void setRfc(String rfc) {
	this.rfc = rfc;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}


 }