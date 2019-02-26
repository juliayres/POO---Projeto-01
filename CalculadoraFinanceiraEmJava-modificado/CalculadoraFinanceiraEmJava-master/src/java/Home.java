/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Julia
 */
@WebServlet(urlPatterns = {"/Home.html"})
public class Home extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Home</title>");            
            out.println("</head>");
            out.println("<body align='center' bgcolor='#f2f2f2'>");
            out.println("<h1>Projeto 01 - POO</h1>");
            out.println("<hr>");
            out.println("<font size='5'>Faculdade de Tecnologia de Praia Grande<br>");
            out.println("<u>Análise e Desenvolvimento de Sistemas</u></font><BR>");
            out.println("<b>- NOTURNO -<br><br>");
            out.println("Programação Orientada a Objetos<br>");
            out.println("Trabalho desenvolvido pelo GRUPO 4</b><br><br>");
            out.println("Alan Bernardino da Silva<br>Julia Ayres Lauro<br>Alexandre Ribeiro<br>Maurici Ferreira Junior<br><br>");
            out.println("<h3>Calculadora financeira simples, depara cálculo de montante com <u>juros simples</u> e <u>composto</u>. <br></h3>");
            out.println("<h4>ESCOLHA A OPÇÃO DESEJADA<br></h4>");
            out.println("<button><h4><a href='jurossimples.html'>Juros Simples</a></h4></button>");
            out.println("<button><h4><a href='juroscompostos.html'>Juros Compostos</a></h4></button>");
            out.println("<hr>");
            out.println("<button><a href='index.html'>Voltar</button>");
            out.println("</h2>");
            out.println("</body>");
            out.println("</html>");
        }
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

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
