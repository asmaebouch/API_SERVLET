package ma.bankti.web;

import com.sun.net.httpserver.HttpServer;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/hello")
//@WebServlet(name="HS",urlPatterns="/hello",loadOnStartup = 1)
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
      /*  resp.setContentType("text/html");
        var out = resp.getWriter();
        out.println("<h1>Hello from HelloServlet ^_^</h1>");
        out.println("<h1>Hello from HelloServlet ^_^ </h1>");
        out.println("<h2> Protocole utilisé : "+req.getProtocol()+"</h2>");
        out.println("<h2> Methode utilisé : "+req.getMethod()+"</h2>");
        out.println("<h2> nom utilisé : "+req.getServerName()+"</h2>");
        out.println("<h2> chemin utilisé : "+req.getServletPath()+"</h2>");
        out.println("<h2> port utilisé :" +req.getProtocol()+"</h2>");*/
     /*   var page= """
                <!DOCTYPE html>
                <html>
                <head>
                <title> Hello World </title>
                <body>
                <h2>Hello form seervlet</h2>
                <ul>        
                """;
        page += "<li> Prtocole : "+req.getProtocol()+"</li>";
        page += "<li> Methode utilisé : "+req.getMethod()+"</li>";
        page += "<li> nom utilisé : "+req.getServerName()+"</li>";
        page += "<li> port utilisé :" +req.getServerPort()+"</li>";
        page += """
                </ul>
                </body>
                </html>
                """;

        //req.getRequestDispatcher("web/hello2");
       // resp.sendRedirect(getServletContext().getContextPath()+"/hello2");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println(page);*/
        req.getRequestDispatcher("/form").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
