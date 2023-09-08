import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
     Scanner tec= new Scanner(System.in);
     int parametroUm;
     int parametroDois;

        System.out.println("Digite o primeiro numero: ");
        parametroUm=tec.nextInt();
        System.out.println("Digite o segundo número: ");
        parametroDois= tec.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosExceptions e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

     static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosExceptions {
        if(parametroUm<parametroDois){
            int contador= parametroDois-parametroUm;
            for(int i=0; i<contador; i++){
                System.out.println("Contando..." + i);
            }
        } else{
            throw new ParametrosInvalidosExceptions("O segundo número deve ser maior que o primeiro");
        }

     }
}