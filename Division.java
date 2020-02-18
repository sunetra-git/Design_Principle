public class Division 
{
		private int firstOperand;
		private int secondOperand;
		private int result = 0;
		public Division(int firstOperand, int secondOperand) {
			this.firstOperand = firstOperand;
			this.secondOperand = secondOperand;
    }

 
		public void performOperation() {
			try{
				result = firstOperand / secondOperand;
				System.out.println(result);
			}
			catch(ArithmeticException e){
				System.out.println("Division by Zero");
			}
		}
}
