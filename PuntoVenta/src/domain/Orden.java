
package domain;


public class Orden {
    private final int idOrden;
    private Producto productos[];
    private int contadorProductos;
    private static int contadorOrdenes;
    private static final int MAX_PRODUCTOS=10;
    
    public Orden(){
        this.idOrden=++contadorOrdenes;
        this.productos=new Producto[Orden.MAX_PRODUCTOS];
     //Inicializa el array de tamaño MAX_PRODUCTOS y de tipo Producto
    }
    public void agregarProducto(Producto producto){
        if(this.contadorProductos<=Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++]=producto;
        }
        else{
            System.out.println("Se ha Superado el Maximo de productos : "+Orden.MAX_PRODUCTOS);
        }
    }
    
    public double calcularTotal(){
        double total=0.0;
        for (int i = 0; i <this.contadorProductos; i++) {
            total+=this.productos[i].getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("Id Orden: "+ this.idOrden);
        System.out.println("Total: $"+ this.calcularTotal());
        System.out.println("Productos de la orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
        System.out.println("\n");
    }
    
}
