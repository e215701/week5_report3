package jp.ac.uryukyu.ie.e215701;


public class LivingThing {
    String name ;
    int hitPoint ;
    int attack ;
    boolean dead ;

    LivingThing(String name, int maximumHP, int attack) {
        this.name = name ;
        hitPoint = maximumHP;
        this.attack = attack ;
        dead = false;
    }

    public boolean isDead(){
        return dead ;
    }

    public String getName(){
        return name ;
    }

    public void attack(LivingThing opponent){
        int damage = (int)(Math.random() * attack);
        if(this.dead == false){
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
        else{
            opponent.wounded(0);
        }
            
    }
    
    public void wounded(int damage) {
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("道半ばで力尽きてしまった。\n", name);
        }   
    }
}