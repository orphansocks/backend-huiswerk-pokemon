public class grassPokemon extends Pokemon {

    String ability;
    boolean grass = true;



    public grassPokemon(String namePokemon,int hp, String type, int damage, String ability, boolean grass) {
        super(namePokemon, hp, type, damage);
        this.ability = ability;
        this.grass = grass;
    }
}
