package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<ICommand> list=new ArrayList<>();

    public void addCommand(ICommand command){
        list.add(command);
    }
    public void removeCommand(ICommand command){
        list.remove(command);
    }

    public void executeCommand(ICommand iCommand){
        iCommand.execute();
        list.remove(iCommand);
    }
    public void executeCommands(){
        for(ICommand command: list){
            command.execute();
        }
        list.clear();
    }
}
