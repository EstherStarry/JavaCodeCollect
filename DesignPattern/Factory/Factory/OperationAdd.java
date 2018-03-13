package DesignPattern.Factory.Factory;

/**
 * 加法类
 * 
 * @author Hongyue Wang
 *
 */
public class OperationAdd extends Operation {

    @Override
    public double result() {
	return numberA + numberB;
    }

}