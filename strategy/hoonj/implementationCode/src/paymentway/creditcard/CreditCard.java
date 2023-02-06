package paymentway.creditcard;

import paymentway.PaymentWay;

import java.util.Scanner;

public class CreditCard implements PaymentWay {
    @Override
    public void pay() {
        System.out.println("신용카드입니다.");
        System.out.println(installmentSelectInput() + "개월 할부로 진행합니다.");
    }

    private int installmentSelectInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("할부개월수를 입력해 주세요 : ");
        try{
            return sc.nextInt();
        }catch(Exception e){
            System.out.println("번호만 입력해 주세요 !");
            return installmentSelectInput();
        }
    }
}
