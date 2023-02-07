public class Main {
    public static void main(String[] args) {

        Bike c1 = new Bike(2, 30.0);
        System.out.println(c1.getVelocidade());

        try{
            c1.acelerar(100);

        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
//        throw: dispara uma exceção, que tem que estar listada no throws do método;
//        throws: lista de exceções que podem ser disparadas por um método.

//        são aquelas no qual você é obrigado a tratá-la, seja com um bloco try-catch ou mesmo com um throws (relançando a mesma para outro local)
    }
}
