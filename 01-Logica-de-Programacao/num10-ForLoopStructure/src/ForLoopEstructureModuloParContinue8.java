public class ForLoopEstructureModuloParContinue8 {

    public static void main(String[] args) {


        // Imprimindo números PAR
        for (var i = 0; i <= 100; i++){
            if (i % 2 != 0) continue;

            System.out.println(i);
        }
    }

}

