package abillity;

public class ComingDeadLineProject extends AbillityDecorator{
    public ComingDeadLineProject(Abillity abillity) {
        super(abillity);
    }

    @Override
    public String getAbillities() {
        return super.getAbillities() + "\n마감이 다가오자 데코레이터에서 추가한 능력: 이거 좀 대신 해줘! 스킬";
    }
}
