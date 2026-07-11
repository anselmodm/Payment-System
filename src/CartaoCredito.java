public class CartaoCredito extends FormaDePagamento{

    @Override
    public void processarPagamento(){

        System.out.println("Pagamento efectuado usando Cartão de Credito");
    }
}
