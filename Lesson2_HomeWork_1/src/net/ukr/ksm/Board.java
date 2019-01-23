/*4. Создайте класс доска. Доска поделена на 4 части в каждую часть можно положить одну из фигур. 
Должны быть методы, которые помещают и удаляют фигуру с доски. Также метод, который выводит
информацию о всех фигурах лежащих на доске и суммарную их площадь.*/

package net.ukr.ksm;

public class Board {

	private Shape[] state = new Shape[4];

	/**
	 * @return the state
	 */
	public Shape[] getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(Shape[] state) {
		this.state = state;
	}
	
	public void putBoard(Shape figure, int i){
		if (i < 0 || i >= state.length){
			System.out.println("Try again. Please, new number!");
			return;
		}
		if (state[i] != null){
			System.out.println("This place is taken!!");
		} else {
			state[i] = figure;
		}
	}
	
	public void deleteShape(int i){
		if (i < 0 || i>= state.length) {
			System.out.println("Wrong!");
			return;
		}
		if (state[i] != null) {
			System.out.println("Figure on board at " + i + " part has been deleted");
			state[i] = null;
		} else {
			System.out.println("Board empty");
		}
	}
	
	public void info(){
		double area = 0;
		System.out.println();
		for (int i = 0; i < state.length; i++){
			if (state[i] != null) {
				System.out.print("In this part is ");
				area += state[i].Area();
			} else {
				System.out.println("Empty");
			} 
		}
		System.out.println("The total sum of the areas of all shapes = " + area);
	}
	
}
