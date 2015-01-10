public class GuitarHero {
    public static void main(String[] args) {
        GameCharacter player1 = new Jimi();
        GameCharacter player2 = new Slash();
        player1.playGuitar();
        player2.playGuitar();
        player1.playSolo();
        player2.playSolo();
        player1.setGuitar(new FlyingV());
        player1.setSolo(new AngusSolo());
        player1.playGuitar();
        player2.playGuitar();
        player1.playSolo();
        player2.playSolo();
        
    }
}