package using_cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cookies")
public class Cookies extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		try{

			String nome = request.getParameter("nome").replaceAll(" ", "+"); //encoding spaces
			String curso = request.getParameter("curso").replaceAll(" ", "+");;
			String cargo = request.getParameter("cargo").replaceAll(" ", "+");;
			String cor = request.getParameter("cor").replaceAll(" ", "+");;
			
			Cookie cookieNome = new Cookie("nome", nome);
			Cookie cookieCurso = new Cookie("curso", curso);
			Cookie cookieCargo = new Cookie("cargo", cargo);
			Cookie cookieCor = new Cookie("cor", cor);	

			cookieNome.setMaxAge(60*2); 		//	Tempo de duração : 2 minutos
			cookieCurso.setMaxAge(60*2);  		
			cookieCargo.setMaxAge(60*2); 
			cookieCor.setMaxAge(60*2); 

			response.addCookie(cookieNome);
			response.addCookie(cookieCurso);
			response.addCookie(cookieCargo);
			response.addCookie(cookieCor);

			PrintWriter writer = response.getWriter();			

			writer.append( " <HTML>  <BODY> " );
			writer.append( " <H1> Exemplo de cookies (nome, valor) </H1> " );

			writer.append("<h2 style=\"color:"+cookieCor.getValue()+";\"> Cookie 1) nome = "+ cookieNome.getName() + " e valor = " + cookieNome.getValue() + "</h2><br> " );
			writer.append("<h2 style=\"color:"+cookieCor.getValue()+";\"> Cookie 2) nome = "+ cookieCurso.getName() + " e valor = " + cookieCurso.getValue() + "</h2><br> " );
			writer.append("<h2 style=\"color:"+cookieCor.getValue()+";\"> Cookie 3) nome = "+ cookieCargo.getName() + " e valor = " + cookieCargo.getValue() + "</h2><br> " );
			writer.append("<h2 style=\"color:"+cookieCor.getValue()+";\"> Cookie 4) nome = "+ cookieCor.getName() + " e valor = " + cookieCor.getValue() + "</h2><br> " );
			
			
			writer.append( "</BODY> </HTML>  " );

		} catch (IOException e){
			e.printStackTrace();	
		} 

	}
}
