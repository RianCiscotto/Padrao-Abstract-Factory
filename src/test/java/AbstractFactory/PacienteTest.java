package AbstractFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteTest {

    @Test
    void deveEmitirReceitaSUS() {
        FabricaAbstrata fabrica = new FabricaSUS();
        Paciente paciente = new Paciente(fabrica);
        assertEquals("Receita do SUS", paciente.emitirReceita());
    }

    @Test
    void deveEmitirReceitaParticular() {
        FabricaAbstrata fabrica = new FabricaParticular();
        Paciente paciente = new Paciente(fabrica);
        assertEquals("Receita Particular", paciente.emitirReceita());
    }

    @Test
    void deveEmitirProntuarioSUS() {
        FabricaAbstrata fabrica = new FabricaSUS();
        Paciente paciente = new Paciente(fabrica);
        assertEquals("Prontuário do SUS", paciente.emitirProntuario());
    }

    @Test
    void deveEmitirProntuarioParticular() {
        FabricaAbstrata fabrica = new FabricaParticular();
        Paciente paciente = new Paciente(fabrica);
        assertEquals("Prontuário Particular", paciente.emitirProntuario());
    }
}