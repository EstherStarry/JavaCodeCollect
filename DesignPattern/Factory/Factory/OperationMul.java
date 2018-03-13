package DesignPattern.Factory.Factory;

/**
 * 乘法类
 * 
 * @author Hongyue Wang
 *
 */
public class OperationMul extends Operation {

    @Override
    public double result() {
		return numberA * numberB;
    }

}