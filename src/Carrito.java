import java.text.DateFormatSymbols;
import java.time.LocalDate;


public class Carrito {
    Producto[] productos;
    Descuento descuento;
    public Carrito() {
        productos = new Producto[3];
    }

    public boolean HacerDescuento(Descuento desc) {
        if (desc != null && (desc.fechaFin == null || desc.fechaFin.isAfter(LocalDate.now()))) {
            this.descuento = desc;
            return true;
        }
        return false;
    }

    public double CalcularPrecio() {
        double suma = 0;
        for (Producto prod : productos) {
            if (prod != null)
                suma += prod.precio * prod.cantidad;
        }
        if (descuento != null && suma > descuento.monto)
            suma = suma - descuento.CalcularDescuento(suma);
        return suma;
    }
}
