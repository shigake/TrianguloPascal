
import java.util.Scanner;

public class TrianguloPascal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Qual o tamanho do triangulo de pascal? ");
        int nlinhas = ler.nextInt();
        int tpascal[][];
        tpascal = new int[nlinhas][nlinhas];

        for (int x = 0; x < nlinhas; x++) {
            System.out.println();
            for (int y = 0; y <= x; y++) {
                if (y == 0) {
                    tpascal[x][y] = 1;
                }
                if (x == y) {
                    tpascal[x][y] = 1;
                }
                if ((y != 0) & (x != y)) {
                    tpascal[x][y] = tpascal[x - 1][y - 1] + tpascal[x - 1][y];
                }
                System.out.print(tpascal[x][y] + "  ");

            }
        }
	System.out.println("\n");
    }
}
