// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random generator = new Random();

    int[] liczby = new int[5];

    int suma=0;
    
    System.out.println("Wylosowane liczby:");
    for(int i=0; i<5; i++){
      
    liczby[i] = generator.nextInt(100);
    
    System.out.println(liczby[i]);
      suma+=liczby[i];
    }

    System.out.println("Suma: " + suma);
      
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}