package model;

/**
 * - AccessSiteReal 초기화가 무겁기 때문에 실제로 사용할때 Real 객체를 초기화한다.
 * - VPN을 사용할때 이용
 */
public class AccessSiteProxy implements AccessSite{

    private AccessSite accessSiteReal;
    private AccessNation accessNation;

    public AccessSiteProxy(AccessNation accessNation) {
        this.accessNation = accessNation;
    }

    @Override
    public void accessSite(Sites site) {
        /*가상프록시: 실제로 사용할때 생성*/
        if (this.accessSiteReal == null) {
            this.accessSiteReal = new AccessSiteReal(this.accessNation);
        }

        this.accessSiteReal.accessSite(site);
    }
}
