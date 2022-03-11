package u9pp.MonsterFighter;

class SlowMonster extends Monster{
  private int turn = 0;
  
  public SlowMonster(String name, int maxHealth, int attack, int experience){
    super(name, maxHealth, attack, experience);
  }
  public void getAttacked(int attackPower) {
        super.getAttacked(attackPower);
    }
      public String takeTurn(Combatant target){
        turn++;
        if(turn % 2 == 1){
          target.getAttacked(this.attackPower);
        return this.getName() + " attcked " + target + " with " + this.getAttackPower(this.attackPower);
          
        }
        return this.getName() + " is Lazy to attck";
      }
}


