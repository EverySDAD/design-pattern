import model.*;

import java.util.Scanner;

public class ProxyPatternMain {

    public static void main(String[] args) {
        /**
         * 1. 접속할 사이트 선택
         * 2. 그냥 접속할지 VPN을 사용할지 선택
         * 3. 사이트 접속
         *  3-1. 접근 가능 권한 체크
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("환영합니다.");
        /*default 한국에서 접속*/
        AccessSite accessSite;

        System.out.println("VPN을 이용하시겠습니까?");
        System.out.println("1: 네 이용할께요, 2: 아니오");
        System.out.print("선택하세요 : ");
        AccessNation[] nations = AccessNation.values();

        /*VPN 사용한다고하면 프록시 생성*/
        if (input(sc, 1, 2) == 1) {
            System.out.println("나라를 선택하세요.");
            for (int i = 0; i < nations.length; i++) {
                System.out.println(i + ": " + nations[i].getName());
            }
            accessSite = new AccessSiteProxy(nations[input(sc, 0, nations.length)]);
        } else {
            /*사용안하면 인터넷 검열을 위해 한국텔레콤 프록시 사용*/
            accessSite = new KoreaTelecomProxy();
        }


        Sites[] sites = Sites.values();
        for (int i = 0; i < sites.length; i++) {
            System.out.println(i + ": " + sites[i].getName() + ", 주소: " + sites[i].getSite());
        }
        System.out.print("접속할 사이트를 선택하세요 : ");
        int input = input(sc, 0, sites.length - 1);

        accessSite.accessSite(sites[input]);
    }

    private static int input(Scanner sc, int min, int max) {
        try {
            int nextInt = sc.nextInt();
            if (min <= nextInt && nextInt <= max) {
                return nextInt;
            } else {
                System.out.println("범위 안에서 선택하세요: ");
                return input(sc, min, max);
            }
        } catch (Exception e) {
            System.out.print("숫자만 입력하세요: ");
            return input(sc, min, max);
        }
    }
}
