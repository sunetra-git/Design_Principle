public class DivisionTest 
{
		private int firstOperand;
		private int secondOperand;
		private int result = 0;
		public DivisionTest(int firstOperand, int secondOperand) {
			this.firstOperand = firstOperand;
			this.secondOperand = secondOperand;
    }
 
    //Setters and getters
 
		public void performOperation() {
			try{
				result = firstOperand / secondOperand;
				System.out.println(result);
			}
			catch(ArithmeticException e){
				System.out.println("Division by Zero");
			}
			//System.out.println(result);
		}
}