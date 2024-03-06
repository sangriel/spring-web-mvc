package hello.servlet.web.springmvc.old;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@Component("/springmvc/old-controller")
public class OldController implements Controller {
    ///springmvc/old-controller라는 이름의 스프링 빈으로 등록
    // 빈의 이름으로 URL매핑함


    //SpringMVC 구조

    /*
    1. 핸들러 매핑
      -> 스프링 빈의 이름으로 핸들러를 찾을 수 잇는 핸들러 매핑이 필요
    2. 핸들러 어댙터 목록에서 핸들럴르 처리할 수 있는 어댑터 조회
      -> 어탭터의 경우/ 핸들러 매핑을 통해서 찾은 핸들럴 실행할 수 있는 어탭터를 조회
      -> 지금같은 경우 Controller 인터페이스를 실행할 수 있는 핸들러 어댑터를 찾아야 함
    3. 핸들러 어댙터를 통해서 handle()함수 실행
    4. handle()아네서 실제 핸들러(컨틀롤러) 호출
    5. handle()반환으로 ModelAndView를 받음
    6. ModelAndView를 viewResolver로 넘김
    7. viewResolver에서 View 반환 받음
    8. render(modelAndView, request, response )함수 호출 해서 뷰 노출
     */

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("OldController handle Request");
        //application.properties에 prefix suffix 넣으면 잘 작동함
        //springBoot가 올라올때
        // InternalResourceViewResolver를 자동으로 등록을 함
        // 이때 application.properties에 등록한 suffix, prefix 설정 정보를 사용
        return new ModelAndView("new-form");
    }
    /*
    1. handlerAdapter 호출
    -> new-form이라는 논리 이름 획득
    2. ViewResolver 호출
     -> new-form이라는 뷰 이름으로 viewResolver 순서대로 호출(1.BeanNameViewResolver, 2. InternalResourceViewResolver ...)
    3. InternalResourceViewResolver 채택 -> InternalResourceView 반환
    4. InternalResourceView는 JSP처럼 forward()를 호출해서 처리할 수 있는 경우에 사용
    5. view.render() 실행
      -> view.render()가 호출되고 InternalResourceView는 forward()를 사용해서 JSP를 실행

     */
}
