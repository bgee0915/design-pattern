
package com.design.state.demo1.test;

import com.design.state.demo1.context.Context;
import com.design.state.demo1.state.StartState;
import com.design.state.demo1.state.State;
import com.design.state.demo1.state.StopState;

public class Test {
	public static void main(String[] args) {
		Context context = new Context() ;
		
		State startState = new StartState();
		startState.doAction(context);			// 初始化 context 的 state 为 start

		System.out.println("now - context.state = " + context.getState().getState());
		
		System.out.println("\n======================\n");
		
		State stopState = new StopState();
		stopState.doAction(context);
		
		System.out.println("now - context.state = " + context.getState().getState());
		
		
//		其实就是通过 不同的  Class.doAction(context) 来改变 context 内置的 state对象
//		从而改变 context 的 状态
		
	}
}