package br.com.dio.CreatingFirstClass;

public class PersonTest {

    public static void main(String[] args) {

        Person male = new Person();
        male.setName( "Marcos Antonio");
        male.setAge(58);

        var female = new Person();
        female.setName("Gisele");
        female.setAge(51);

        System.out.printf("O nome do marido é %s e sua idade é %s \n", male.getName(), male.getAge());
        System.out.printf("O nome da esposa é %s e sua idade é %s \n", female.getName(), female.getAge());
    }

}
