import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Corrida_de_tartarugas {
    public static void  main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int quantidadedeEntradas = 3;


        while(quantidadedeEntradas > 0){
            int numeroQuantidade = Integer.parseInt(br.readLine());

            if(numeroQuantidade >= 1 && numeroQuantidade <= 500){
                String[] s = new String[numeroQuantidade];
                s = br.readLine().split(" ");
                int maiorVelocidade = Integer.parseInt(s[0]);

                for (int i = 0; i < numeroQuantidade; i++){
                    String t = s[i];
                    int tartaruga = Integer.parseInt(t);

                    if(tartaruga > maiorVelocidade){
                        maiorVelocidade = tartaruga;
                    }
                }

                if(maiorVelocidade < 10){
                    System.out.println("1");
                }
                else if(maiorVelocidade >= 10 && maiorVelocidade < 20){
                    System.out.println("2");
                }
                else if (maiorVelocidade >= 20){
                    System.out.println("3");
                }
                quantidadedeEntradas --;
            }
            else {
                System.out.println("Insira um valor entre 1 e 500");
            }
        }
    }

}