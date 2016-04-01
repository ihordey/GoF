package behavior.command.undo;

public interface Command {
    void execute();

    void undo();
}
