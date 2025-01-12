package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.Iterator;
import java.util.List;

public class CompoundCommand implements ICompoundCommand{

    private final List<DriverCommand> commandList;
    private final String name;

    public CompoundCommand(List<DriverCommand> commandList, String name) {
        this.commandList = commandList;
        this.name = name;
    }

    @Override
    public void execute(Job2dDriver driver) {
        commandList.forEach((c) -> c.execute(driver));
    }

    @Override
    public Iterator<DriverCommand> iterator() {
        return commandList.iterator();
    }

    @Override
    public String toString() {
        return name;
    }
}
