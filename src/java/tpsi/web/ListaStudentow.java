package tpsi.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import tpsi.web.Student;



@WebServlet(name = "ListaStudentow", urlPatterns = {"/ListaStudentow"})
public class ListaStudentow extends HttpServlet {
    public ArrayList<Student> ListaStudentow;

    

        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        if (Objects.isNull(session.getAttribute("ListaStudentow")))
        {
            List<Student> ListaStudentow = new ArrayList<>();
            session.setAttribute("ListaStudentow", ListaStudentow);
            request.getRequestDispatcher("ListaStudentow.jsp").forward(request, response);
        }
        
        List<Student> ListaStudentow = (List<Student>) session.getAttribute("ListaStudentow");
        String imie = request.getParameter("firstName");
        String nazwisko = request.getParameter("lastName");
        String email = request.getParameter("email");
        String idGrupy = request.getParameter("groupID");
        Student S = new Student(imie,nazwisko,email, idGrupy);
        ListaStudentow.add(S);
        
        session.setAttribute("ListaStudentow", ListaStudentow);
        request.getRequestDispatcher("ListaStudentow.jsp").forward(request, response);
    }
    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        if (Objects.isNull(session.getAttribute("ListaStudentow")))
        {
            List<Student> ListaStudentow = new ArrayList<>();
            session.setAttribute("ListaStudentow", ListaStudentow);
            
        }
        
        List<Student> ListaStudentow = (List<Student>) session.getAttribute("ListaStudentow");
        String imie = request.getParameter("firstName");
        String nazwisko = request.getParameter("lastName");
        String email = request.getParameter("email");
        String idGrupy = request.getParameter("groupID");
        Student S = new Student(imie,nazwisko,email, idGrupy);
        ListaStudentow.add(S);
        
        session.setAttribute("ListaStudentow", ListaStudentow);
        request.getRequestDispatcher("ListaStudentow.jsp").forward(request, response);
    }

    
}
