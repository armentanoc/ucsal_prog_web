package using_sessions;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;

@WebServlet("/Sessao")
public class Session extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws    
	ServletException, IOException {
		
		try{	
			HttpSession sessao = request.getSession(true);			
			Integer acessos = (Integer) sessao.getAttribute("Numero_acessos");
			if (acessos == null) { 
				acessos = 1;
			}else { 
				acessos = acessos + 1; 
			}
			sessao.setAttribute("Numero_acessos", acessos);	
			PrintWriter writer = response.getWriter();		
			
			Date dt_primeiro_acesso = new Date(sessao.getCreationTime());
			Date dt_ultimo_acesso = new Date(sessao.getLastAccessedTime());
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // Define date format

			String titulo = "Bem vindo! Essa é a sua " + acessos + " sessão.";
			
			writer.append("<br><h1> ID: " + sessao.getId() + "</h1>");
			writer.append("<br><h1> Data e hora de criação da sessão: " + dateFormat.format(dt_ultimo_acesso) + "</h1>");
			writer.append("<br><h1> Data e hora de acesso da última sessão: " + dateFormat.format(dt_ultimo_acesso) + "</h1>");		
			writer.append( "<br><h1>O documento foi acessado " +  acessos + " vezes.</h1>");
			if(acessos > 5) {
				writer.append("<br><h1>Mensagem: o documento foi acessado mais de 5 vezes.</h1>");
			}

		} catch (IOException e){
			e.printStackTrace();
		}
	}
}