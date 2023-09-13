public class Boletim {

    public Resultado avaliar (NotasAluno notasAluno){
        Resultado resu = new Resultado();
        int qtdAprovado = 0;
        int qtdReprovado = 0;
        resu.setAluno(notasAluno.getAluno());
        resu.setDisciplinas(notasAluno.getDisciplinas());

        for (NotasDisciplina i : resu.getDisciplinas()){
            if (verificarSituacao(i.getMedia(),i.getFaltas()).equals("Aprovado")){
                   qtdAprovado += 1;
            }else {
                qtdReprovado += 1;
            }
            resu.setQtdAprovacoes(qtdAprovado);
            resu.setQtdReprovacoes(qtdReprovado);

            if(resu.getQtdReprovacoes()>= 1){
                resu.setSituacao("Reprovado");
            }else{
                resu.setSituacao("Aprovado");
            }
        }

        return resu;
    }
    private String verificarSituacao(double media, int faltas){

        if(media > 6 && faltas < 4){
            return "Aprovado";
        }else if (faltas > 4 ){
            return "DP por Falta";
        } else {
            return "DP por Nota";
        }
    }
}
