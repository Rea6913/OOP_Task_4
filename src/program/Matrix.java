package program;

public class Matrix {
	public static final int DEFAULT_SIZE = 5;
	private int[][] matrix;

	public Matrix() {
		matrix = new int[DEFAULT_SIZE][DEFAULT_SIZE];
	}

	public Matrix(int size) {
		matrix = new int[size][size];
	}

	public Matrix(int row, int column) {
		matrix = new int[row][column];
	}

	public Matrix(int[][] matrix) {
		this.matrix = matrix;
	}

	public int getCountColumn() {
		return matrix[0].length;
	}

	public int getCountRow() {
		return matrix.length;
	}

	public int[] getRow(int index) {
		if (index >= 0 && index < matrix.length)
			return matrix[index];
		else
			throw new IllegalArgumentException();
	}

	public int getElement(int row, int column) {
		if (row >= 0 && row < matrix.length && column >= 0 && column < matrix[0].length)
			return matrix[row][column];
		else
			throw new IllegalArgumentException();
	}

	public void setElement(int element, int row, int column) {
		if (row >= 0 && row < matrix.length && column >= 0 && column < matrix[0].length)
			matrix[row][column] = element;
		else
			throw new IllegalArgumentException();
	}

	public int[][] getMatrix()
	{
		return matrix;
	}
	
	public void swap(int firstRow, int firstColumn, int secondRow, int secondColumn) {
		if (firstRow >= 0 && firstRow < matrix.length && firstColumn >= 0 && firstColumn < matrix[0].length
				&& secondRow >= 0 && secondRow < matrix.length && secondColumn >= 0
				&& secondColumn < matrix[0].length) {
			int element = matrix[firstRow][firstColumn];
			matrix[firstRow][firstColumn] = matrix[secondRow][secondColumn];
			matrix[secondRow][secondColumn] = element;
		} else
			throw new IllegalArgumentException();
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				builder.append(matrix[i][j]).append(" ");
			}
			builder.append('\n');
		}
		return builder.toString();
	}

}
