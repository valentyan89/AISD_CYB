import java.util.ArrayList;

public class Matrix<T extends Number> implements MatrixOperationable<T>{
    private T[][] matrix; private int rows = 0; private int cols = 0;

    public Matrix(int rows, int cols){
        this.matrix = (T[][]) new Number[rows][cols]; this.rows = rows; this.cols = cols;
    }

    public Matrix(T[][] matrix){
        this.matrix = matrix; this.rows = matrix.length; this.cols = matrix[0].length;
    }

    public T get(int row, int col){
        return matrix[row][col];
    }

    public void set(int row, int col, T value){
        this.matrix[row][col] = value;
    }

    public int getRows(){
        return this.rows;
    }

    public int getCols(){
        return this.cols;
    }

    // public T[][] getMatrix(){
    //     return this.matrix;
    // }

    public void setMatrix(T[][] matrix){
        this.matrix = matrix; this.rows = matrix.length; this.cols = matrix[0].length;
    }

    // public void setRows(int rows) {
    //     this.rows = rows;
    // }

    // public void setCols(int cols) {
    //     this.cols = cols;
    // }

    public void printMatrix(){
        for (int i = 0; i < this.rows; i++){
            for (int j = 0; j < this.cols; j++){
                System.out.print(this.matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void printMatrix(int rows, int cols){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public void printMatrix(int rows){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < this.cols; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    @Override
    public Matrix<T> add(Matrix<T> matrixA, Matrix<T> matrixB){
        if(matrixA.getRows() != matrixB.getRows() || matrixA.getCols() != matrixB.getCols()){
            throw new IllegalArgumentException("Matrix does not have the same number of rows and columns");
        }
        Matrix<T> matrixC = new Matrix<T>(matrixA.getRows(), matrixA.getCols());
        for(int i = 0; i < matrixA.getRows(); i++){
            for(int j = 0; j < matrixA.getCols(); j++){
                matrixC.set(i, j, (T) Double.valueOf(matrixA.get(i, j).doubleValue() + matrixB.get(i, j).doubleValue()));
            }
        }
        return matrixC;
    }

    @Override
    public Matrix<T> sub(Matrix<T> matrixA, Matrix<T> matrixB){
        if(matrixA.getRows() != matrixB.getRows() || matrixA.getCols() != matrixB.getCols()){
            throw new IllegalArgumentException("Matrix does not have the same number of rows and columns");
        }
        Matrix<T> matrixC = new Matrix<T>(matrixA.getRows(), matrixA.getCols());
        for(int i = 0; i < matrixA.getRows(); i++){
            for(int j = 0; j < matrixA.getCols(); j++){
                matrixC.set(i, j, (T) Double.valueOf(matrixA.get(i, j).doubleValue() - matrixB.get(i, j).doubleValue()));
            }
        }
        return matrixC;
    }

    @Override
    public Matrix<T> mul(Matrix<T> matrixA, Matrix<T> matrixB){
        if(matrixA.getCols() != matrixB.getRows()){
            throw new IllegalArgumentException("Matrix dimensions are not compatible for multiplication");
        }
        Matrix<T> matrixC = new Matrix<T>(matrixA.getRows(), matrixB.getCols());
        for(int i = 0; i < matrixA.getRows(); i++){
            for(int j = 0; j < matrixB.getCols(); j++){
                double sum = 0.0;
                for (int k = 0; k < matrixA.getCols(); k++){
                    sum += matrixA.get(i, k).doubleValue() * matrixB.get(k, j).doubleValue();
                }
                matrixC.set(i, j, (T) Double.valueOf(sum));
            }
        }
        return matrixC;
    }

    @Override
    public Matrix<T> scalarMul(T scalar){
        Matrix<T> matrixC = new Matrix<T>(this.rows, this.cols);
        for (int i = 0; i < this.rows; i++){
            for (int j = 0; j < this.cols; j++){
                matrixC.set(i, j, (T) Double.valueOf(this.matrix[i][j].doubleValue() * scalar.doubleValue()));
            }
        }
        return matrixC;
    }


    @Override
    public Matrix<T> transponse(Matrix<T> matrixA){
        Matrix<T> matrixC = new Matrix<T>(matrixA.getCols(), matrixA.getRows());
        for(int i = 0; i < matrixA.getRows(); i++){
            for(int j = 0; j < matrixA.getCols(); j++){
                matrixC.set(j, i, (T) Double.valueOf(matrixA.get(i, j).doubleValue()));
            }
        }
        return matrixC;
    }

    @Override
    public Double determinant(Matrix<T> matrixA){
        if(matrixA.getRows() != matrixA.getCols()){
            throw new IllegalArgumentException("Matrix does not have the same number of rows and columns");
        }
        if(matrixA.getRows() == 1){
            return matrixA.get(0, 0).doubleValue();
        }
        else if(matrixA.getRows() == 2){
            return matrixA.get(0, 0).doubleValue() * matrixA.get(1, 1).doubleValue() - matrixA.get(0, 1).doubleValue() * matrixA.get(1, 0).doubleValue();
        }

        double det = 0.0;
        for(int j = 0; j < matrixA.getRows(); j++){
            det += Math.pow(-1, j) * matrixA.get(0, j).doubleValue() * determinant(minor(matrixA, 0, j));
        }
        return det;
    }

    private Matrix<T> minor(Matrix<T> matrix, int rowToRemove, int colToRemove){
        Matrix<T> matrixC = new Matrix<T>(matrix.getRows() - 1, matrix.getRows() - 1);
        int r = 0;
        for(int i = 0; i < matrix.getRows(); i++){
            if(i == rowToRemove){
                continue;
            }
            int c = 0;
            for(int j = 0; j < matrix.getCols(); j++){
                if(j == colToRemove){
                    continue;
                }
                matrixC.set(r, c, matrix.get(i, j));
                c++;
            }
            r++;
        }
        return matrixC;
    }
}