import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 1. Implemente usted mismo el ejemplo visto en clase de “carrito de compras”
        // Listo


        // 2. En un programa main, lea de un archivo, por ejemplo separado por punto y comas, una lista de items,
        // arme los objetos correspondientes y con el método de carrito “precio”, retorne el resultado.


        Descuento descFijo = new DescuentoFijo(50);
        DescuentoFijo descFijo2 = new DescuentoFijo(50);
        DescuentoPorcentaje descPorc = new DescuentoPorcentaje(0.4f);

        Carrito carritoDesc = new Carrito();
        carritoDesc.descuento = descFijo2;
        carritoDesc.descuento = descPorc;

        Descuento dn = new DescuentoNieto();



        try {
            Carrito carro = new Carrito();
            List<String> archivo = Files.readAllLines(Paths.get("listaDeProductos.txt"));
            for (int i = 0; i < archivo.size() && i < 3; i++) {
                String[] linea = archivo.get(i).split(";");

                Producto prod = new Producto(linea[2]);
                prod.precio = Integer.parseInt(linea[1]);
                prod.cantidad = Integer.parseInt(linea[0]);
                carro.productos[i] = prod;
            }
            System.out.println("El precio del carrito es: " + carro.CalcularPrecio());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 3. Agregar una clase Persona con sus atributos Nombre, DNI y un arreglo de hasta 5 Carritos. Y una función que pueda cargar compras y devuelva el total gastado.

        Producto prod = new Producto("Azucar");
        prod.precio = 50;
        prod.cantidad = 5;

        Descuento desc = new Descuento(10);

        Carrito carrito = new Carrito();
        carrito.productos[0] = prod;
        carrito.descuento = desc;

        Persona pers = new Persona("Juancito");
        pers.AgregarCompra(carrito);

        System.out.println(pers.nombre + " compró un total de " + pers.TotalGastado());

    }
}
