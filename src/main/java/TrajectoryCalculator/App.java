package TrajectoryCalculator;

import org.ejml.data.CMatrixRMaj;

/**
 * Hello world!
 */
public final class App {
    private App() 
    {

    }
    // private void CreatePointMatrix(int x1, int y1, int x2, int y2)
    // {
    //    double[][] matrix1;
    //     matrix1 = new double[][] {{Math.pow(x1,3), Math.pow(x1,2), x1, 1}, 
    //                             {Math.pow(x2,3), Math.pow(x2,2), x2, 1}, 
    //                             {3*Math.pow(x1,2),2*x1, 1, 0},
    //                             {3*Math.pow(x2,2), 2*x2, 1, 0}};
    //}
    // public void CMatrixRMaj1(float[][] data)
    // {
    //          data = new float[][] {{Math.pow(x1,3), Math.pow(x1,2), x1, 1}, 
    //                                 {Math.pow(x2,3), Math.pow(x2,2), x2, 1}, 
    //                                 {3*Math.pow(x1,2),2*x1, 1, 0},
    //                                 {3*Math.pow(x2,2), 2*x2, 1, 0}};       
 
    // }
    private String CreateInverseMatrix(int y1, int y2, int dy1, int dy2)
    {
        //CMatrixRMaj(float[4][4]);
        //invert(LinearSolverDense<CMatrixRMaj> solver, CMatrixRMaj A, CMatrixRMaj A_inv);        
        
        return " ";
        
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        CMatrixRMaj matrix1 = new CMatrixRMaj(5, 5);
    }
}
