package uni.unicorn.model;
import static lombok.AllArgsConstructor.*;
import static lombok.Getter.*;
import static lombok.Setter.*;


import lombok.AllArgsConstructor;

public class Calculator {
	private double operandL;
    private double operandR;
    private String operator;
    
    public Calculator() {
    	
    }
	public Calculator(double operandL, double operandR, String operator) {
		super();
		this.operandL = operandL;
		this.operandR = operandR;
		this.operator = operator;
	}
	public double getOperandL() {
		return operandL;
	}
	public void setOperandL(double operandL) {
		this.operandL = operandL;
	}
	
	public double getOperandR() {
		return operandR;
	}
	public void setOperandR(double operandR) {
		this.operandR = operandR;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

    
    /*@AllArgsConstructor
	
    @Setter
    
    @Getter
    */
    
	 public double calculateResult() {
	        double result = 0;
	        switch(this.operator) {
	            case "+":
	                result = this.operandL + this.operandR;
	                break;
	            case "-":
	                result = this.operandL - this.operandR;
	                break;
	            case "*":
	                result = this.operandL * this.operandR;
	                break;
	            case "/":
	                result = this.operandL / this.operandR;
	                break;
	            case "^":
	                result = Math.pow(this.operandL,this.operandR);
	                break;
	            default:
	                    result = 0;
	        }

	        return result;
	    }
  
    
    
}
