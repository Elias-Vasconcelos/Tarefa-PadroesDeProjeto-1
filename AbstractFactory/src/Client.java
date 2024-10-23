public class Client {
    String tipo;
    Boolean hasContract;

    public Client(String tipo, Boolean hasContract) {
        this.tipo = tipo;
        this.hasContract = hasContract;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getHasContract() {
        return hasContract;
    }

    public void setHasContract(Boolean hasContract) {
        this.hasContract = hasContract;
    }
}
