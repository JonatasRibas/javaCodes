
    Cantor cantorA, cantorB, cantorC, cantorD;

    cantorA = new Cantor();
    cantorB = new Cantor();
    cantorC = cantorA;
    cantorD = new Cantor();

    cantorA.setCodigo(1l);
    cantorA.setNome("Guilherme");
    cantorA.setGeneroMusical("Sertanejo");

    cantorB.setCodigo(2l);
    cantorB.setNome("Jose");
    cantorB.setGeneroMusical("Funk");

    cantorD.setCodigo(1l);
    cantorD.setNome("Guilherme");
    cantorD.setGeneroMusical("Sertanejo");

    System.out.println(cantorC.getNome()); //Guilherme

    System.out.println(cantorA == cantorB); //false
    System.out.println(cantorA == cantorC); //true
    System.out.println(cantorA == cantorD); //false
    System.out.println(cantorA.equals(cantorD)); //true
    System.out.println(cantorA.equals(cantorC)); //true

    System.out.println(cantorA.toString()); //Código: 1 Nome: Guilherme GeneroMusical: Sertanejo
