import model.Payment;
import model.Payments;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Payments[] paymentWay = Payments.values();
        int nextInt = paymentSelectInput(paymentWay);
        System.out.println(paymentWay[nextInt].getText() + " 입력했습니다.");
        Payment payment = new Payment();
        /* 입력값에 따라 로직 변경*/
        payment.setPaymentWay(paymentWay[nextInt].getPaymentWay());
        payment.pay();
    }

    /**
     * 입력 잘못입력하면 재귀로 부르기위해서 따로 함수로 뻄
     * @param payment
     * @return
     */
    private static int paymentSelectInput(Payments[] payment){
        Scanner sc = new Scanner(System.in);
        System.out.println("다음은 결재 수단 목록입니다.");
        for (int i = 0; i < payment.length; i++) {
            System.out.println(i + ": " + payment[i].getText());
        }
        System.out.print("결재 수단의 번호를 입력해 주세요 : ");
        try{
            int nextInt = sc.nextInt();
            return nextInt < payment.length ? nextInt : paymentSelectInput(payment);
        }catch(Exception e){
            System.out.println("번호만 입력해 주세요 !");
            return paymentSelectInput(payment);
        }
    }
}