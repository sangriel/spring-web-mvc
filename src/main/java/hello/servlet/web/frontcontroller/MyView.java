package hello.servlet.web.frontcontroller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Map;

public class MyView {

    private String viewPath;

    public MyView(String viewPath) {
        this.viewPath = viewPath;
    }

    public void render(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(viewPath);
        requestDispatcher.forward(request,response);
    }

    public void render(Map<String,Object> model, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        model.forEach((key,value) -> {
            request.setAttribute(key,value);
        });
        //개인적으로 굳이 request에다가 넣으거면 model계층을 왜 만들었나 싶기도한데,
        //복잡해지면 의미가 있어보이기도 하고
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(viewPath);
        requestDispatcher.forward(request,response);
    }
}
