package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Doctor;
import model.Hospital;
//import model.Operacion;


public class RegistroServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		
		
		//recuperar_parametros
		String nombre = request.getParameter("nombre");
		String edad = request.getParameter("edad");
		String especialidad = request.getParameter("especialidad");
		String sexo = request.getParameter("sexo");
		String rfc = request.getParameter("rfc");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		
		//instancia_de_la_clase_operacion
		//Operacion operacion = new Operacion();
		Doctor doctor = new Doctor(nombre, edad, especialidad, sexo, rfc, email, password);
		Hospital hospital = new Hospital(doctor);
		
		try{
			hospital.abrir();
		}catch(NullPointerException e)
        {
            System.out.print("NullPointerException caught");
        }
		
		
		//int total = operacion.suma(Integer.parseInt(num1), Integer.parseInt(num2));
		
		//String responde = "";
			//	responde = (String) hospital.validar(email, password);
			
		//request.setAttribute("r", responde);
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/registrar.jsp");
		rd.forward(request, response);
		System.out.println("impresion desde registro");
	}
	

}
