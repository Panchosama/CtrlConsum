public class Articulo {
    //Variables
    private int id;
    private String nombre;
    private String ubicacion;
    private int cantidad;
    private int tipo;
    //Constructores
    public Articulo(String n, String u, int c, int t){
        this.nombre=n;
        this.ubicacion=u;
        this.cantidad=c;
        this.tipo=t;
    }
    //Métodos
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String n){
        this.nombre=n;
    }

    public String getUbicacion(){
        return this.ubicacion;
    }

    public void setUbicacion(String u){
        this.ubicacion=u;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public void setCantidad(int c){
        this.cantidad=c;
    }

    public int getTipo(){
        return this.tipo;
    }

    public void setTipo(int t){
        this.tipo=t;
    }



}
