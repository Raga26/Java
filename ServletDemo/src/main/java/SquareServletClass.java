import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/square")
public class SquareServletClass extends HttpServlet
{
	
	public void doGet(HttpServletRequest req ,HttpServletResponse res ) throws IOException
	{
		Cookie cookies[] = req.getCookies();
		int k = 0;
		
		for(Cookie c : cookies)
		{
			if(c.getName().equals("k"))
			{
				k = Integer.parseInt(c.getValue());
			}
		}
		//HttpSession session = req.getSession();
		//int k = (int)session.getAttribute("k");
		res.getWriter().println("square servlet = "+ k );
		
		ServletContext context = getServletContext();
		String str = context.getInitParameter("Name");

		res.getWriter().println("square servlet "+ str );
	}
	
}
