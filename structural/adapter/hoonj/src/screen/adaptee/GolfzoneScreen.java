package screen.adaptee;

/**
 * 골프존과 카카오 스크린은 서로 다른 함수를 제공
 */
public class GolfzoneScreen {

    private String name;
    private short hole;
    private short score;

    public GolfzoneScreen(String name, short hole, short score) {
        this.name = name;
        this.hole = hole;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public short getHole() {
        return hole;
    }

    public short getScore() {
        return score;
    }
}
