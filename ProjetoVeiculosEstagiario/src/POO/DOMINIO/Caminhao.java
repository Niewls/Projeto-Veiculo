package POO.DOMINIO;

public class Caminhao extends BaseVeiculosTerrestres{
    private double pesoLiquido;
    private double pesoTotal;
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
        System.out.println("Chassi: " + this.chassi);
        System.out.println("Placa: " + this.placa);
        System.out.println("Codigo Renavam: " + this.codigoRenavam);
        System.out.println("Tipo do Câmbio: " + this.tipoCambio);
        System.out.println("Peso Liquido: " + this.pesoLiquido);
        System.out.println("Peso Total: " + this.pesoTotal);
        System.out.println("Eixos:" + this.eixos);
        System.out.println("Quantidade de Portas: " + this.portas);
        System.out.println("-----------------------------------------");
        
    }
    public double getPesoLiquido() {
        return pesoLiquido;
    }
    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }
    public double getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public Caminhao(int codigo, String cidadeUF, String estadoUF, String nome, String modelo, String cor, int anoModelo,
            int anoFabricacao, int assentos, int rodas, String fabricante, double potencia, String tipoCombustivel,
            String nomeProprietario, String tipoVeiculo, int qtdeMotores, int qtdeOcupantes, String chassi,
            String placa, String codigoRenavam, String tipoCambio, double pesoLiquido, double pesoTotal, int eixos,
            int portas) {
        super(codigo, estadoUF, cidadeUF, nome, modelo, cor, anoModelo, anoFabricacao, assentos, rodas, fabricante,
                potencia, tipoCombustivel, nomeProprietario, tipoVeiculo, qtdeMotores, qtdeOcupantes, chassi, placa,
                codigoRenavam, tipoCambio, eixos);
        this.pesoLiquido = pesoLiquido;
        this.pesoTotal = pesoTotal;
        this.portas = portas;
    }

    
    
}
