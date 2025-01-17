package br.com.alura.screenmatch.modelo;

public class Filme {
    private String nome;
    private int anoDelancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvalaicoes;
    private int duracaoEmMinutos;

   public int getTotalDeAvalaicoes(){
        return totalDeAvalaicoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDelancamento(int anoDelancamento) {
        this.anoDelancamento = anoDelancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){

        System.out.println("Nome do filme" + nome);

    }
   public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvalaicoes ++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvalaicoes;
    }
}
