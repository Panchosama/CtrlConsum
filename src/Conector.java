import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conector {
    String url="test.db";
    Connection connect;

    public void connect(){
        try {
            Class.forName("org.sqlite.JDBC");

            connect = DriverManager.getConnection("jdbc:sqlite:"+url);
            if(connect!=null){
                System.out.println("Conectado");
            }
        } catch (SQLException e){
            System.err.println("No se pudo conectar a la base de datos SQLite\n"+e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void close(){
        try {
            if(connect != null){
                connect.close();
            }
        }catch (SQLException e){
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE,null,e);
        }
    }

    public void saveTipoArticulo(TipoArticulo tipoArticulo){
        try{
            PreparedStatement st=connect.prepareStatement("insert into tipo_articulo (tipo_nom, tipo_des) values (?,?)");
            st.setString(1,tipoArticulo.getNombre());
            st.setString(2,tipoArticulo.getDescripcion());
            st.execute();
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }

    public void saveArticulo(Articulo articulo){
        try{
            PreparedStatement st=connect.prepareStatement("insert into articulo (art_nom, art_ubi, art_can, art_tipo) values (?,?,?,?)");
            st.setString(1,articulo.getNombre());
            st.setString(2,articulo.getUbicacion());
            st.setInt(3,articulo.getCantidad());
            st.setInt(4, articulo.getTipo());
            st.execute();
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }

    public String[] listTipoArticulo(){
        int largo=6;
        int i=0;
        String[] lista= new String[largo];
        try {
            String q="Select * from tipo_articulo order by 2 asc";
            PreparedStatement st= connect.prepareStatement(q);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
               lista[i]=rs.getString("tipo_nom");
               i++;
            }
            connect.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return lista;
    }
}


