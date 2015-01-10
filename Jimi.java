public class Jimi extends GameCharacter
{
   private Guitar guitar;
   private Solo solo;
   private String name;
   
   public void setGuitar(Guitar inc)
   {
      guitar = inc;
   }
   public void setSolo(Solo inc)
   {
      solo = inc;
   }
   public Jimi()
   {
      guitar = new GibsonSG();
      solo = new JimiSolo();
      name = "Jimi Hendrix";      
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