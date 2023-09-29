public class Pokemon {
    private String namePokemon;
    private int hp;
    String type;
    int damage;

    public String getNamePokemon() {
        return namePokemon;
    }

    public void setNamePokemon(String namePokemon) {
        this.namePokemon = namePokemon;
    }

    public Pokemon(String namePokemon, int hp, String type, int damage) {
        this.namePokemon = namePokemon;
        this.hp = hp;
        this.type = type;
        this.damage = damage;

    }


    public void playsCard() {
        System.out.println(this.namePokemon + " is type " + type + " with " + hp + " hp");
    }
    public void isAttacked(int damage) {
        this.hp = this.hp - damage;
        System.out.println(namePokemon + " is attacked and loses " + damage + " hp");
    }

    public void isAttackedByFire(int damage, String type){
        this.hp = this.hp - damage;
        System.out.println("in superclass Pokemon is attacked by fire dan minus damage");


    }






}
