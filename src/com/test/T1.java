package com.test;

public class T1 {
	
// |	
//———————————————————— x(+)
// |1	2	3	4	5
// |16	17	18	19	6
// |15	24	25	20	7
// |14	23	22	21	8
// |13	12	11	10	9
//	
// y(+)
	
	public static void main(String[] args){
		
//		==========================================================
//		方法一
		
		// n阶
		int N = 5;
		// 当前位置的值
		int num = 0;
		// 地图坐标系
		int xy[][] = new int[N][N];
		// x坐标
		int x = 0;
		// y坐标
		int y = 0;
		// 方向
		String directionR = "right";
		String directionL = "left";
		String directionU = "up";
		String directionD = "down";
		// 当前方向
		String directionNow = directionR;
		
		while(true){
			
			// 如果上下左右都不越界 并且上下左右都有值 当前位置值+1 循环完毕 跳出
			if(x+1 <= xy.length 
					&& y+1 <= xy.length 
					&& y-1 >= 0 
					&& x-1 >= 0
					&& xy[x+1][y] != 0
					&& xy[x-1][y] != 0 
					&& xy[x][y+1] != 0 
					&& xy[x][y-1] != 0
					&& xy[x][y] == 0){
				xy[x][y] = ++ num;
				break;
			}
			
			
			// 向右走
			while(directionNow.equals(directionR)){
				if(x+1 >= xy.length || xy[x+1][y] != 0){
					directionNow = directionD;
					break;
				}
				xy[x++][y] = ++num;
			}
			
			// 向下
			while(directionNow.equals(directionD)){
				if(y+1 >= xy.length || xy[x][y+1] != 0){
					directionNow = directionL;
					break;
				}
				xy[x][y++] = ++num;
			}
			
			// 向左
			while(directionNow.equals(directionL)){
				if(x == 0 || xy[x-1][y] != 0){
					directionNow = directionU;
					break;
				}
				xy[x--][y] = ++num;
			}
			
			// 向上
			while(directionNow.equals(directionU)){
				if(y == 0 || xy[x][y-1] != 0){
					directionNow = directionR;
					break;
				}
				xy[x][y--] = ++num;
			}
			
			// 循环总数 == x*y时 跳出
			if (num >= xy.length * xy.length){
				break;
			}
		}
		
		for(int i=0; i<xy.length; i++){
			for(int j=0; j<xy.length; j++){
				System.out.print(xy[j][i] + "\t");
			}
			System.out.println();
		}
//		==========================================================================
		
		
		
//		int n = 5;
//		 
//		  int[][] rect = new int[n + 1][n + 1];
//		 
//		  int x = 0, y = 1; // 当前遍历的位置
//		  int px = 1, py = 0; // x/y 在当前循环方向的增量
//		  int pn = n; // 该方向上还需要多少个数字（会递减，因为顺时针往里缩）
//		  int sum = n; // 当前遍历方向的终点位置
//		 
//		  /** 目标输出顺时针 */
//		  // 1  2  3  4  5
//		  // 16  17  18  19  6
//		  // 15  24  25  20  7
//		  // 14  23  22  21  8
//		  // 13  12  11  10  9
//		 
//		  /** 翻转矩阵为逆时针（为了便于后面逻辑处理，输出的时候再翻转回去） */
//		  // 1  16  15  14  13
//		  // 2  17  24  23  12
//		  // 3  18  25  22  11
//		  // 4  19  20  21  10
//		  // 5  6  7  8  9
//		  for (int i = 1; i <= n * n; i++) { // 翻转矩阵循环
//		   // 移到下一个点(第一次方向1->5 x增量为1， y的增量为0， 第二次方向为6->9,x增量为0，y增量为1，pn减少一个)
//		   x += px;
//		   y += py;
//		   rect[x][y] = i;
//		   if (i == sum) { // 到达该方向的最后一个点
//		    if (px == 1 || px == -1) { // x的增量不为0，则为竖向 -> 横向
//		     pn = pn - 1; // 竖向变为横向的时候，该方向上数字的个数会减少一个
//		     py = px;
//		     px = 0;
//		    } else { // x的增量为0， y的增量不为0，则为横向 -> 竖向
//		     px = -py;
//		     py = 0;
//		    }
//		    sum = sum + pn;
//		   }
//		  }
//		 
//		  for (int i = 1; i <= n; i++) {
//		   for (int j = 1; j <= n; j++) {
//		    System.out.print(rect[j][i] + "\t"); // 翻转复原输出
//		   }
//		   System.out.println();
//		  }
	}
}
