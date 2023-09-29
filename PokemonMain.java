public class PokemonMain {

    public static void main(String[] args) {

        firePokemon Charmander = new firePokemon("Charmander", 39, "fire", 20, "blaze", true);
        waterPokemon Slowbrow = new waterPokemon("Slowbrow", 95, "water", 30, "oblivious", true);
        grassPokemon Bulbasaur = new grassPokemon("Bulbasaur", 45, "grass", 49, "overgrow", true);
        electricPokemon Pikachu = new electricPokemon("Pikachu", 35, "electric", 55, "static", true);

        Charmander.playsCard();
        Slowbrow.playsCard();
        Bulbasaur.playsCard();
        Pikachu.playsCard();

        Charmander.pokemonAttacks();
        Charmander.hasAbility();
        Charmander.fireAttacks();


    }


}
