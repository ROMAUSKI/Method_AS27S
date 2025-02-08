abstract class BebidaQuente {
    public final void prepararBebida() {
        ferverAgua();
        adicionarIngrediente();
        adicionarExtras();
        servir();
    }

    protected void ferverAgua() {
        System.out.println("Fervendo água...");
    }

    protected abstract void adicionarIngrediente();

    protected void adicionarExtras() {}

    protected void servir() {
        System.out.println("Bebida está pronta!\n");
    }
}

class Cafe extends BebidaQuente {
    @Override
    protected void adicionarIngrediente() {
        System.out.println("Adicionando café...");
    }

    @Override
    protected void adicionarExtras() {
        System.out.println("Adicionando açúcar e leite...");
    }
}

class Cha extends BebidaQuente {
    @Override
    protected void adicionarIngrediente() {
        System.out.println("Adicionando saquinho de chá...");
    }

    @Override
    protected void adicionarExtras() {
        System.out.println("Adicionando limão...");
    }
}

class ChocolateQuente extends BebidaQuente {
    @Override
    protected void adicionarIngrediente() {
        System.out.println("Adicionando chocolate em pó...");
    }

    @Override
    protected void adicionarExtras() {
        System.out.println("Adicionando leite...");
    }
}

public class Main {
    public static void main(String[] args) {
        BebidaQuente cafe = new Cafe();
        cafe.prepararBebida();

        BebidaQuente cha = new Cha();
        cha.prepararBebida();

        BebidaQuente chocolate = new ChocolateQuente();
        chocolate.prepararBebida();
    }
}
