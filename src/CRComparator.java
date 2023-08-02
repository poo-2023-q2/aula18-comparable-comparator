import java.util.Comparator;

public class CRComparator implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        if (a1.getCr() > a2.getCr()) {
            return 1;
        } else if (a1.getCr() < a2.getCr()) {
            return -1;
        }

        return 0;
    }
    
}
