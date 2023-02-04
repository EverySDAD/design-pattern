package model;

import paymentway.PaymentWay;
import paymentway.cash.Cash;
import paymentway.creditcard.CreditCard;
import paymentway.depositwithoutbankbook.DepositWithoutBankbook;

/**
 * 결재종류
 */
public enum Payments {
    DEPOSIT_WITHOUT_BANKBOOK("무통장입금",new DepositWithoutBankbook()),
    CREDIT_CARD("신용카드", new CreditCard()),
    CASH("현금결재", new Cash());

    private final String text;
    /* 각각 다른 클래스로 관리한다. */
    private final PaymentWay paymentWay;

    Payments(String text, PaymentWay paymentWay) {
        this.text = text;
        this.paymentWay = paymentWay;
    }

    public String getText() {
        return text;
    }

    public PaymentWay getPaymentWay() {
        return paymentWay;
    }
}
