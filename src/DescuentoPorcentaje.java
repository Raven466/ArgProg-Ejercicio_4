public class DescuentoPorcentaje extends Descuento {
    public DescuentoPorcentaje() {
        super(0);
    }
    public DescuentoPorcentaje(float valor) {
        super(valor);
        this.monto = valor;
    }

    @Override
    public double CalcularDescuento(double valorInicial) {
        return valorInicial - (valorInicial * this.monto);
    }
}
