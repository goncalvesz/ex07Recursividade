package controller;
/*
 * Criar uma fun��o recursiva que receba o dividendo e o divisor de uma opera��o de divis�o e, por
subtra��es, exiba o resto da divis�o.
 */
public class RecursividadeController {
	
	public RecursividadeController(){
		
	}
	
	public int divisaoMostraResto(int divisor, int dividendo) {
		
			if (dividendo > divisor) {
				return divisaoMostraResto(divisor, dividendo-divisor);
			}
			if (dividendo < divisor) {
				return dividendo;
			}
			else {
				return 0;
			}
		}

}
