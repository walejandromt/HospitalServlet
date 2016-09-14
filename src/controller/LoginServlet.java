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


public class LoginServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		System.out.println("impresion desde SumaServlet");
		
		//recuperar_parametros
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		
		//instancia_de_la_clase_operacion
		//Operacion operacion = new Operacion();
		Doctor doc = new Doctor(email,password);
		Hospital hospital = new Hospital(doc);
		
		try{
			doc = hospital.buscar(email, password);
		}catch(NullPointerException e)
        {
			hospital.abrirNuevoFichero();
            System.out.print("NullPointerException caught");
            
        }
		 
		String responde = "";
		System.out.println(doc.getEmail());
		if(doc.vacio() && hospital.validar(email, password)){
			responde = doc.getNombre();
			request.setAttribute("r", responde);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/bienvenida.jsp");
			rd.forward(request, response);
		}else{
			responde = "<div class='alert alert-danger' role='alert'>"+
					"<span class='glyphicon glyphicon-exclamation-sign' aria-hidden='true'></span>"+
						"<span class='sr-only'>Error:</span>"
					+" Usuario o Contraseña incorrecta" + "</div>";
			request.setAttribute("r", responde);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.jsp");
			rd.forward(request, response);
		}
		//int total = operacion.suma(Integer.parseInt(num1), Integer.parseInt(num2));
		
		
				
			
		
		
		
	}
	

}
