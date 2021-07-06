import java.io.IOException;
import java.util.Scanner;

public class EncaixaOuNao {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();

//continue a solucao

        for (int i = 0; i < N; i++){
            String A = leitor.next();
            String B = leitor.next();


            //System.out.println(A.subSequence(A.length() - B.length(), A.length()));

            if(B.length() > A.length()){
                System.out.println("nao encaixa");
            }

            else if(A.length() == B.length()){
                if(A.equals(B)){
                    System.out.println("encaixa");
                }
                else {
                    System.out.println("nao encaixa");
                }
            }

            else {
                final CharSequence charSequence = A.subSequence(A.length() - B.length(), A.length());
                if (charSequence.equals(B)) {
                    System.out.println("encaixa");
                } else {
                    System.out.println("nao encaixa");
                }
            }


        }

    }
}

