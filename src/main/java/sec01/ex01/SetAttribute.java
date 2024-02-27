package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/set")
public class SetAttribute extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String ctxMesg = "context에 바인딩";
		String sesMesg = "session에 바인딩";
		String reqMesg = "request에 바인딩";
		
		ServletContext context = getServletContext();
		System.out.println(context.getContextPath());
		context.setAttribute("contxt", ctxMesg);
		
		HttpSession session = request.getSession();
		session.setAttribute("sess", sesMesg);
		
		System.out.println(request);
		request.setAttribute("request", reqMesg);
	}
}
