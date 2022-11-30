package aula_29_nov_2022_Polimorfismo;

public class Funcionario extends Pessoa {
    private String NIS;
    private double salario;
    private double gratificacoes;
    private double auxilios;
    private int jornada;
    private int tempoServico;
    private double previdencia;
    private double fgts;
    private Boolean servidorPublico;

    public Funcionario() {
        this.NIS = "";
        this.salario = 1200;
        this.gratificacoes = 0;
        this.auxilios = 0;
        this.jornada = 8;
        this.tempoServico = 0;
        this.previdencia = 0.08;
        this.fgts = 0.08;
        this.servidorPublico = false;
    }

    public String getNIS() {
        return NIS;
    }

    public void setNIS(String NIS) {
        this.NIS = NIS;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getGratificacoes() {
        return gratificacoes;
    }

    public void setGratificacoes(double gratificacoes) {
        this.gratificacoes = gratificacoes;
    }

    public double getAuxilios() {
        return auxilios;
    }

    public void setAuxilios(double auxilios) {
        this.auxilios = auxilios;
    }

    public int getJornada() {
        return jornada;
    }

    public void setJornada(int jornada) {
        this.jornada = jornada;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }

    public double getPrevidencia() {
        return previdencia;
    }

    public void setPrevidencia(double previdencia) {
        this.previdencia = previdencia;
    }

    public double getFgts() {
        return fgts;
    }

    public void setFgts(double fgts) {
        this.fgts = fgts;
    }

    public Boolean getServidorPublico() {
        return servidorPublico;
    }

    public void setServidorPublico(Boolean servidorPublico) {
        this.servidorPublico = servidorPublico;
    }

    @Override
    public void fazerAniversario() {
        this.setIdade(this.getIdade() + 1);
    }

    public void fazerAniversario(int quantos) {
        this.setIdade(this.getIdade() + quantos);
    }

    public double calculaRemuneracao() {
        double vencimentos = this.getSalario() + this.getGratificacoes();
        double fgts = 0;

        if (!servidorPublico) {
            fgts = vencimentos * this.getFgts();
        }

        double previdencia = vencimentos * this.getPrevidencia();

        double remuneracao = vencimentos - fgts - previdencia + this.getAuxilios();

        return remuneracao;
    }

    public void trabalhar(){
        System.out.println("O funcionário está trabalhando!");
    }
}
