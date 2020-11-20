# Padrao-de-Projeto-State

### Um sistema simulando uma conta bancária usando Padrao de Projeto State - GOF

Atividade proposta pelo Prof. Adilson Vahldick - Universidade do Estado de Santa Catarina - UDESC

#### Problema: Implementar o método proxEstado da classe ContaEstado, para isso se baseando na Máquina de Estados abaixo.

![Diagrama](https://github.com/camimassaneiro/Padrao-de-Projeto-State/blob/master/diagrama%20state.PNG)

Intenção: permite a um objeto alterar seu comportamento quando o seu estado interno muda. O objeto parecerá ter mudado sua classe.

Aplicabilidade - Use o padrão State em um dos dois casos seguintes:

- o comportamento de um objeto depende do seu estado e ele pode mudar seu comportamento em tempo de execução, dependendo desse estado;

- operações têm comandos condicionais grandes, de várias alternativas, que dependem do estado do objeto. Esse estado é normalmente representado por uma ou mais constantes enumeradas. Frequentemente, várias operações conterão essa mesma estrutura condicional. O padrão State coloca cada ramo do comando adicional em uma classe separada. Isto lhe permite tratar o estado do objeto como um objeto propriamente dito, que pode variar independente de outros objetos.

#### Estrutura:

![Estrutura State](https://github.com/camimassaneiro/Padrao-de-Projeto-State/blob/master/Estrutura%20State.PNG)

Participantes:
- Context:
	- define a interface de interesse para os clientes
	- mantém uma instância de uma subclasse ConcreteState que define o estado corrente.
- State:
	- define uma interface para encapsulamento associado com um determinado estado do Context.
- ConcreteState subclasses:
	- cada subclasse implementa um comportamento associado com um estado do Context.

Referência: GAMMA, E. et al. Padrões de projeto: soluções reutilizáveis de software orientado a objetos. Porto Alegre: Bookman, 2000.
