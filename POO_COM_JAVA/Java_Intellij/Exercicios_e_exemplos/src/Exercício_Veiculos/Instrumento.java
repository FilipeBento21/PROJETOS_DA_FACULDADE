public class Instrumento {

    public String nomeIsntrumento;
    public int anoFabricacao;
    public String tipoInstrumento;

    public Instrumento(String nomeInstrumento, int anoFabricacao, String tipoInstrumento) {
        this.nomeIsntrumento = nomeInstrumento;
        this.anoFabricacao = anoFabricacao;
        this.tipoInstrumento = tipoInstrumento;
    }
    public void tocar() {
        System.out.println("Solando com o intrumento: ");
    }
}
