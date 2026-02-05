import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Hola me llamo Santiago");

        Scanner entrada = new Scanner(System.in);
        int notas=5;
        int notaAprobado = 8;
        for(int i=0;i<notas;i++){
            System.out.println("Dime notas");
            notas=entrada.nextInt();
            
            if(notaAprobado<notas){
            System.out.println("Suspendido");
            }
            else{
                System.out.println("Aprobado");
            }
        }
        
        
        
        
        
    }
}
