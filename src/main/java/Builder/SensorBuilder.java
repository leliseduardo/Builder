package Builder;

public class SensorBuilder {
    private Sensor sensor;

    public SensorBuilder() {
        this.sensor = new Sensor();
    }

    public Sensor build() {
        if(sensor.getNumeroSerie() == 0){
            throw new IllegalArgumentException("Número de série inválido");
        }
        if (sensor.getEnderecoMAC().equals("")) {
            throw new IllegalArgumentException("Endereço MAC inválido");
        }
        return this.sensor;
    }

    public SensorBuilder setNumeroSerie(int numeroSerie) {
        this.sensor.setNumeroSerie(numeroSerie);
        return this;
    }

    public SensorBuilder setEnderecoMAC(String enderecoMAC) {
        this.sensor.setEnderecoMAC(enderecoMAC);
        return this;
    }

    public SensorBuilder setFabricante(String fabricante) {
        this.sensor.setFabricante(fabricante);
        return this;
    }

    public SensorBuilder setModelo(String modelo) {
        this.sensor.setModelo(modelo);
        return this;
    }

    public SensorBuilder setNome(String nome) {
        this.sensor.setNome(nome);
        return this;
    }

    public SensorBuilder setFuncao(String funcao) {
        this.sensor.setFuncao(funcao);
        return this;
    }

    public SensorBuilder setUnidadeMedida(String unidadeMedida) {
        this.sensor.setUnidadeMedida(unidadeMedida);
        return this;
    }

    public SensorBuilder setBateria(Boolean bateria) {
        this.sensor.setBateria(bateria);
        return this;
    }

}
