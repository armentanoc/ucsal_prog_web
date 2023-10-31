package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.OperacoesMatematicas;

@WebServlet("/ReceberNumeros")
public class ReceberNumeros extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String strNumero1 = request.getParameter("numero1");
        String strNumero2 = request.getParameter("numero2");
        String strNumero3 = request.getParameter("numero3");

        try {
        	// Try parsing to int
             int numero1 = Integer.parseInt(strNumero1);
             int numero2 = Integer.parseInt(strNumero2);
             int numero3 = Integer.parseInt(strNumero3);
             
            // Create an instance of OperacoesMatematicas here    	
        	OperacoesMatematicas operacoes = new OperacoesMatematicas(numero1, numero2, numero3);
          	
        	// Set the operacoes object as a request attribute
        	request.setAttribute("operacoes", operacoes);

        	// Forward the request to resultado.jsp
        	RequestDispatcher dispatcher = request.getRequestDispatcher("resultado.jsp");
        	dispatcher.forward(request, response);
        	
        } catch (Exception e) {
            request.setAttribute("erro", "<br>Erro em algum dos números!");
            RequestDispatcher dispatcher = request.getRequestDispatcher("receber_numeros.jsp");
            dispatcher.forward(request, response);
        }
    }
}
