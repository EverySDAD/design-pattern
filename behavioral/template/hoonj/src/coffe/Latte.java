package coffe;

public class Latte extends Coffee{

    @Override
    protected void source() {
        System.out.println("에스프레소: 1샷");
    }

    @Override
    protected void water() {
        System.out.println("물: 반잔");
    }

    /*훅 메서드가 필요한 특별한 상황에선 재정의*/
    @Override
    protected void hook() {
        System.out.println("휘핑크림 추가");
    }
}
