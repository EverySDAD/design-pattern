package screen.adaptee;

/**
 * 골프존과 카카오 스크린은 서로 다른 함수를 제공
 */
public class KakaoScreen {

    private String kakaoFriends;

    private String name;
    private int score;
    private int hole;

    public KakaoScreen(String kakaoFriends, String name, int score, int hole) {
        this.kakaoFriends = kakaoFriends;
        this.name = name;
        this.score = score;
        this.hole = hole;
    }

    public String[] finalSocres(){
        return new String[]{kakaoFriends, name, String.valueOf(score), String.valueOf(hole)};
    }
}
