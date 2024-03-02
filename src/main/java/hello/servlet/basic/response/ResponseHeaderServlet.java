package hello.servlet.basic.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "responseHeaderServlet", urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //[status - line]
        response.setStatus(HttpServletResponse.SC_OK);//200으로 적는 것 보다는 내장되어 있는 값을 쓰는게 좋다.

        //[response - header]
//        response.setHeader("content-Type","text/plain;charset=utf-8");
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
        response.setHeader("Pragma","no-cache");

        //[Cookie setting]
        Cookie cookie = new Cookie("myCookie","good");
        cookie.setMaxAge(60);
        response.addCookie(cookie);

        //[redirect]
//        response.setStatus(HttpServletResponse.SC_FOUND); // 302 redirect code
//        response.setHeader("Location","/basic/hello-form.html");
        response.sendRedirect("/basic/hello-form.html");


        PrintWriter writer = response.getWriter();
        writer.print("ok");
    }



}
