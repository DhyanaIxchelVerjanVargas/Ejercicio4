import java.util.Scanner;

/**
 * El código se basa en el juego piedra, papel o tijeras. La piedra le gana a las tijeras,
 * las tijeras le ganan al papel
 * y el papel le gana a la piedra.
 * Si los jugadores tienen el mismo elemento entonces se llega a un empate.
 * 
 * Al final del juego, el programa nos muestra que jugador ha ganado.
 */
public class Codigo4 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	    
	    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    String j2 = s.nextLine();
	    
	    if (j1.equals(j2)) {
	      System.out.println("Empate");
	    }// if
	    else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2.equals("tijeras")) {
	            g = 1;
	          }//if
	          break;
	        case "papel":
	          if (j2.equals("piedra")) {
	            g = 1;
	          }//if
	            break;
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	      }//switch
	      System.out.println("Gana el jugador " + g);
	    }//else
	      
	}//psvm
    
}//class