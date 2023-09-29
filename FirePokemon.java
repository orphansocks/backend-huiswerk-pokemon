public class FirePokemon extends Pokemon {

    String ability;
    boolean fire = true;


    public FirePokemon(String namePokemon,int hp, String type, int damage, String ability, boolean fire) {
        super(namePokemon, hp, type, damage);
        this.ability = ability;
        this.fire = fire;
    }

    public void hasAbility (){
        System.out.println(getNamePokemon() + " has ability " + ability );
    }


    public void fireAttacks (int damage){
        System.out.println("if " + getNamePokemon() + " attacks, it gives " + damage + " damage, unless you are a waterPokemon" );
    }



}
