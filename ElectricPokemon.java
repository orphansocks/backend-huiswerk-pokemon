public class ElectricPokemon extends Pokemon {

    String ability;
    boolean electric = true;
    String sound;



    public ElectricPokemon(String namePokemon,int hp, String type, int damage, String ability, boolean electric) {
        super(namePokemon, hp, type, damage);
        this.ability = ability;
        this.electric = electric;
    }

}