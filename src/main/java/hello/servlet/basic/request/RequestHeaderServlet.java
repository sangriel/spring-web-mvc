package hello.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="requestHeaderServlet",urlPatterns = "/request-header")
public class RequestHeaderServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        printStartLine(request);
    }

    private static void printStartLine(HttpServletRequest request) {
        System.out.println("--- REQUEST-LINE - start ---");

        System.out.println("request.getMethod() = " + request.getMethod());
        System.out.println("request.getProtocol() =" + request.getProtocol());
        System.out.println("request.getRequestUrl() = " + request.getRequestURL());
        System.out.println("request.getRequestUri() = " + request.getRequestURI());
        System.out.println("request.getQueryString() = " + request.getQueryString());
        System.out.println("--- REQUEST-LINE - end ---");
        System.out.println();
    }
}
