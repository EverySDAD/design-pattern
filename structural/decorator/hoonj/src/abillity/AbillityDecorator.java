package abillity;

public abstract class AbillityDecorator implements Abillity{

    protected final Abillity abillity;

    public AbillityDecorator(Abillity abillity) {
        this.abillity = abillity;
    }

    @Override
    public String getAbillities() {
        return abillity.getAbillities();
    }
}