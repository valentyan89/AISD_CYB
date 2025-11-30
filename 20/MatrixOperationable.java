public interface MatrixOperationable<T extends Number> {
    Matrix<T> add(Matrix<T> matrixA, Matrix<T> matrixB);
    Matrix<T> sub(Matrix<T> matrixA, Matrix<T> matrixB);
    Matrix<T> mul(Matrix<T> matrixA, Matrix<T> matrixB);
    Matrix<T> scalarMul(T scalar);
    Matrix<T> transponse(Matrix<T> matrixA);
    Double determinant(Matrix<T> matrixA);
}
