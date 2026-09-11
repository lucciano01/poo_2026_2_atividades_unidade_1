package revisao;

public class App {

    static void main() {

//        Personagem hero1 = new Personagem();
//        hero1.setNome("Jose");
//        hero1.setVida(10);
//
//        Personagem hero2 = new Personagem("Shaolin", 50);
//
//        System.out.println(hero1);
//        hero1.atacar();
//        System.out.println(hero2);
//        hero2.atacar();
        try{
        Personagem guerreiro = new Guerreiro("Pe", 100, true);
        Personagem bruxo = new Bruxo("Ronaldinho", 10, true);
            System.out.println(guerreiro);
            System.out.println(bruxo);
            guerreiro.atacar();
            bruxo.atacar();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }


    }

}
