public class Hero extends Character {
    String weapon;
    public Hero (String name,int hp,String weapon){
        super(name,hp);
        this.name = name;
        this.hp = hp;
        this.weapon =weapon;
    }
    public void attack(Character target){
        System.out.println(name + "は"+weapon+"で攻撃!"+target.name+"に10のダメージを与えた!");
        target.hp -= 10;

    }
    public void heal(){
        System.out.println(name+"は回復呪文を唱えた!HPが２０回復した!");
        hp += 20;
    }



}