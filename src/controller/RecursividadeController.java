package controller;
/*
 * Criar uma função recursiva que receba o dividendo e o divisor de uma operação de divisão e, por
subtrações, exiba o resto da divisão.
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
