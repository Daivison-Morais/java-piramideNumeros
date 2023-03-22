public class PiramideNumeros {
    public static void main(String[] args) {
        int numeroLinhas = 9;
        System.out.println("Piramide de  " + numeroLinhas + " linhas");

        for (int i = 1; i <= numeroLinhas; i++) {

            String linha = "";
            for (int j = 1; j <= i; j++) {
                linha = linha + i;
            }
            System.out.println(linha);
        }

    }
}
