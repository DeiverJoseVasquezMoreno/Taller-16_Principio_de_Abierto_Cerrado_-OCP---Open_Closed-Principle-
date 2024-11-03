public class DescuentoFijo extends Descuento {
    private double monto;

    public DescuentoFijo(double monto) {
        this.monto = monto;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio - monto;
    }
}
