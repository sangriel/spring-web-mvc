package hello.servlet.web.frontcontroller.v5;

import hello.servlet.web.frontcontroller.ModelView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface MyHandlerAdapter {

    /**
     * myhandlerAdapter가 해당 컨트롤러(handler)를 처리할 수 있는지 없는지
     * 판단하는 함수
     */
    boolean supports(Object handler);

    /**
     * 이전에는 frontcontroller가 직접 실제 controller를 호출했지만,
     * 이제는 어댙터를 통해서 controller를 호출하게 된다
     */
    ModelView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException;


}
