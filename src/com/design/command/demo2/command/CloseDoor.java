package com.design.command.demo2.command;

import com.design.command.demo2.receiver.Door;

/**
 * 执行具体命令的类
 * @author lx
 *
 */
public class CloseDoor implements CommandDoor{
	
	private Door door;
	
	public CloseDoor(Door door) {
		this.door = door;
	}

	@Override
	public void execute() {
		door.closeDoor();
	}

}
