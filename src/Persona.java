public class Persona {

    int dni;
    String nombre;
    Carrito[] compras;
    int totalCompras;


    public Persona(String nombre) {
        this.nombre = nombre;
        this.compras = new Carrito[5];
        this.totalCompras = 0;
    }

    public void AgregarCompra(Carrito compra) {
        if (totalCompras < 5) {
            compras[totalCompras] = compra;
            totalCompras++;
        }
    }

    public double TotalGastado() {
        double suma = 0;
        for (Carrito carro : compras) {
            if (carro != null)
                suma += carro.CalcularPrecio();
        }
        return suma;
    }
}
