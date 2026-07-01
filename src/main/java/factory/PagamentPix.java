package factory;

public class PagamentPix implements Payment {
    @Override
    public void process() {
        System.out.println("Processing payment... PIX");
    }
}
