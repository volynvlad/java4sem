package by.vlad.strategy.Duck;

public class MuteQuack implements QuackBehavior {
    public void quack(){
        System.out.println("<< Silence >>");
    }
}
