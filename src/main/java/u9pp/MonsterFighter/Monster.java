package u9pp.MonsterFighter;
public class Monster extends Combatant{
  private int exp;
  
  public Monster(String name, int maxHealth, int attack, int experience){
    super(name, maxHealth,attack);
    exp = experience;
  }
    public int getExpGiven(){
      return exp;
    }
  public void getAttacked(int attackPower) {
        super.getAttacked(attackPower);
    }
      public String takeTurn(Combatant target){
        target.getAttacked(this.attack);
        return this.getName() + " attcked " + target + " with " + this.getAttackPower(this.attack);
      }
  
}


