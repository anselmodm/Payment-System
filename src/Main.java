import java.util.Scanner;

//@ADM_12FEB2026 Exercicio Módulo 3: POO. Sistema de Pagamento  - Polimorfismo
public class Main {

   static Scanner in = new Scanner(System.in);
    public static void pagar(FormaDePagamento pagamento){


        pagamento.processarPagamento();
    }

    public static void main(String[] args) {
     //Escolher o métodode pagamento
        FormaDePagamento pagamento;
        System.out.println("Introduza o método de pagamento.\n");
        System.out.println("1) Cartão de Credito\n2)PayPal");

        int opcao = Integer.parseInt(in.nextLine());
        switch (opcao){
            case 1:
                pagamento = new CartaoCredito();
                break;
            case 2:
                pagamento = new PayPal();
                break;
            default:
            throw new IllegalArgumentException("Opção incorreta");
        }


         pagar(pagamento);


    }
}