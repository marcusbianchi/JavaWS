package com.spi.servlet.test;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Client client = ClientBuilder.newClient();
			WebTarget target1 = client.target("http://www.posttestserver.com/post.php");
			ResteasyWebTarget target = (ResteasyWebTarget) target1;
			RecievingDataInterface customerProxy = target.proxy(RecievingDataInterface.class);
			RecievingData rd = new RecievingData();
			rd.setAccountID(1);
			rd.setEquipmentID(1);
			ArrayList<MeasuredData> md = new ArrayList<MeasuredData>();
			MeasuredData ms = new MeasuredData("hoje", 5552.5, 848466L);
			md.add(ms);
			rd.setMeasuredDataList(md);
			Response response1 = customerProxy.createCustomer(rd);
			System.out.println(response1.readEntity(String.class));
			//response.getWriter().println(response1.readEntity(String.class));

		} catch (Exception e) {
			e.printStackTrace();
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
