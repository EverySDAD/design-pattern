package model;

import java.util.Arrays;

/**
 * 특정 사이트를 막기위해 KoreaTelecomProxy에서 검열을 한다.
 */
public class KoreaTelecomProxy implements AccessSite {

    private AccessSite accessSiteReal;

    /**
     * 실제 사용할때 초기화
     * 프록시 패턴을 이용해 중간에 가로체서 검열을 한다.
     */
    @Override
    public void accessSite(Sites site) {
        /*검열 사이트 리스트*/
        Sites[] accessBlockSites = {Sites.NUNNUTV, Sites.ADULT};

        /*한국텔레콤의 검열*/
        if (Arrays.asList(accessBlockSites).contains(site)) {
            System.out.println("인터넷 검열결과 접속못하는 사이트로 지정된 사이트입니다. 이게바로 대한밈국이다 ~ 무궁화 삼천이 화려강산 ~ (태극기 펄럭 ~ , 무궁화 활짝~!)");
            return;
        }

        /*가상 프록시: 실제로 사용할때 생성*/
        if (this.accessSiteReal == null) {
            this.accessSiteReal = new AccessSiteReal(AccessNation.KR);
        }
        accessSiteReal.accessSite(site);
    }
}
