public class Saxofone extends Instrumento{
    public String afinacao;

    public Saxofone(String nomeInstrumento, int anoFabricacao, String tipoInstrumento,
                 String afinacao){
        super(nomeInstrumento,anoFabricacao,tipoInstrumento);
        this.afinacao = afinacao;
    }

    @Override
    public void tocar() {
        System.out.println(" Solando com o saxofone 🎷🎷🎷");
    }
}
