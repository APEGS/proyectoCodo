package connection;

import static connection.Connect.close;
import static connection.Connect.getConnect;
import gameList.juegos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BDGET {
    private static final String SQLSELECT = "SELECT * FROM juego";

    public static List<juegos> obtener(){
      Connection con = null;
      PreparedStatement pstat = null;
      ResultSet rs = null;
      Juegos juego = null;
      List<Juegos> juegos = new ArrayList<>();

      try {
        con = getConnect();
        pstat = con.prepareStatement(SQLSELECT);
        rs = pstat.executeQuery();
       
        while (rs.next()) {
          int id = rs.getInt("id");
          String nombreJuego = rs.getString("nombre_juego");
          String genero = rs.getString("genero");
          int anho = rs.getInt("anho");
          String descripcion = rs.getString("descripcion");
  
          juego = new Juegos(id, nombreJuego, genero, anho, descripcion);
          juegos.add(juego);
        }
      } catch (Exception e) {
        e.printStackTrace(System.out);
      } finally {
        try {
          close(rs);
          close(pstat);
          close(con);
        } catch (Exception e) {
          e.printStackTrace(System.out);
        }
      }
      return juegos;
    }
    
}