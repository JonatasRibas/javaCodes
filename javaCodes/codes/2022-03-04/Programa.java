/////
Programa
/////
    Horario h1, h2;
    h1 = new Horario(); //processo de instanciação (operador new)
    h2 = new Horario(); //processo de instanciação (operador new)

    h1.hora = 30;//hora e privado, logo nao funciona

    h1.setHora(23);
    h1.setMinuto(30);
    h1.setSegundo(50);

    System.out.println(h1.hora); //hora e privado, logo nao funciona

    System.out.println(h1.getHora());
    System.out.println(h1.getMinuto());
    System.out.println(h1.getSegundo());