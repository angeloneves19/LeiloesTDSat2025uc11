public class Main {
    public static void main(String[] args) {
        // Garante que a interface gráfica seja criada na thread de eventos do Swing
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new cadastroVIEW().setVisible(true);
            }
        });
    }
}