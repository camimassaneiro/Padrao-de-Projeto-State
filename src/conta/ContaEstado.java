package conta;

public abstract class ContaEstado {

	protected Conta conta;

	public ContaEstado(Conta conta) {
		this.conta = conta;
	}

	public final void deposito(double valor) throws Exception {
		doDeposito(valor);
		proxEstado();
	}
	
	public final void saque(double valor) throws Exception {
		doSaque(valor);
		proxEstado();
	}

	protected void doDeposito(double valor) throws Exception {
		this.conta.setSaldo(conta.getSaldo() + valor);
	}

	protected void doSaque(double valor) throws Exception {
		this.conta.setSaldo(conta.getSaldo() - valor);
	}

	protected void proxEstado() {

		if (conta.getSaldo() < 0 && conta.getSaldo() > -1000){
                    this.conta.setEstado(new ContaNegativa(conta));
                }else if ( conta.getSaldo() <= -1000){
                    this.conta.setEstado(new ContaBloqueada(conta));
                }else {
                    this.conta.setEstado(new ContaHabilitada(conta));
                }
	}
	
}
