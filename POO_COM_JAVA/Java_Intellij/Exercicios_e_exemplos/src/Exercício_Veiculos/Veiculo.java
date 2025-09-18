public class Veiculo{

    public String chassi;
    public int ano;
    public int cor;

    public Veiculo(String chassi, int ano, int cor){
        this.chassi = chassi;
        this.ano = ano;
        this.cor = cor;
    }

    public void exibirDetalhes(){
        System.out.println(this.chassi);
        System.out.println(this.ano);
        System.out.println(this.cor);
}

}