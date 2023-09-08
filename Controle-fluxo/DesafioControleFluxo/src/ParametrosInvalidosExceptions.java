public class ParametrosInvalidosExceptions extends Exception{
    public ParametrosInvalidosExceptions(String mensagem){
        super("O segundo parâmetro deve ser maior que o primeiro");

    }

}
