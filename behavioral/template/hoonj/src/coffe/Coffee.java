package coffe;

public abstract class Coffee {

    /*상속받은 클래스에서 재정의 필요*/
    protected abstract void source();
    protected abstract void water();

    /*훅 - 평소엔 아무기능없다가 특별한 경우 재정의해서 사용한다.*/
    protected void hook(){}

    /*기본 연산 구현*/
    public void getCoffee(){
        this.source();
        this.water();
        this.hook();
    }
}
