

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@WebServlet("/MegaSena")
public class MegaSena extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Random gerador = new Random();
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		for (int i = 1; i < 61; i++) { 
		    numeros.add(i);
		}

		Collections.shuffle(numeros);
		
		PrintWriter writer = response.getWriter();
		writer.println("<html> <body>");
		
		for (int i = 0; i < 6; i++) {
			   writer.println(numeros.get(i));
		}
		
	    writer.println("</body> </html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
