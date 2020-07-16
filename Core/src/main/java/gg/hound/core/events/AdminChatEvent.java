package gg.hound.core.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class AdminChatEvent extends Event {

    private static final HandlerList handlerList = new HandlerList();

    private final String staffUsername, staffServer, staffMessage;

    public AdminChatEvent(String staffUsername, String staffServer, String staffMessage) {
        this.staffUsername = staffUsername;
        this.staffServer = staffServer;
        this.staffMessage = staffMessage;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    public String getStaffServer() {
        return staffServer;
    }

    public String getStaffMessage() {
        return staffMessage;
    }

    public String getStaffUsername() {
        return staffUsername;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

}
