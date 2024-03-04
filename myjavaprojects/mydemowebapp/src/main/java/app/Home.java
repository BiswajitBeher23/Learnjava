package app;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Home", urlPatterns = "/")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		super.init();
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pageload = req.getServletPath();

		try {
			switch (pageload) {
			case "/feature":
				showFeaturepage(req, resp);
				break;
			case "/price":
				showPricingpage(req, resp);
				break;
			case "/faq":
				showFaqpage(req, resp);
				break;
			case "/aboutus":
				showAboutuspage(req, resp);
				break;
			default:
				showHomepage(req, resp);
				break;
			}
		} catch (SQLException e) {
			throw new ServletException(e);
		}

	}

	private void showHomepage(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}

	private void showFeaturepage(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("features.jsp");
		dispatcher.forward(request, response);
	}

	private void showPricingpage(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("pricing.jsp");
		dispatcher.forward(request, response);
	}

	private void showFaqpage(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("faq.jsp");
		dispatcher.forward(request, response);
	}

	private void showAboutuspage(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("aboutus.jsp");
		dispatcher.forward(request, response);
	}
}
