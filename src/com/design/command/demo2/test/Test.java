package com.design.command.demo2.test;

import com.design.command.demo2.command.CloseDoor;
import com.design.command.demo2.command.OpenDoor;
import com.design.command.demo2.invoker.InvokerDoor;
import com.design.command.demo2.receiver.Door;

public class Test {
	public static void main(String[] args) {
		
//		弄个门出来
		Door door = new Door();
		
//		弄个 开/关门的命令
		OpenDoor openDoor = new OpenDoor(door);
		CloseDoor closeDoor = new CloseDoor(door);
		
//		弄个调用命令的
		InvokerDoor invokerDoor = new InvokerDoor();
		
		invokerDoor
		.setCommandDoor(openDoor) //开门 出去
		.execute()
		.setCommandDoor(closeDoor) //顺手关门
		.execute();
		
	}
}
