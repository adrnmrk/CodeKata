package codekata.easy;

public class OperatorsDay2 {


	public static void main(String[] args) {

		double meal_cost = 10.25;
		int tip_percent = 17;
		int tax_percent = 5;
		solve(meal_cost, tip_percent, tax_percent);
	}
	
	// Complete the solve function below.
	static void solve(double meal_cost, int tip_percent, int tax_percent) {
		double tip, tax, total_cost;

		tip = (meal_cost / 100) * tip_percent;
		tax = (meal_cost / 100) * tax_percent;
		total_cost = meal_cost + tip + tax;
		System.out.println(Math.round(total_cost));
		System.out.println(total_cost);

	}
}