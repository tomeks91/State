public class Main {
    public static void main(String args[]) {
        StateContext stateContext = new StateContext(UpperCase.getInstance());
        String text = "test";
        stateContext.request(text);
        stateContext.request(text);
        stateContext.request(text);
        stateContext.request(text);
        stateContext.request(text);
        stateContext.request(text);
        stateContext.request(text);
        stateContext.request(text);
        stateContext.request(text);
    }
}
