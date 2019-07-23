public class Main{
    public static void main(String args[]) {

        TipoArticulo ta=new TipoArticulo("a","b");
        ta.list();


/***
        Scanner sc= new Scanner(System.in);


        // public void guardarTipo(){
            TipoArticulo tipo = new TipoArticulo("a", "b");
            System.out.println("Ingreso de tipos de artículo \n");
            System.out.println("Ingrese nombre de tipo:");
            tipo.setNombre(sc.next());
            System.out.println("\nIngrese descripcion de tipo:");
            tipo.setDescripcion(sc.nextLine());
            try {
                tipo.save();
                System.out.println("Registro guardado!");
            } catch (Exception e) {
                e.printStackTrace();
            }


        //}
*/
    }
}
