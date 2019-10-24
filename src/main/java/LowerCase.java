public class LowerCase implements State{
    public static final LowerCase instance = new LowerCase();
    public int counter;


    private LowerCase(){
    }

    public static LowerCase getInstance(){
        return instance;
    }

    @Override
    public void handle(StateContext context, String text) {
        System.out.println(text.toLowerCase());
        if(counter % 2 == 1){
            context.setState(UpperCase.getInstance());
        }
        counter++;
    }
}
