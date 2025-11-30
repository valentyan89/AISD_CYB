public class TwentyPrac {
    static void task1(){
        TrixParametres<Integer, Double, String> newTempVar = new TrixParametres<>(-123123, 23.232323232323, "aboba");
        System.out.println(newTempVar);
        var newTempVarSecond = new TrixParametres<>("Milana", 'f', 1.0);
        System.out.println(newTempVarSecond);
        newTempVarSecond.printClassNames();
    }

    static void task5(){
        Matrix<Double> A = new Matrix<>(2, 2);
        A.set(0, 0, 1.0);
        A.set(0, 1, 2.0);
        A.set(1, 0, 3.0);
        A.set(1, 1, 4.0);

        Matrix<Double> B = new Matrix<>(2, 2);
        B.set(0, 0, 5.0);
        B.set(0, 1, 6.0);
        B.set(1, 0, 7.0);
        B.set(1, 1, 8.0);

        Matrix<Double> C = A.mul(A, B);
        C.printMatrix();
        System.out.println("Determinant: " + C.determinant(C));
        C = C.transponse(C);
        C.printMatrix();
        System.out.println("errrrrrrrrrrase");

        Matrix<Integer> D = new Matrix<>(2, 2);
        D.set(0, 0, 1);
        D.set(0, 1, 2);
        D.set(1, 0, 3);
        D.set(1, 1, 4);

        Matrix<Integer> E = new Matrix<>(2, 2);
        E.set(0, 0, 5);
        E.set(0, 1, 324);
        E.set(1, 0, 7);
        E.set(1, 1, 8);

        Matrix<Integer> F = D.mul(D, E);
        F.printMatrix();
        System.out.println("Determinant: " + F.determinant(F));
        F = F.transponse(F);
        F = F.scalarMul(3);
        F.printMatrix();
    }

    public static void main(String[] args) {
        task5();
    }
}
