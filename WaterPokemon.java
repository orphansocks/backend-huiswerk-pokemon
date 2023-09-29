public class waterPokemon extends Pokemon {

    String ability;
    boolean water = true;



    public waterPokemon(String namePokemon,int hp, String type, int damage, String ability, boolean water) {
        super(namePokemon, hp, type, damage);
        this.ability = ability;
        this.water = water;
    }


    }


