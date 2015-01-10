public class FenderTelecaster implements Guitar
{
   private String gtar;
   public FenderTelecaster()
   {
      gtar  = "Fender Telecaster";
   }
   public String pGuitar()
   {
      return " plays his " +gtar+"!";
   }
}