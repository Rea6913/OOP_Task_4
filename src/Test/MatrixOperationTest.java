package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import program.Matrix;
import program.MatrixOperation;

class MatrixOperationTest {

	Matrix matrix;
	MatrixOperation matrixOperation = new MatrixOperation();

	@Test
	void TestZeroLenghtMatrix() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			matrix = new Matrix(0, 0);
			matrixOperation.DiagSort(matrix);
		});
	}

	@Test
	void TestNullMatrix() {

		Assertions.assertThrows(NullPointerException.class, () -> {
			matrixOperation.DiagSort(null);
		});
	}

	@Test
	void TestNoSquareMatrix() {

		Assertions.assertThrows(NullPointerException.class, () -> {
			matrix = new Matrix(1, 2);
			matrixOperation.DiagSort(null);
		});
	}

	@Test
	void OkTest() {
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		matrix = new Matrix(array);
		int[][] expecteds = { { 9, 2, 3 }, { 4, 8, 6 }, { 1, 5, 7 } };
		Assert.assertArrayEquals(expecteds,matrixOperation.DiagSort(matrix));
		//	Assert.assertSame(,);
	}

}
