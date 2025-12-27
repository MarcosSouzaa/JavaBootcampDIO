package br.com.dio.poo.model.usingRecord;

/**
 * Vou passar os parâmetros dentro do construtor do record
 * @param userId
 * @param id
 * @param title
 * @param body
 */
public record PostRecord(

    Integer userId,
    Integer id,
    String title,
    String body

) {

    /** PARTE 2
     * Vamos supor que eu quisesse passar agora apenas o userId
     * eu teria que criar um novo construtor e repetir todos os parâmetros com null
     *
     * @param userId
     */
    //public PostRecord(Integer userId) {
      //  this(userId,  null, null, null) ;
 //   }

    /** PARTE 1
     * Vou criar um method para construir o meu objeto através do record passando os dados
     * para as referências que criei
     */
    public void test() {
        PostRecord postRecord = new PostRecord(0, 1, "title", "body");
    }
  }
