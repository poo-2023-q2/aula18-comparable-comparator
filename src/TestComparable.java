import java.util.Arrays;

public class TestComparable {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("amanda", "bueno", "123", 2.0);
        Aluno a2 = new Aluno("joana", "cardoso", "122", 3.0);
        Aluno a3 = new Aluno("pedro", "amaranto", "121", 3.5);
        Aluno a4 = new Aluno("carlos", "pedrosa", "130", 1.5);

        Aluno[] alunos = new Aluno[] {a1, a2, a3, a4};

        Arrays.sort(alunos);

        System.out.println(Arrays.toString(alunos));
    }
}
