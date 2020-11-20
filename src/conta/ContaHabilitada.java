package conta;

public class ContaHabilitada extends ContaEstado {

	public ContaHabilitada(Conta conta) {
		super(conta);
	}
	
	@Override
	public String toString() {
		return "ContaHabilitada";
	}

}
