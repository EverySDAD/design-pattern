package model;

public class AccessSiteReal implements AccessSite {

    private AccessNation accessNation;

    /**
     * 실제 접속로직은 매우 무겁다고 가정한다.
     * @param accessNation
     */
    public AccessSiteReal(AccessNation accessNation) {
        /**
         * 접속하기위해 수많은 초기화작업이 있다고 가정..
         */
        this.accessNation = accessNation;
    }

    @Override
    public void accessSite(Sites site) {
        System.out.println(accessNation.getName()+ "에서 " + site.getName() + "에 접속하였습니다.");
    }
}
