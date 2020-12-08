package com.YenyContreras.SpringDataJpaServer1.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.YenyContreras.SpringDataJpaServer1.DAO.PersonaDAO;

@Controller
public class ControladorInicio {

		@Autowired
		private PersonaDAO perDAO;
		
		@GetMapping("/")
		public String Inici() {
			
			var MostrarPersonas = perDAO.findAll();
			
			for (var iteracion:MostrarPersonas) {
				
				System.out.println("Nombre " + iteracion.getNombre() + " " + " Apellido " + iteracion.getApellido());
				
				
			}
		
			
			return "Index";
		}
}
