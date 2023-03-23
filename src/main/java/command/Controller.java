package command;

import command.serverimpl.SpeedCommand;
import command.serverimpl.StartCommand;
import command.serverimpl.StopCommand;

/**
 * 控制台
 */
public class Controller {
    public void execute(Command command){
        command.execute();
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.execute(new StartCommand());
        controller.execute(new StopCommand());
        controller.execute(new SpeedCommand());

    }
}
