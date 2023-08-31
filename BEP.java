import java.util.Arrays;

public class BEP{
        public static void main(String[] args) {

                String[][] matriz = new String[8][8];

                System.out.println(Arrays.toString(matriz[0]));

                for (int i = 0; i < 8; i++) {

                        for (int j = 0; j < 8; j++) {
                                
                                matriz[i][j] = "" + i + "";

                        }

                        System.out.println(Arrays.toString(matriz[i]));
                }

        }
}