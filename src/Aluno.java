public class Aluno implements Comparable<Aluno> {
    private String nome;
    private String sobrenome;
    private String ra;
    private double cr;

    public Aluno(String nome, String sobrenome, String ra, double cr) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ra = ra;
        this.cr = cr;
    }

    public String getNome() {
        return nome;
    }

    public String getRA() {
        return ra;
    }

    public double getCr() {
        return cr;
    }

    @Override
    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(((Aluno)aluno).nome);
    }

    @Override
    public String toString() {
        return String.format("%s - %s %s - %.2f", ra, nome, sobrenome, cr);
    }
}
