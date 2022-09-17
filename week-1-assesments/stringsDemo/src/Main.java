
public class Main {

    public static void main(String[] args) {

	    String message = "Bugün hava çok güzel. ";
        System.out.println(message);

        System.out.println("Eleman sayısı : " + message.length());
        System.out.println("5.eleman : "+ message.charAt(4));
        System.out.println(message.concat(" Yaşasın!"));
        System.out.println(message.startsWith("b")); //false-case sensitive
        System.out.println(message.endsWith("."));

        char[] characters = new char[5];
        message.getChars(0,5,characters,0);
        System.out.println(characters);

        System.out.println(message.indexOf("av"));
        System.out.println(message.lastIndexOf("a"));

        String newMessage = message.replace(' ', '-');
        System.out.println(newMessage);

        System.out.println(message.substring(2,5));

        for(String word : message.split(" ")){
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }
}
