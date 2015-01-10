public class Slash extends GameCharacter
{
   private Guitar guitar;
   private Solo solo;
   private String name;
   
 /*  public void setGuitar()
   {
      
   }
   public void setSolo(){}*/
   public Slash()
   {
      guitar = new FlyingV();
      solo = new SlashSolo();
      name = "Slash McShred";      
   }
   public void playGuitar()
   {
      System.out.print("\n"+name+ guitar.pGuitar());
   }
   public void playSolo()
   {
      System.out.print("\n"+name+solo.pSolo());   
   }

}