package coffe;

public class GreenTea extends Coffee{

    @Override
    protected void source() {
        System.out.println("녹차 티백 추가");
    }

    @Override
    protected void water() {
        System.out.println("뜨거운 물 한잔 추가");
    }
}
