abstract class GameCharacter
{
   private Guitar guitar;
   private Solo solo;
   private String name;
   
   abstract void setGuitar(Guitar inc);
   abstract void setSolo(Solo inc);
   abstract void playGuitar();
   abstract void playSolo();
}