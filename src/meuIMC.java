import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/calcularIMC")
public class meuIMC extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String massa = req.getParameter("massa");
		String altura = req.getParameter("altura");
		
		Float massaF = Float.parseFloat(massa);
		Float alturaF = Float.parseFloat(altura);
		
		PrintWriter writer = resp.getWriter();
		
		writer.println("<html> <body>");
		writer.println("Resultado : " + calculoImc(massaF,alturaF));
		writer.println("</body> </html>");
	}

	
	public String calculoImc(float massa, float altura) {
		String resultado = null;
		
		float meu_imc = (massa)/(altura*altura);

		if(meu_imc < 16){
			resultado = "Magreza grave";
		}

		if(meu_imc>= 16 && meu_imc < 17){
			resultado = "Magreza moderada";
		}

		if (meu_imc >= 17 && meu_imc < 18.5){
			resultado = "Magreza leve";
		}

		if (meu_imc >= 18.5 && meu_imc < 25){
			resultado = "Saudavel";
		}

		if (meu_imc >= 25 && meu_imc < 30){
			resultado = "Sobrepeso";
		}

		if (meu_imc >= 30 && meu_imc < 35){
			resultado = "Obesidade Grau I";
		}

		if (meu_imc >= 35 && meu_imc < 40){
			resultado = "Obesidade Grau II (Severa)";
		}

		if (meu_imc >= 40){
			resultado = "Obesidade Grau III (Morbida)";
		}
		
		
		return resultado;
	}
	
	
}
