// Código inicial
// public class Documento {
//     public void exportarPDF(String contenido) {
//         System.out.println("Exportando a PDF: " + contenido);
//     }
// }

// Código refactorizado
public abstract class Documento {
    public abstract void exportar(String contenido);
}
