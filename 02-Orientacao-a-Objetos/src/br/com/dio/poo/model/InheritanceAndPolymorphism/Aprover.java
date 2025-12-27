package br.com.dio.poo.model.InheritanceAndPolymorphism;
/* INTERFACE
 * A ideia é muito próxima ao que é o method abstrato numa classe. Eu vou definir que somente
 * as classes que quiserem utilizar aquele contrato é que vão ser obrigadas a implementar.
 * Então, para o gerente e para o diretor eu posso dizer: vocês são obrigados a ter um method
 * aprovar projeto, todos os outros não.
 * Não precisa colocar que é público, é redundante porque tem que estar visível
 * OBS:
 * É PREFERÍVEL USAR INTERFACE A CLASSE ABSTRATA porque posso usar vários comportamentos
 */
public interface Aprover {
 //Declaro só o cabeçalho, quem vai fazer a implementação é quem usará a interface
    void approveProjects (String ProjectName);
}
