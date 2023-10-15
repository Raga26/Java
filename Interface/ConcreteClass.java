package Interface;

public class ConcreteClass extends AbstractSubClassOne implements InterfaceImplementaion , InterfaceImplementationA{

     public void foo()
    {
        System.out.println("ConcreteClass :" + InterfaceImplementationA.VAL);
    }

    public void bar()
    {
        System.out.println("ConcreteClass");
    }
}
