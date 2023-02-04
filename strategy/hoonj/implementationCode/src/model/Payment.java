package model;

import paymentway.PaymentWay;

/**
 * 결재 클래스
 * 결재방법은 인터페이스로 구성
 */
public class Payment {

    private PaymentWay paymentWay;

    public void setPaymentWay(PaymentWay paymentWay) {
        this.paymentWay = paymentWay;
    }

    public void pay(){
        this.paymentWay.pay();
    }
}
