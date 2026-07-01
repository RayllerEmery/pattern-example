package factory;

public class PagamentCard implements Payment {
    @Override
    public void process() {
        System.out.println("Processing payment... CARD");
    }
}
