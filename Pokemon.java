public class Pokemon {
    String namePokemon;
    int hp;
    String type;
    int damage;

    public Pokemon(String namePokemon, int hp, String type, int damage) {
        this.namePokemon = namePokemon;
        this.hp = hp;
        this.type = type;
        this.damage = damage;

    }


    public void playsCard() {
        System.out.println(this.namePokemon + " is type " + type + " with " + hp + " hp");
    }

    public void pokemonAttacks() {
        System.out.println(namePokemon + " attacks with " + type + " it does " + damage + " damage ");
    }


}
