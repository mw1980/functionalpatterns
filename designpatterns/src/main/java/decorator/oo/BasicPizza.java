package decorator.oo;

public class BasicPizza implements Pizza {
    @Override
    public String receipt() {
        return "basic ingredients";
    }
}
