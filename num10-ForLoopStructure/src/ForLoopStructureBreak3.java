public class ForLoopStructureBreak3 {
    public static void main(String[] args) {
        for (var i = 0; i <= 100; i++) {
            if (i == 90) break;
            // Aqui vai contar até 89 e o break vai sair do loop
            System.out.println(i);
        }
    }
}
