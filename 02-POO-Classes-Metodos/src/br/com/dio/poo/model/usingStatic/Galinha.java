package br.com.dio.poo.model.usingStatic;

public class Galinha {

    /* Variável GLOBAL para toda a class = static
    pertence à Classe Galinha */
    public static int ovosDaGranja;
    //total dos ovos do objeto galinha
    public int ovos;

    /* Para que eu consiga retornar o meu objeto na mesma linha na classe de teste
    ao invés de fazer meu metodo vazio (void), vou retornar ele e this será a referência.*/
    public Galinha botar(){
        this.ovos ++;
        Galinha.ovosDaGranja ++; //Só consigo acessar ovosDaGranja usando a Classe, ela ñ pertence ao metodo
        return this; //retorna o objeto Galinha
    }
    /* metodo  Global (static) que a pessoa informa a quantidade de galinhas e ele diz a quantidade de ovos
    this representa instâncias de objeto e o nosso metodo não conhece instâncias de objeto, por isso,
    não se usa this aqui. Por outro lado, posso acessar diretamente as minhas variáveis estáticas ex.:
    ovosDaGranja.
     */
    public static double mediaDeOvos(int galinhas){
        return  ovosDaGranja / galinhas;
    }

}
