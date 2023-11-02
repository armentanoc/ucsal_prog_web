package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Palavras;

@WebServlet("/ReceberPalavras")
public class ReceberPalavras extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String palavra1 = request.getParameter("palavra1");
		String palavra2 = request.getParameter("palavra2");

		try {
			if (palavra1 == null || palavra2 == null) {
				throw new Exception("É obrigatório informar duas palavras válidas.");
			}

			// Create an instance of Palavras here
			Palavras palavras = new Palavras(palavra1, palavra2);

			// Set the palavras object as a request attribute
			request.setAttribute("palavras", palavras);

			// Forward the request to resultado.jsp
			RequestDispatcher dispatcher = request.getRequestDispatcher("resultado.jsp");
			dispatcher.forward(request, response);

		} catch (Exception e) {
			request.setAttribute("erro", "<br>Erro! " + e.getLocalizedMessage());
			RequestDispatcher dispatcher = request.getRequestDispatcher("receber_palavra.jsp");
			dispatcher.forward(request, response);
		}
	}
}
