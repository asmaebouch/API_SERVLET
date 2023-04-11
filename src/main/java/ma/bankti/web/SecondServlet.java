package ma.bankti.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SecondControleur")
public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var page= """
                <!DOCTYPE html>
                <html>
                <head>
                <title> Hello World </title>
                <body>
                <h2>Hello form second servlet</h2>
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
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println(page);
    }
}
