import java.util.ArrayList;
import java.util.HashMap;

public class PokemonMain {

    public static void main(String[] args) {

        HashMap<String, Integer> pokemon = new HashMap<String, Integer>();

        pokemon.put("Charmander", 39);
        pokemon.put("Slowbrow", 95);
        pokemon.put("Bulbasaur", 45);
        pokemon.put("Pikachu", 55);

        System.out.println("--------------------------------");
        System.out.println("Show your deck in 2 ways:");

   for (String n : pokemon.keySet()) {
       System.out.println("card " + n + " hp " + pokemon.get(n));

   }
        System.out.println("--------------------------------");
        System.out.println(pokemon);

        System.out.println("--------------------------------");

        FirePokemon Charmander = new FirePokemon("Charmander", 39, "fire", 20, "blaze", true);
        WaterPokemon Slowbrow = new WaterPokemon("Slowbrow", 95, "water", 30, "oblivious", true);
        GrassPokemon Bulbasaur = new GrassPokemon("Bulbasaur", 45, "grass", 49, "overgrow", true);
        ElectricPokemon Pikachu = new ElectricPokemon("Pikachu", 35, "electric", 55, "static", true);

        ArrayList<String> myPokemons = new ArrayList<String>();

        myPokemons.add("Charmander");
        myPokemons.add("Slowbrow");
        myPokemons.add("Bulbasaur");
        myPokemons.add("Pikachu");

        Charmander.playsCard();
        Slowbrow.playsCard();
        Bulbasaur.playsCard();
        Pikachu.playsCard();

        System.out.println("--------------------------------");

        Charmander.fireAttacks(20);
        Slowbrow.isAttacked(20);
        Slowbrow.isTypeWater();

        System.out.println("--------------------------------");

        Bulbasaur.isAttacked(20);
        Bulbasaur.isTypeGrass();

        System.out.println("--------------------------------");

        Pikachu.isAttackedByFire(30, "fire");
        Slowbrow.isAttackedByFire(20, "fire");

        System.out.println("--------------------------------");



    }


}
