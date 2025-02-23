public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getAltura() {
        return altura;
    }
    public double getPeso() {
        return peso;
    }
    public double calcularImc() {
        return peso/Math.pow(altura,2);
    }
    public String classificarImc(){
        double imc= this.calcularImc();
        if(imc<18.5){
            return "Baixo";
        }
        else if(imc>30){
            return "Alto";
        }
        else if(imc<=30 && imc>=18.5){
            return "Normal";
        }
        else{
            return "Invalido";
        }
    }
}
