package command.serverimpl;

import command.Command;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/12
 * Time:19:56
 */
public class StartCommand implements Command {
    @Override
    public void execute() {
        System.out.println("开始播放=====");
    }
}
