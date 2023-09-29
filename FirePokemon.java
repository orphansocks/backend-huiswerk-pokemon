import javax.sound.midi.Soundbank;

public class firePokemon extends Pokemon {

    String ability;
    boolean fire = true;


    public firePokemon(String namePokemon,int hp, String type, int damage, String ability, boolean fire) {
        super(namePokemon, hp, type, damage);
        this.ability = ability;
        this.fire = fire;
    }

    public void hasAbility (){
        System.out.println(namePokemon + " has ability " + ability );
    }

    public void fireAttacks (){
        System.out.println("if " + namePokemon + "attacks, it gives " + damage + " damage, unless you are a waterPokemon" );
    }





}
