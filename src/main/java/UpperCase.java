public class UpperCase implements State {
    public static final UpperCase instance = new UpperCase();

    private UpperCase(){
    }

    public static UpperCase getInstance(){
        return instance;
    }

    @Override
    public void handle(StateContext context, String text) {
        System.out.println(text.toUpperCase());
        context.setState(LowerCase.getInstance());
    }
}
