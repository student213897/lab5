package tpsi.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import tpsi.web.Student;

@WebServlet(name = "sesja", urlPatterns = {"/sesja"})
public class sesja extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
            /* TODO output your page here. You may use following sample code. */
            HttpSession session = request.getSession();

                Map<String, Integer> osoby_w_sesji;
                ArrayList<Student> ListaStudentow = null;

            String imie = request.getParameter("imie");
            int iloscOdwiedzin = 1;

            if (session.isNew()) {
                osoby_w_sesji = new HashMap<String, Integer>();
                osoby_w_sesji.put(imie, 1);
                session.setAttribute("osoby_w_sesji", osoby_w_sesji);

            } 
            else 
            {
                osoby_w_sesji = (HashMap<String, Integer>) session.getAttribute("osoby_w_sesji");
                if (osoby_w_sesji.containsKey(imie))
                {
                    iloscOdwiedzin = osoby_w_sesji.get(imie) + 1;
                    osoby_w_sesji.put(imie, iloscOdwiedzin);
                }
                else 
                {
                    osoby_w_sesji.put(imie, 1);
                }

                session.setAttribute("osoby_w_sesji", osoby_w_sesji);
            }
            
            session.setAttribute("imie", imie );
            session.setAttribute("liczbaOdwiedzin", iloscOdwiedzin);
            session.setAttribute("ListaStudentow", ListaStudentow);
            
            request.getRequestDispatcher("strona.jsp").forward(request, response);
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    

}
