public class Articulo {
    //Variables
    private int id;
    private String nombre;
    private String ubicacion;
    private int tipo;

    //Constructores
    public Articulo(String n, String u, int t){
        this.nombre=n;
        this.ubicacion=u;
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

    public int getTipo(){
        return this.tipo;
    }

    public void setTipo(int t){
        this.tipo=t;
    }

    public void save(){
        Conector c=new Conector();
        c.connect();
        c.saveArticulo(this);
        System.out.println("Articulo guardado");
        c.close();
    }

}
