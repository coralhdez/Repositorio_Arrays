
package proyecto_arrays;


public class TestMatrices {
    
    
    public static void main(String[] args) {
        
        int edades[][] = new int [3][2];
        
        edades[0][0] = 5;
        edades[0][1] = 10;
        edades[1][0] = 15;
        edades[1][1] = 3;
        edades[2][0] = 7;
        edades[2][1] = 9;
        
        imprimir(edades);
        
        //System.out.println("edades: " + edades);
        
        
        
    }
    
    public static void imprimir(int matriz[][]){
    
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Edades[" + i + "] = " +matriz[i][j]);
            }
        }
    }
}
