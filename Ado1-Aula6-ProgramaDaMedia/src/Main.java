


public class Main {
   static UserInterface io = new UserInterface();
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        io.boasVindas();
        aluno.setNome(io.lerTexto("Informe o nome do Aluno: "));
        io.pularLinha();
        aluno.setCurso(io.lerTexto("Informe o curso do Aluno: "));
        io.pularLinha();
        aluno.setTurma(io.lerTexto("Informe a turma do Aluno: "));
        io.pularLinha();
        aluno.setChamada(io.lerInt("Informe o número da chamada do Aluno: "));
        io.bordaFinal();



        NotasDisciplina[] nts = new NotasDisciplina[io.lerInt("Quantas notas irá passar ?")];

        for (int i = 0; i < nts.length;i++) {
            NotasDisciplina ntsDisciplina = new NotasDisciplina();

            ntsDisciplina.setDisciplina(io.lerTexto("Informe a displina"));
            ntsDisciplina.setFaltas(io.lerInt("Informe a quantidade de faltas"));
            ntsDisciplina.setMedia(io.lerDouble("Informe a media"));

            nts[i] = ntsDisciplina;

        }

        NotasAluno ntsAluno = new NotasAluno();

        ntsAluno.setAluno(aluno);
        ntsAluno.setDisciplinas(nts);

        Boletim boletim = new Boletim();

        Resultado resultado = boletim.avaliar(ntsAluno);
        io.bordaFinal();
        io.escrever("O aluno " + resultado.getAluno().getNome()
                + "\nCurso: " + resultado.getAluno().getCurso()
                + "\nTurma: "+ resultado.getAluno().getTurma()
                + "\nNúmero: " +  resultado.getAluno().getChamada()
                + "\nSituação: " + resultado.getSituacao() + "\n");
        io.bordaFinal();
        for (NotasDisciplina index : resultado.getDisciplinas()){
            io.escrever("Matéria: " + index.getDisciplina()
                    + "\nNota: " + index.getMedia()+ "\n");
        }
        io.bordaFinal();






    }


}