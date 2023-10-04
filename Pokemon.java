public class Pokemon {
    private String namePokemon;
    private int hp;
    String type;
    int damage;

    public String getNamePokemon() {
        return namePokemon;
    }

    public void setNamePokemon(String namePokemon) {
        this.namePokemon = namePokemon;
    }

    public Pokemon(String namePokemon, int hp, String type, int damage) {
        this.namePokemon = namePokemon;
        this.hp = hp;
        this.type = type;
        this.damage = damage;

    }

    public void playsCard() {
        System.out.println(this.namePokemon + " is type " + type + " with " + hp + " hp");
    }
    public void isAttacked(int damage) {
        this.hp = this.hp - damage;
        System.out.println(namePokemon + " is attacked and loses " + damage + " hp");
        System.out.println(namePokemon + " has left " +  hp);
    }

    public void isAttackedByFire(String type){
        if(type.equals("fire")) {
            System.out.println(namePokemon + " remains unharmed");
        }
        else if(type.equals("water")) {
            System.out.println(namePokemon + " is type water and is super-effective against fire");
        }
            else {
                System.out.println(namePokemon + " is attacked  ");
            }
        }


    }



