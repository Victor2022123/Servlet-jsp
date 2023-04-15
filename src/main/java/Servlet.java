package com.victor.servlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
@WebServlet(urlPatterns="/inicio")//localhost:8080/inicio
public class Servlet extends HttpServlet {/*servelt hijo de  httpServelt abrir con control*/
  
    private List <String> Lista=new ArrayList<>();
    
    @Override //void no va retornar ningun valor , doget va retornar lo que va dentro del dogest para atrapar inconveniente de entrada y salida dentro del dogest*/
    protected void doGet (HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
       /* String param = req.getParameter("nombre");
        if(param==null){
        resp.getWriter().append("Hola, Como estas?");/*csq se agrega secuencia de caracteres 
        }else{
        String saludo = "Hola, " + param + "!" ;
        resp.getWriter().append(saludo);
        }
       req.setAttribute("name","Victor");*/
      req.setAttribute("nomina",Lista);
        req.getServletContext().getRequestDispatcher("/paginaInicio.jsp").forward(req, resp);
               
  
      
  }  
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
       
        String nombre = req.getParameter("nombre");
        this.Lista.add(nombre);
        resp.sendRedirect(req.getContextPath()+ "/inicio");
    
    }
    
}
