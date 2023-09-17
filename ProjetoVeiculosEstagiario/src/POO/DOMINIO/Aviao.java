package POO.DOMINIO;

public class Aviao extends BaseVeiculo{
    private String registroAeronave;
    private double alturaMaxima;
    private int portas;

    @Override
    public void imprimir() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Estado: " + this.estadoUF);
        System.out.println("Cidade: " + this.cidadeUF);
        System.out.println("Nome: " + this.nome);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano Modelo: " + this.anoModelo);
        System.out.println("Ano de Fabricacao: " + this.anoFabricacao);
        System.out.println("Quantidade de Assentos: " + this.assentos);
        System.out.println("Quantidade de Rodas:" + this.rodas);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Potencia: " + this.potencia);
        System.out.println("Tipo de Combustivel: " + this.tipoCombustivel);
        System.out.println("Nome do Proprietario: " + this.nomeProprietario);
        System.out.println("Tipo do Veiculo: " + this.tipoVeiculo);
        System.out.println("Quantidade de Motores: " + this.qtdeMotores);
        System.out.println("Quantidade de Ocupantes: " + this.qtdeOcupantes);
        System.out.println("Registro da Aeronave: " + this.registroAeronave);
        System.out.println("Altura Máxima: " + this.alturaMaxima);
        System.out.println("Quantidade de Portas:" + this.portas);
        System.out.println("-----------------------------------------");
    }
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public String getRegistroAeronave() {
        return registroAeronave;
    }
    public void setRegistroAeronave(String registroAeronave) {
        this.registroAeronave = registroAeronave;
    }
    public double getAlturaMaxima() {
        return alturaMaxima;
    }
    public void setAlturaMaxima(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }
    public Aviao(int codigo, String estadoUF, String cidadeUF, String nome, String modelo, String cor, int anoModelo,
            int anoFabricacao, int assentos, int rodas, String fabricante, double potencia, String tipoCombustivel,
            String nomeProprietario, String tipoVeiculo, int qtdeMotores, int qtdeOcupantes, int portas,
            String registroAeronave, double alturaMaxima) {
        super(codigo, estadoUF, cidadeUF, nome, modelo, cor, anoModelo, anoFabricacao, assentos, rodas, fabricante,
                potencia, tipoCombustivel, nomeProprietario, tipoVeiculo, qtdeMotores, qtdeOcupantes);
        this.portas = portas;
        this.registroAeronave = registroAeronave;
        this.alturaMaxima = alturaMaxima;
    }
    
}
