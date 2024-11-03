// Código inicial
// public class Mensajero {
//     public void enviarEmail(String mensaje) {
//         System.out.println("Enviando email: " + mensaje);
//     }
// }

// Código refactorizado
public abstract class Mensajero {
    public abstract void enviar(String mensaje);
}
