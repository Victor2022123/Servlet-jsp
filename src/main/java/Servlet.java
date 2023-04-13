
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

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
  @Override //void no va retornar ningun valor , doget va retornar lo que va dentro del dogest para atrapar inconveniente de entrada y salida dentro del dogest*/
    protected void doGet (HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        resp.getWriter().append("Hola Mundo!");/*csq se agrega secuencia de caracteres 
  
  
      
  }  
    
}
