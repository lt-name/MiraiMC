package me.dreamvoid.miraimc.bukkit.event;

import net.mamoe.mirai.event.events.StrangerMessageEvent;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * 被动收到消息 - 陌生人消息
 */
public class MiraiStrangerMessageEvent extends Event {

    public MiraiStrangerMessageEvent(StrangerMessageEvent event) {
        super(true);
        this.event = event;
    }

    private static final HandlerList handlers = new HandlerList();
    private final StrangerMessageEvent event;

    public @NotNull HandlerList getHandlers() { return handlers; }
    public static HandlerList getHandlerList() { return handlers; }

    /**
     * 返回接收到这条信息的机器人ID
     * @return 机器人ID
     */
    public long getBotID(){
        return event.getBot().getId();
    }

    /**
     * 返回发送这条信息的发送者ID
     * @return 发送者ID
     */
    public long getSenderID(){
        return event.getSender().getId();
    }

    /**
     * 返回发送这条信息的发送者昵称
     * @return 发送者昵称
     */
    public String getSenderNick(){
        return event.getSender().getNick();
    }

    /**
     * 返回接收到的消息内容<br>
     * 此方法使用 toString()
     * @return 原始消息内容
     */
    public String getMessage(){
        return event.getMessage().toString();
    }

    /**
     * 返回接收到的消息内容转换到字符串的结果<br>
     * 此方法使用 contentToString()，这一般和 toString() 的工作方式相同
     * @return 转换字符串后的消息内容
     */
    public String getMessageContent(){
        return event.getMessage().contentToString();
    }

    /**
     * 返回接收到的消息内容转换到Mirai Code的结果<br>
     * 此方法使用 serializeToMiraiCode()
     * @return 带Mirai Code的消息内容
     */
    public String getMessageToMiraiCode(){
        return event.getMessage().serializeToMiraiCode();
    }

    /**
     * 返回接收到这条信息的时间
     * @return 发送时间
     */
    public int getTime(){
        return event.getTime();
    }

}
