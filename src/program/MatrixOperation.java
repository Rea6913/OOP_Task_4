package program;

public class MatrixOperation {

	public static int[][] DiagSort(Matrix matrix) {
		if (matrix == null)
			throw new NullPointerException();
		if (matrix.getCountRow() == 0 || matrix.getCountColumn() == 0
				|| matrix.getCountColumn() != matrix.getCountRow())
			throw new IllegalArgumentException();
		int n = matrix.getCountColumn();

		for (int count = 0; count < n; count++) {
			int max = Integer.MIN_VALUE;
			int row = -1;
			int col = -1; 
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (matrix.getElement(i, j) >= max && ((i != j) || (i == j && i >= count))) {
						max = matrix.getElement(i, j);
						row = i;
						col = j;
					}

				}
			}
			matrix.swap(row, col, count, count);
		}
		return matrix.getMatrix();
	}

}
