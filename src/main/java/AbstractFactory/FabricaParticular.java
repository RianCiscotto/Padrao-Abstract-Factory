package AbstractFactory;

public class FabricaParticular implements FabricaAbstrata {

    @Override
    public Receita createReceita() {
        return new ReceitaParticular();
    }

    @Override
    public Prontuario createProntuario() {
        return new ProntuarioParticular();
    }
}