package DesignPattern.Factory.Factory;

/**
 * 减法类
 * 
 * @author Hongyue Wang
 *
 */
public class OperationSub extends Operation {

    @Override
    public double result() {
	return numberA - numberB;
    }

}