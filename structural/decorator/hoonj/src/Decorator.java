import abillity.Abillity;
import abillity.AbillityOfJ;
import abillity.ComingDeadLineProject;
import abillity.NewProjectJoin;

public class Decorator {
    public static void main(String[] args) {
        try{
            Abillity abillity = new AbillityOfJ();
            abillity = new NewProjectJoin(abillity);
            abillity = new ComingDeadLineProject(abillity);
            System.out.println(abillity.getAbillities());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
