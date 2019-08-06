public class TipoArticulo {
    //Variables
    private int id;
    private String nombre;
    private String descripcion;

    //Constructor
    public TipoArticulo(String n, String d){
        this.nombre=n;
        this.descripcion=d;
    }

    //Metodos
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n){
        this.nombre=n;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String d){
        this.descripcion=d;
    }

    //Guardado
    public void save(){
        Conector c=new Conector();
        c.connect();
        c.saveTipoArticulo(this);
        System.out.println("Tipo guardado");
        c.close();
    }
    //Listado
    public String[] list(){
        Conector c= new Conector();
        int i=0;
        c.connect();
        String[] lista = c.listTipoArticulo();
        //for(i=0;i<lista.length;i++){
        //    System.out.println(lista[i]);
        //}
        return lista;
    }
}
