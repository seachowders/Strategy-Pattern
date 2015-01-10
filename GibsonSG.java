public class GibsonSG implements Guitar
{
   private String gtar;
   public GibsonSG()
   {
      gtar  = "Gibson SG";
   }
   public String pGuitar()
   {
      return " plays his " +gtar+"!";
   }
}