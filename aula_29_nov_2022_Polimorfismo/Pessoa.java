package aula_29_nov_2022_Polimorfismo;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private String CPF; 
    private String RG;
    private String genitor;
    private String genitora;
    private String endereco;
    private String estadoCivil;
    private String naturalidade;
    
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String getCPF() {
        return CPF;
    }
    
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    
    public String getRG() {
        return RG;
    }
    
    public void setRG(String rG) {
        RG = rG;
    }
    
    public String getGenitor() {
        return genitor;
    }
    
    public void setGenitor(String genitor) {
        this.genitor = genitor;
    }
    
    public String getGenitora() {
        return genitora;
    }
    
    public void setGenitora(String genitora) {
        this.genitora = genitora;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getEstadoCivil() {
        return estadoCivil;
    }
    
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public String getNaturalidade() {
        return naturalidade;
    }
    
    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public abstract void fazerAniversario();
    
}
