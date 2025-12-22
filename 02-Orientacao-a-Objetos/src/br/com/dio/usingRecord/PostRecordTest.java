package br.com.dio.usingRecord;

public class PostRecordTest {

    public static void main(String[] args) {

        PostRecord usuario = new PostRecord(1, 1, "Consultor", "Mecatrônico");

        usuario.userId();
        usuario.id();
        usuario.title();
        usuario.body();

        System.out.printf("Usuário Id: %s, seu Identificador é n° %s, seu cargo é %s e sua função é %s.\n",
                usuario.userId(),
                usuario.id(),
                usuario.title(),
                usuario.body() );
    }
}
