public class Main
{
    
    //1 - criar uma matriz
    //1º jeito
    //Esta vazia
	public static void main(String[] args) {
        int [][] tabela1 = {{},
                          {},
                          {}
        };


        //1- criar matriz
        //2º jeito
        //esta preenchida
        int linha = 3;
        int matriz [][] = new int[linha][2];
        matriz[0][0] = 2;
        matriz[0][1] = 4;
        matriz[1][0] = 5;
        matriz[1][1] = 6;
        matriz[2][0] = 3;
        matriz[2][1] = 2;
        
        
        //2- crie matriz 3x3, com números de 1 a 9 e acesse o número do meio(5)
        //1º jeito
        int [][] matrize = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
         System.out.println("Número do meio da matriz: "+matrize[1][1]);
        
        
        //2- crie matriz 3x3, com números de 1 a 9 e acesse o número do meio(5)
        //2º jeito
        int linha1 = 3;
        int matriz1 [][] = new int[linha1][3];
        matriz1[0][0] = 1;
        matriz1[0][1] = 2;
        matriz1[0][2] = 3;
        matriz1[1][0] = 4;
        matriz1[1][1] = 5;
        matriz1[1][2] = 6;
        matriz1[2][0] = 7;
        matriz1[2][1] = 8;
        matriz1[2][2] = 9;
        
        System.out.println("Número do meio(5) da matriz: "+matriz1[1][1]);
        
        
        //3-crie matriz 3x3 e printe todos os números dentro dela
        //1º jeito
        int tabela[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        for(int i = 0; i <3; i++){
            for(int j = 0; j <3; j++){
                System.out.print(tabela[i][j]+ " ");
            }
            System.out.println(" ");
            
        }
        //3-crie matriz 3x3 e printe todos os números dentro dela
        //2º jeito
       
	}
}