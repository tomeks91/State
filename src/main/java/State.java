public interface State {
    void handle(StateContext context, String text);
}
