package control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import connection.BDGET;
import gameList.Juegos;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.Map;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet("/games")
public class ServletControl extends HttpServlet {

  static Logger logger = LoggerFactory.getLogger(ServletControl.class);
  List<Juegos> gamesList = new ArrayList<>();
  ObjectMapper mapper = new ObjectMapper();


  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    String route = req.getParameter("action");
    logger.info("route: " + route);
    switch (route) {
      case "getAll" -> {
        res.setContentType("application/json; charset=UTF-8");
        gamesList = BDGET.obtener();
        System.out.println("Dentro de getAll : " + gamesList.size());
        mapper.writeValue(res.getWriter(), gamesList);
        logger.info(mapper.toString());
      }

      default -> {
        System.out.println("Parámetro no válido");
      }
    }
  }

}