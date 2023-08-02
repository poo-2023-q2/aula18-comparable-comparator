import java.util.Comparator;

public class RAComparator implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return a1.getRA().compareTo(a2.getRA());
    }
    
}
