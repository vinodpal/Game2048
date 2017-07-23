package com.Game2048;

public class Game2048 implements Move {
	boolean flag;
	public static boolean check=false;
	static int countBlank = 0;
	@Override
	public void left(int[][] matrix) {
		int lastCell = -1;
		int lastRow = -1;
		int lastCol = -1;
		
		for (int row = matrix.length - 1; row >= 0; --row) {
			flag = false;
			for (int col = 0; col < matrix[0].length - 1; ++col) {
				if (matrix[row][col] == -1) {
					++countBlank;
					continue;
				} else if (!flag) {
					// hold current umber'
					lastCell = matrix[row][col];
					lastRow = row;
					lastCol = col;
					flag = true;
				} else if (flag) {
					// check same or not
					if (lastCell == matrix[row][col]) {
						matrix[lastRow][lastCol] += lastCell;
						matrix[row][col] = -1;
						flag = false;
						if (lastCell + lastCell == 2048) {
							check=true;
							
						}
					} else {
						// hold current umber'
						lastCell = matrix[row][col];
						lastRow = row;
						lastCol = col;
					}
				}
			}
			for (int col = 0; col < matrix[0].length; ++col) {
				if (matrix[row][col] != -1) {
					int itr = col - 1;
					while ((itr >= 0) && matrix[row][itr] < 1)
						--itr;
					if (itr < 0) {
						if (itr + 1 == col) {
							matrix[row][itr + 1] = matrix[row][col];
						} else {
							matrix[row][itr + 1] = matrix[row][col];
							matrix[row][col] = -1;
						}
					} else if (itr != col - 1) {
						matrix[row][itr + 1] = matrix[row][col];
						matrix[row][col] = -1;
					}
				}
			}
		}
		if (countBlank < 2) {
			System.out.println("LOSS");
		}
	}

	@Override
	public void right(int[][] matrix) {
		int lastCell = -1;
		int lastRow = -1;
		int lastCol = -1;
		
		for (int row = matrix.length - 1; row >= 0; --row) {
			flag = false;
			for (int col = matrix[0].length - 1; col >= 0; --col) {
				if (matrix[row][col] == -1) {
					++countBlank;
					continue;
				} else if (!flag) {
					// hold current umber'
					lastCell = matrix[row][col];
					lastRow = row;
					lastCol = col;
					flag = true;
				} else if (flag) {
					// check same or not
					if (lastCell == matrix[row][col]) {
						matrix[lastRow][lastCol] += lastCell;
						matrix[row][col] = -1;
						flag = false;
						if (lastCell + lastCell == 2048) {
							check=true;
							
						}
					} else {
						// hold current umber'
						lastCell = matrix[row][col];
						lastRow = row;
						lastCol = col;
					}
				}
			}
			for (int col = matrix[0].length - 1; col >= 0; --col) {
				if (matrix[row][col] != -1) {
					int itr = col + 1;
					while ((itr < matrix[0].length) && matrix[row][itr] < 1)
						++itr;
					if (itr == (matrix[0].length)) {
						matrix[row][itr - 1] = matrix[row][col];
					} else if (itr != col + 1) {
						matrix[row][itr - 1] = matrix[row][col];
						matrix[row][col] = -1;
					}

				}
			}
		}
		if (countBlank < 2) {
			System.out.println("LOSS");
		}
	}

	@Override
	public void up(int[][] matrix) {
		int lastCell = -1;
		int lastRow = -1;
		int lastCol = -1;
		
		flag = false;
		for (int col = 0; col < matrix[0].length; ++col) {

			for (int row = 0; row <= matrix.length - 1; ++row) {
				if (matrix[row][col] == -1) {
					++countBlank;
					continue;
				} else if (!flag) {
					// hold current umber'
					lastCell = matrix[row][col];
					lastRow = row;
					lastCol = col;
					flag = true;
				} else if (flag) {
					// check same or not
					if (lastCell == matrix[row][col]) {
						matrix[lastRow][lastCol] += lastCell;
						matrix[row][col] = -1;
						flag = false;
						if (lastCell + lastCell == 2048) {
							check=true;
					
						}
					} else {
						// hold current umber'
						lastCell = matrix[row][col];
						lastRow = row;
						lastCol = col;
					}
				}
			}
			for (int row = 0; row < matrix.length; ++row) {
				if (matrix[row][col] != -1) {
					int itr = row - 1;
					while ((itr >= 0) && matrix[itr][col] < 1)
						--itr;
					if (itr < 0) {
						if (itr + 1 == row) {
							matrix[itr + 1][col] = matrix[row][col];
						} else {
							matrix[itr + 1][col] = matrix[row][col];
							matrix[row][col] = -1;
						}
					} else if (itr != row - 1) {
						matrix[itr + 1][col] = matrix[row][col];
						matrix[row][col] = -1;
					}
				}
			}
		}
		if (countBlank < 2) {
			System.out.println("LOSS");
		}
	}

	@Override
	public void down(int[][] matrix) {
		int lastCell = -1;
		int lastRow = -1;
		int lastCol = -1;
		
		flag = false;
		for (int col = matrix[0].length - 1; col >= 0; --col) {

			for (int row = matrix.length - 1; row >= 0; --row) {
				if (matrix[row][col] == -1) {
					++countBlank;
					continue;
				} else if (!flag) {
					// hold current umber'
					lastCell = matrix[row][col];
					lastRow = row;
					lastCol = col;
					flag = true;
				} else if (flag) {
					// check same or not
					if (lastCell == matrix[row][col]) {
						matrix[lastRow][lastCol] += lastCell;
						matrix[row][col] = -1;
						flag = false;
						if (lastCell + lastCell == 2048) {
							check=true;
							
						}
					} else {
						// hold current umber'
						lastCell = matrix[row][col];
						lastRow = row;
						lastCol = col;
					}
				}
			}
			for (int row = matrix.length - 1; row >= 0; --row) {
				if (matrix[row][col] != -1) {
					int itr = row + 1;
					while ((itr <= matrix.length - 1) && matrix[itr][col] < 1)
						++itr;
					if (itr == matrix.length ) {
						if (itr - 1 == row) {
							matrix[itr - 1][col] = matrix[row][col];
						} else {
							matrix[itr - 1][col] = matrix[row][col];
							matrix[row][col] = -1;
						}
					} else if (itr != row + 1) {
						matrix[itr - 1][col] = matrix[row][col];
						matrix[row][col] = -1;
					}
				}
			}
		}
		if (countBlank < 2) {
			System.out.println("LOSS");
		}
	}
	
	public static boolean checkAdjecentCell(int[][] matrix) {
		if (countBlank >= 2)
			return true;
		for (int row = 0; row < matrix.length; ++row) {
			for (int col = 0; col < matrix[0].length; ++col) {
				if (col - 1 >= 0 && matrix[row][col - 1] == matrix[row][col - 1])
					return true;
				if (col + 1 < matrix[0].length && matrix[row][col + 1] == matrix[row][col - 1])
					return true;
				if (row - 1 >= 0 && matrix[row - 1][col] == matrix[row][col - 1])
					return true;
				if (row + 1 < matrix.length && matrix[row + 1][col] == matrix[row][col - 1])
					return true;
			}
		}
		return false;
	}
	
	public static void display(int [][]playboard) {
		for (int row = 0; row<playboard.length ;++row) {
			System.out.println();
			for (int col =0;col<playboard[0].length ;++col) {
				System.out.print(playboard[row][col]+"      ");
			}
		
	}
	}
	
}
