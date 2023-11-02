package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Pessoa;

@WebServlet("/ReceberDados")
public class ReceberDados extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String strAnoNascimento = request.getParameter("anoNascimento");
		String strJaFezAniversario = request.getParameter("jaFezAniversario");
		boolean jaFezAniversario;

		try {
			if (nome == null || endereco == null || strAnoNascimento == null || strAnoNascimento.length() != 4) {
				throw new Exception("Nome, endereço e ano de nascimento são campos obrigatórios.");
			}

			int anoNascimento = Integer.parseInt(strAnoNascimento);

			if (anoNascimento < 1900 || anoNascimento > 2023) {
				throw new Exception("O ano de nascimento deve estar entre 1900 e 2023.");
			}

			if (strJaFezAniversario.equals("sim")) {
				jaFezAniversario = true;
			} else if (strJaFezAniversario.equals("nao")) {
				jaFezAniversario = false;
			} else {
				throw new Exception("Erro no processamento do já fez aniversário.");
			}

			// Create an instance of Pessoa here
			Pessoa pessoa = new Pessoa(nome, endereco, anoNascimento, jaFezAniversario);

			// Set the pessoa object as a request attribute
			request.setAttribute("pessoa", pessoa);

			// Forward the request to resultado.jsp
			RequestDispatcher dispatcher = request.getRequestDispatcher("resultado.jsp");
			dispatcher.forward(request, response);

		} catch (Exception e) {
			request.setAttribute("erro", "<br>Erro! " + e.getLocalizedMessage());
			RequestDispatcher dispatcher = request.getRequestDispatcher("receber_dados.jsp");
			dispatcher.forward(request, response);
		}
	}
}
