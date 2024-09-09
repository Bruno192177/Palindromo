
package mx.itson.palindromo.business;


public class Palindromo {
    public static boolean isPalindromo(String phrase) {
        if (phrase == null || phrase.isEmpty()) { 
            throw new IllegalArgumentException("No escribiste ningun Palindromo");
        }

        String cleanPhrase = phrase.replaceAll("[^a-z A-Z 0-9]", "").toLowerCase();

        return cleanPhrase.equals(new StringBuilder(cleanPhrase).reverse().toString()); //Compara la frase al reverso
    }
}
