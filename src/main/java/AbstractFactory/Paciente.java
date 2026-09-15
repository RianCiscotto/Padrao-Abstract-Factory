package AbstractFactory;

public class Paciente {

    private Receita receita;
    private Prontuario prontuario;

    public Paciente(FabricaAbstrata fabrica) {
        this.receita = fabrica.createReceita();
        this.prontuario = fabrica.createProntuario();
    }

    public String emitirReceita() {
        return this.receita.emitir();
    }

    public String emitirProntuario() {
        return this.prontuario.emitir();
    }
}