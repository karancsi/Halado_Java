package uni.unicorn.service;

import org.springframework.stereotype.Service;

import uni.unicorn.model.Calculator;

@Service
public class CalculateSimple {

	public int add(Calculator model){
        return (int) (model.getOperandL() + model.getOperandR());
    }

    public int subtract(Calculator model){
        return (int) (model.getOperandL() - model.getOperandR());
    }

    public int multiply(Calculator model){
        return (int) (model.getOperandL() * model.getOperandR());
    }

    public double divide(Calculator model){
        if(model.getOperandL() == 0) return 0;
        if(model.getOperandR() == 0) return 0;
        return (double) model.getOperandL() / model.getOperandR();
    }


    public Calculator clearSimple(Calculator model){
        model.setOperandL(0);
        model.setOperandR(0);
        return model;
    }

}
