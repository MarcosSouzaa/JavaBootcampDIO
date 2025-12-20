public class ForLoopEstructureArgs9 {

    public static void main(String[] args) {
        for (var i = 0; i < args.length; i++) {
            /*
            Vou passar os argumentos em Run/ Edit Configuration
            Primeira forma:
            System.out.println(args[i]); Passando a Lista.

            Segunda forma: Passando a Lista com os índices começando do zero
            System.out.println(i + " - " + args[i]);
            */

            /* Terceira forma: Passando a Lista com os índices começando do 1 */
            System.out.println(i + 1 + " - " + args[i]);
        }
    }
}
