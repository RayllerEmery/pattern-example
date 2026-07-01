package factory;

public class PagamentBoleto implements Payment {
    @Override
    public void process() {
        System.out.println("Processing payment... BOLETO");
    }
}
