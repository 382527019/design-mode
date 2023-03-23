package command.serverimpl;

import command.Command;
import command.Player;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/12
 * Time:19:56
 */
public class SpeedCommand extends Player implements Command {
    @Override
    public void execute() {
        System.out.println("快进=====");
        super.speed();
    }
}
