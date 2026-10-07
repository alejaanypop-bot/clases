package clasesatributosmetodos;

public class MainProducto {
    public static void main(String[] args) {
        Producto producto1 = new Producto();
        Producto producto2 = new Producto();

        producto1.nombre = "Camiseta";
        producto1.precio = 15;
        producto1.categoria = "Ropa";

        producto2.nombre = "Mochila";
        producto2.precio = 40;
        producto2.categoria = "Accesorios";

        producto1.mostrarInformacion();
        producto1.mostrarCategoria();
        producto2.mostrarInformacion();
        producto2.mostrarCategoria();

        producto1.precio = 20;

        producto1.mostrarInformacion();
        producto2.mostrarInformacion();
    }
}
