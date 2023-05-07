package abillity;

public class NewProjectJoin extends AbillityDecorator{

    public NewProjectJoin(Abillity abillity) {
        super(abillity);
    }

    @Override
    public String getAbillities() {
        return abillity.getAbillities() + "\n신규 프로젝트에 들어가게 되자 데코레이터에서 추가한 능력: 신규 프로젝트 하는척 스킬!";
    }
}