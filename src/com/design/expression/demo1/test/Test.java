package com.design.expression.demo1.test;

import com.design.expression.demo1.expression.AndExpression;
import com.design.expression.demo1.expression.Expression;
import com.design.expression.demo1.expression.OrExpression;
import com.design.expression.demo1.expression.TerminalExpression;

public class Test {
	public static void main(String[] args) {
		boolean result1 = manSingleExpression("hello , i'm luyisi, single woman");
		boolean result2 = womanMarryExpression("hello, i'm hahahah, man and single");
		System.out.println(result1);
		System.out.println(result2);
	}
	
	
//	man && single
	public static boolean manSingleExpression(String context) {
		Expression manExp = new TerminalExpression("man");
		Expression singleExp = new TerminalExpression("single");
		return new AndExpression(manExp,singleExp).interpret(context);
	}
	
//	woman || marry
	public static boolean womanMarryExpression(String context) {
		Expression womanExp = new TerminalExpression("woman");
		Expression singleExp = new TerminalExpression("marry");
		return new OrExpression(womanExp,singleExp).interpret(context);
	}
}
