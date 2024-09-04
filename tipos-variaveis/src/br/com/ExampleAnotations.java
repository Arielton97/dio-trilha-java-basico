package br.com;

@interface ExampleAnotations {

    String autor();

    int aulaNumero();

    String blog() default "http://arielton97.com/";

    String site() default "http://arielton97.com/home/";
}