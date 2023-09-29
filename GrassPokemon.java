public class GrassPokemon extends Pokemon {

    String ability;
    boolean grass = true;



    public GrassPokemon(String namePokemon,int hp, String type, int damage, String ability, boolean grass) {
        super(namePokemon, hp, type, damage);
        this.ability = ability;
        this.grass = grass;
    }

    public void isTypeGrass (){
        System.out.println(getNamePokemon() + " : 'oke, hit me: ik ben een grassPokemon'");
    }
}
