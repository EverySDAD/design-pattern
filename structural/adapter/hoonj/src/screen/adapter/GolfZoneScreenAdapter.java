package screen.adapter;

import screen.adaptee.GolfzoneScreen;
import screen.target.ScreenGolf;

/**
 * ScreenGolf 인터페이스를 사용해서 어댑터를 만들어줌
 */
public class GolfZoneScreenAdapter implements ScreenGolf {

    private final GolfzoneScreen golfzoneScreen;

    public GolfZoneScreenAdapter(GolfzoneScreen golfzoneScreen) {
        this.golfzoneScreen = golfzoneScreen;
    }

    @Override
    public void finalScore() {
        String name = golfzoneScreen.getName();
        short hole = golfzoneScreen.getHole();
        short score = golfzoneScreen.getScore();
        System.out.printf("%s가 %d홀, 최종스코어 %d를 기록했습니다.\n",name,hole,score);
    }
}
