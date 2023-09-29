import java.util.ArrayList;

public class PokemonMain {

    public static void main(String[] args) {

        FirePokemon Charmander = new FirePokemon("Charmander", 39, "fire", 20, "blaze", true);
        WaterPokemon Slowbrow = new WaterPokemon("Slowbrow", 95, "water", 30, "oblivious", true);
        GrassPokemon Bulbasaur = new GrassPokemon("Bulbasaur", 45, "grass", 49, "overgrow", true);
        ElectricPokemon Pikachu = new ElectricPokemon("Pikachu", 35, "electric", 55, "static", true);


        System.out.println("--------------------------------");

        Charmander.playsCard();
        Slowbrow.playsCard();
        Bulbasaur.playsCard();
        Pikachu.playsCard();

        System.out.println("--------------------------------");

        Charmander.fireAttacks(20);
        Slowbrow.isAttacked(20);
        Slowbrow.isTypeWater();
        Bulbasaur.isAttacked(20);
        Bulbasaur.isTypeGrass();

        System.out.println("--------------------------------");

        Pikachu.isAttackedByFire(30, "fire");
        Slowbrow.isAttackedByFire(20, "fire");



    }


}
