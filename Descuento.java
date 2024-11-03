// Código inicial
// public class Descuento {
//     public double aplicarDescuento(double precio) {
//         return precio * 0.90; // Aplica un 10% de descuento
//     }
// }

// Código refactorizado
public abstract class Descuento {
    public abstract double aplicarDescuento(double precio);
}

