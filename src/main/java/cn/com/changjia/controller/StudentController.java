package cn.com.changjia.controller;
import cn.com.changjia.dbbean.Student;
import cn.com.changjia.service.IStudentService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class StudentController implements Controller {
    private IStudentService service;

    public void setService(IStudentService service) {
        this.service = service;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String name=request.getParameter("name");
        String ageStr=request.getParameter("age");
        System.out.println(name);
        Integer age = Integer.valueOf(ageStr);
        Student student=new Student();
        student.setName(name);
        student.setAge(age);
        service.addStudent(student);
        return new ModelAndView("/welcome.jsp");
    }
}
