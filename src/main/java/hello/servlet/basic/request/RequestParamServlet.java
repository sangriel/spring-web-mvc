package hello.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name="requestParamServlet",urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet  {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getParameterNames().asIterator()
                .forEachRemaining(paramName -> {
                    System.out.println(paramName + " = " + request.getParameter(paramName));
                });


        System.out.println("[이름이 같은 복수 파라미터 조회]");
        String[] usernames = request.getParameterValues("username");
        //일반적으로  getParameterValue()로 가져오면 맨 처음것을 가져옴
        for (String u_name : usernames) {
            System.out.println(u_name);
        }

        response.getWriter().write("ok");

    }
}
