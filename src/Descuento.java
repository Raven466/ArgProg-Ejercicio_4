import java.time.LocalDate;

public class Descuento {
    String descripcion;
    double monto;
    LocalDate fechaFin;

    public Descuento(double monto) {
        this.monto = monto;
    }

    public void BorrarDescuento() {
        this.monto = 0;
    }

    public double CalcularDescuento(double valorInicial) {
        return valorInicial - monto;
    }
}
