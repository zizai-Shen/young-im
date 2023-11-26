package cn.young.im.netty.strategy.command.system.command;

import cn.young.im.netty.strategy.command.system.model.CommandExecutionContext;
import cn.young.im.netty.strategy.command.system.BaseSystemCommandStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @ClassName LoginCommand
 * @Description
 * @date 2023/4/25 10:25
 * @Author yanceysong
 * @Version 1.0
 */
@Slf4j
@Service
public class LoginSystemCommand extends BaseSystemCommandStrategy {
    @Override
    public void systemStrategy(CommandExecutionContext commandExecution) {
        log.info(commandExecution.toString());
    }
}