package paymentway.cash;

import paymentway.PaymentWay;

public class Cash implements PaymentWay {
    @Override
    public void pay() {
        System.out.println("현금지불합니다. 돈 주세요 지금");
    }
}
