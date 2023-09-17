package POO.DOMINIO;
public abstract class BaseVeiculosTerrestres extends BaseVeiculo{
    protected String chassi;
    protected String placa;
    protected String codigoRenavam;
    protected String tipoCambio;
    protected int eixos;
    
    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCodigoRenavam() {
        return codigoRenavam;
    }

    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public BaseVeiculosTerrestres(int codigo, String cidadeUF, String estadoUF, String nome, String modelo, String cor,
            int anoModelo, int anoFabricacao, int assentos, int rodas, String fabricante, double potencia,
            String tipoCombustivel, String nomeProprietario, String tipoVeiculo, int qtdeMotores, int qtdeOcupantes,
            String chassi, String placa, String codigoRenavam, String tipoCambio, int eixos) {
        super(codigo, cidadeUF, estadoUF, nome, modelo, cor, anoModelo, anoFabricacao, assentos, rodas, fabricante,
                potencia, tipoCombustivel, nomeProprietario, tipoVeiculo, qtdeMotores, qtdeOcupantes);
        this.chassi = chassi;
        this.placa = placa;
        this.codigoRenavam = codigoRenavam;
        this.tipoCambio = tipoCambio;
        this.eixos = eixos;
    }

    

}
    

