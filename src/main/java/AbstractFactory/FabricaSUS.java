package AbstractFactory;

public class FabricaSUS implements FabricaAbstrata {

    @Override
    public Receita createReceita() {
        return new ReceitaSUS();
    }

    @Override
    public Prontuario createProntuario() {
        return new ProntuarioSUS();
    }
}