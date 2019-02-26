/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alan_Bernardino
 */
public class JurosCompostos extends HttpServlet {

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
            out.println("<title>Servlet JurosCompostos</title>");            
            out.println("</head>");
            out.println("<body align='center' bgcolor='#f2f2f2'>");
            out.println("<h1>Projeto 01 - POO</h1>");
            out.println("<hr>");
            out.println("<h2>Cálculo de Montante com Juros Composto</h2>");
            
            out.println("<form>");
            out.println("Capital inicial<br><input type='number' min='0' step='.01' name='c'/><br>");
            out.println("<br>Taxa de juros<br><input type='number' min='0' step='.01' name='j'/><br>");
            out.println("<br>Tempo de aplicação<br><input type='number' min='0' step='.01' name='t'/><br>");
            out.println("<br><input type='submit' name='botao' value='Calcular'/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type='reset' value='Limpar'><br><br>");
            out.println("</form>");
            out.println("<button><a href='Home.html'>Voltar</a></button>");
            out.println("</form>");
            
            double c, j, t, m;
            
            if(request.getParameter("botao") != null){
                c = Double.parseDouble(request.getParameter("c"));
                j = Double.parseDouble(request.getParameter("j"));
                t = Double.parseDouble(request.getParameter("t"));
                
                m = c * Math.pow((1 + j/100), t);
                
                Locale.setDefault(new Locale("pt", "BR"));
                DecimalFormat df = new DecimalFormat();
                df.applyPattern("R$ #,##0.00");
                out.println("<table cellpadding='15' align='center'>");
                out.println("<tr>");
                out.println("<th>Capital</th>");
                out.println("<th>Mês</th>");
                out.println("</tr>");
                
                double montante;
                
                for(int mes = 1; mes <= t; mes++){
                    montante = c * Math.pow((1 + j/100), mes);

                    out.println("<tr>");
                    out.println("<td>" + df.format(montante) + "</td>");
                    out.println("<td>" + mes + "</td>");
                    out.println("</tr>");
                }
                
                out.println("</table>");
            }
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
