public class WaterPokemon extends Pokemon {

    String ability;
    boolean water = true;



    public WaterPokemon(String namePokemon,int hp, String type, int damage, String ability, boolean water) {
        super(namePokemon, hp, type, damage);
        this.ability = ability;
        this.water = water;
    }

    public void isTypeWater (){
        System.out.println(getNamePokemon() + " : 'dit is onjuist, ik ben een waterPokemon'");
    }


    }


