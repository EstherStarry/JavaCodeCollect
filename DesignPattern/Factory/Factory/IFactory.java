package DesignPattern.Factory.Factory;

import DesignPattern.Factory.Factory.Operation;
import DesignPattern.Factory.Factory.OperationAdd;
import DesignPattern.Factory.Factory.OperationDiv;
import DesignPattern.Factory.Factory.OperationMul;
import DesignPattern.Factory.Factory.OperationSub;

/**
 * 工厂接口
 * 
 * @author Hongyue Wang
 *
 */
public interface IFactory {
    public Operation createOperation();
}

class AddFactory implements IFactory {

    @Override
    public Operation createOperation() {
	   return new OperationAdd();
    }

}

class SubFactory implements IFactory {

    @Override
    public Operation createOperation() {
	   return new OperationSub();
    }

}

class MulFactory implements IFactory {

    @Override
    public Operation createOperation() {
	   return new OperationMul();
    }

}

class DivFactory implements IFactory {

    @Override
    public Operation createOperation() {
	   return new OperationDiv();
    }

}