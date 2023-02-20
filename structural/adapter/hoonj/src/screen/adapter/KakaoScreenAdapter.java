package screen.adapter;

import screen.adaptee.KakaoScreen;
import screen.target.ScreenGolf;

/**
 * ScreenGolf 인터페이스를 사용해서 어댑터를 만들어줌
 */
public class KakaoScreenAdapter implements ScreenGolf {

    private final KakaoScreen kakaoScreen;

    public KakaoScreenAdapter(KakaoScreen kakaoScreen) {
        this.kakaoScreen = kakaoScreen;
    }

    @Override
    public void finalScore() {
        String[] strings = this.kakaoScreen.finalSocres();
        System.out.printf("%s가 %s홀, 최종스코어 %s를 기록했습니다.\n", strings[1], strings[3], strings[2]);
    }
}
