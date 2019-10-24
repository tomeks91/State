public class StateContext {
    private State state;

    public StateContext(State state) {
        this.state = state;
    }

    public void setState(State state){
        this.state = state;
    }

    public void request(String text){
        this.state.handle(this, text);
    }
}
