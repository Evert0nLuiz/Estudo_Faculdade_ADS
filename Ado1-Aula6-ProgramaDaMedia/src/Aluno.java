public class Aluno {

    private String nome;
    private int chamada;
    private String curso;
    private String turma;

    public Aluno(){}
    public Aluno(String nome, int chamada, String curso, String turma){
        this.nome = nome;
        this.chamada = chamada;
        this.curso = curso;
        this.turma = turma;
    }
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getChamada() {
        return chamada;
    }

    public void setChamada(int chamada) {
        this.chamada = chamada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
