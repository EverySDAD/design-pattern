package paymentway.depositwithoutbankbook;

import paymentway.PaymentWay;

/**
 * 무통장 입금
 */
public class DepositWithoutBankbook implements PaymentWay {
    @Override
    public void pay() {
        System.out.println("무통장 입금입니다.");
        this.accountNumber();
    }

    private void accountNumber(){
        System.out.println("계좌번호: 농협 123-12-123123");
    }
}
