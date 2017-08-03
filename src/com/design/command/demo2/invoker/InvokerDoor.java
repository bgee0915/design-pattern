package com.design.command.demo2.invoker;


import com.design.command.demo2.command.CommandDoor;

/**
 * 使用命令者入口
 * @author lx
 *
 */
public class InvokerDoor {
	
	private CommandDoor commandDoor;
	
	public InvokerDoor setCommandDoor(CommandDoor commandDoor) {
		this.commandDoor = commandDoor;
		return this;
	}
	
	public InvokerDoor execute() {
		commandDoor.execute();
		return this;
	}
	
//	=============================================================================
//	============ 直接设计成如下也可以 ,不过如果 命令多了需要不断的 扩张【构造方法】和【执行方法】 ===========
//	=============================================================================
	
//	private OpenDoor openDoor;
//	private CloseDoor closeDoor;
//	
//	public InvokerDoor(OpenDoor openDoor, CloseDoor closeDoor) {
//		this.openDoor = openDoor;
//		this.closeDoor = closeDoor;
//	}
//	
//	public void close(){
//		closeDoor.execute();
//	}
//	
//	public void open() {
//		openDoor.execute();
//	}
	
}
