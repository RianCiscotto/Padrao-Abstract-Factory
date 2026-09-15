package AbstractFactory;

public class FabricaConvenio implements FabricaAbstrata {

    @Override
    public Receita createReceita() {
        return new ReceitaConvenio();
    }

    @Override
    public Prontuario createProntuario() {
        return new ProntuarioConvenio();
    }
}