public class Usuario {
    //variables
    private int id;
    private String nombre;
    private String apellido;
    private String cargo;

    //constructor
    private Usuario(String n, String a, String c){
        this.nombre=n;
        this.apellido=a;
        this.cargo=c;
    }

    //metodos


    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


}
