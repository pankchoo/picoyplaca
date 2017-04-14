package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import paquetepicoplaca.Auto;
import paquetepicoplaca.Dia;
import paquetepicoplaca.Metodosproceso;

/**
 * Servlet implementation class ServletPuente
 */
@WebServlet("/ServletPuente")
public class ServletPuente extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletPuente() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String circula;
		String dia;
		Auto objauto=new Auto();
		Dia objdia=new Dia();
		Metodosproceso objmet=new Metodosproceso();
		response.setContentType( "text/html; charset=iso-8859-1" );
		PrintWriter out = response.getWriter();
		String placa=request.getParameter("placa");
		objauto.setPlaca(placa);
		String fecha=request.getParameter("fecha");
		objdia.setFecha(fecha);
		dia=objmet.getDiaSemana(objdia.getFecha());
		String hora=request.getParameter("hora");
		objdia.setHora(hora);
		circula=objmet.getCirculacion(dia, objdia.getHora(), objauto.getPlaca());
		out.println(objauto.getPlaca());
		out.println("("+dia);
		out.println(objdia.getHora()+" h)");
		out.println("<strong>"+circula+"</strong>");
	}

}
