package AbstractFactory;

public class ReceitaConvenio implements Receita {

    @Override
    public String emitir() {
        return "Receita de Convênio";
    }
}