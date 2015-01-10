public class Angus extends GameCharacter
{
   private Guitar guitar;
   private Solo solo;
   private String name;
   
  public void setGuitar(Guitar inc)
   {
      guitar = inp;
   }
   public void setSolo(Solo inc)
   {
      solo = inc;
   }
   public Angus()
   {
      guitar = new FenderTelecaster();
      solo = new AngusSolo();
      name = "Angus Young";      
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