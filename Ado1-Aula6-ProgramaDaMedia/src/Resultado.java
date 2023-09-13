public class Resultado {

    private Aluno aluno;
    private NotasDisciplina[] disciplinas;
    private String situacao;

    private int qtdAprovacoes;
    private int qtdReprovacoes;

    public int getQtdReprovacoes() {
        return qtdReprovacoes;
    }

    public void setQtdReprovacoes(int qtdReprovacoes) {
        this.qtdReprovacoes = qtdReprovacoes;
    }

    public int getQtdAprovacoes() {
        return qtdAprovacoes;
    }

    public void setQtdAprovacoes(int qtdAprovacoes) {
        this.qtdAprovacoes = qtdAprovacoes;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public NotasDisciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(NotasDisciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
