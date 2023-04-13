public class DescuentoFijo extends Descuento {
    public DescuentoFijo(float valor) {
        super(valor);
        this.monto = valor;
    }

    @Override
    public double CalcularDescuento(double valorInicial) {
        return valorInicial - this.monto;
    }
}
