

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SomaSub")
public class SomaSub extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String num1 = request.getParameter("numero1");
		String num2 = request.getParameter("numero2");
		
		Float numero1 = Float.parseFloat(num1);
		Float numero2 = Float.parseFloat(num2);
		
		Float soma = numero1 + numero2;
		Float sub = numero1 - numero2;
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<html> <body>");
		writer.println("A soma é : " +soma);
		writer.println("</br>");
		writer.println("e a substrção é : " +sub );
		writer.println("</body> </html>");
	}

}
