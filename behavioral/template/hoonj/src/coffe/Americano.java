package coffe;

public class Americano extends Coffee{
    @Override
    protected void source() {
        System.out.println("에스프레소 2샷 추가");
    }

    @Override
    protected void water() {
        System.out.println("물 400ml 추가");
    }
}
