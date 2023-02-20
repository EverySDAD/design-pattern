import screen.adaptee.GolfzoneScreen;
import screen.adaptee.KakaoScreen;
import screen.adapter.GolfZoneScreenAdapter;
import screen.adapter.KakaoScreenAdapter;
import screen.target.ScreenGolf;

/**
 * 클라이언트는 각 Adeptee가 무슨 일을 하는지 알필요가 없다 그냥 Target를 구현한 어댑터로 변환해주고 Target만 사용하면 됨
 */
public class AdapterPattern {
    public static void main(String[] args) {

        /* 골프존과 카카오 스크린 결좌 객체 생성 */
        KakaoScreen kakaoScreen = new KakaoScreen("프로도", "J", 144, 18);
        GolfzoneScreen golfzoneScreen = new GolfzoneScreen("이훈재", (short) 18, (short) 80);

        /* ScreenGolf 객체로 변경하기위해 어댑터 장착 */
        ScreenGolf kakaoScreenAdapter = new KakaoScreenAdapter(kakaoScreen);
        ScreenGolf golfZoneScreenAdapter = new GolfZoneScreenAdapter(golfzoneScreen);

        /* ScreenGolf객체 사용
         * 클라이언트는 ScreenGolf 인터페이스만 알고있으면 됨 */
        getFinalscore(kakaoScreenAdapter);
        getFinalscore(golfZoneScreenAdapter);
    }

    private static void getFinalscore(ScreenGolf screenGolf) {
        screenGolf.finalScore();
    }
}
