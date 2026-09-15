package AbstractFactory;

public class ProntuarioConvenio implements Prontuario {

    @Override
    public String emitir() {
        return "Prontuário de Convênio";
    }
}