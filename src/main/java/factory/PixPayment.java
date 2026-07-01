package factory;

public class PixPayment implements Payment {
    @Override
    public void process() {
        System.out.println("Processing payment... PIX");
    }
}

