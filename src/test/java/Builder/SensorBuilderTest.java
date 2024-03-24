package Builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SensorBuilderTest {
    @Test
    void deveRetornarExcecaoParaSensorSemNumeroDeSerie() {
        try {
            SensorBuilder SensorBuilder = new SensorBuilder();
            Sensor sensor = SensorBuilder
                    .setNome("Sensor de temperatura 1")
                    .setBateria(true)
                    .setEnderecoMAC("123H4NB523JH")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de série inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaSensorSemEnderecoMAC() {
        try {
            SensorBuilder SensorBuilder = new SensorBuilder();
            Sensor sensor = SensorBuilder
                    .setNumeroSerie(123456)
                    .setNome("Sensor de luminosidade 3")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Endereço MAC inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarAlunoValido() {
        SensorBuilder SensorBuilder = new SensorBuilder();
        Sensor sensor = SensorBuilder
                .setNumeroSerie(123456)
                .setNome("Sensor Umidade 2")
                .setEnderecoMAC("123H4NB523JH")
                .build();

        assertNotNull(sensor);
    }
}