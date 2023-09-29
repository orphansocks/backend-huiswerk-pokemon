public class electricPokemon extends Pokemon {

    String ability;
    boolean electric = true;



    public electricPokemon(String namePokemon,int hp, String type, int damage, String ability, boolean electric) {
        super(namePokemon, hp, type, damage);
        this.ability = ability;
        this.electric = electric;
    }

}