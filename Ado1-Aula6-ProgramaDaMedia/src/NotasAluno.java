public class NotasAluno {

    private Aluno aluno;

    private NotasDisciplina[] disciplinas;

    public Aluno getAluno() {
        return aluno;
    }

    public NotasDisciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(NotasDisciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
