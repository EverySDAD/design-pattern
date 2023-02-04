package model;

import paymentway.PaymentWay;

/**
 * 결재 클래스
 * 결재방법은 인터페이스로 구성
 */
public class Payment {

    /* 디자인 원칙에 의해 상속보다는 구성을 활용했다. */
    private PaymentWay paymentWay;

    /* 구성을 이용해 결재 방법이 쉽게 교체된다. */
    public void setPaymentWay(PaymentWay paymentWay) {
        this.paymentWay = paymentWay;
    }

    public void pay(){
        this.paymentWay.pay();
    }
}
