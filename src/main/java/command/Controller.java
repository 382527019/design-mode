package command;

import command.serverimpl.SpeedCommand;
import command.serverimpl.StartCommand;
import command.serverimpl.StopCommand;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/12
 * Time:19:57
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
