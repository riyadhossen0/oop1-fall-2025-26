public class MidTask2 {
      public static void main(String[] args) {
        /*  A system stores a customer's first and last name separately. Combine them into a single 
formatted full name.*/
        String firstName = "Riyad ";
        String lastName = "Hossen";
        String fullName = firstName.concat(lastName);
        System.out.println("FullName: "+fullName);   
        /*Generate a product code by joining the product name and ID. */
        String productName = "aiub";
        String productId = "2435";
        String productCode =productName.concat(productId);
        System.out.println("Product Code: "+productCode);
        /*Extract the username (before @) from an email address */
        String email = "riyadhossen1874@gmail.com";
        int index = email.indexOf("@");
        String userName = email.substring(0, index);
        System.out.println("Username : "+userName);
        /*A chat app must show the total number of characters in a user’s message*/
        String chat = "we live in earth";
        System.out.println("Length of chat " + chat.length());

        /*Convert a user-entered sentence to both uppercase and lowercase. */
        String text = "this is oop1 class.";
        String upperCaseString = text.toUpperCase();
        System.out.println("Sentence in Uppercase : " + upperCaseString);
        String lowerCaseString = text.toLowerCase();
        System.out.println("Sentence in Lowercase str1: " + lowerCaseString);

        /*Replace a specific word in a sentence */
        String sentence = "The world is beautiful";
        String replacedSentence = sentence.replace("beautiful", "green");
        System.out.println("Replaced String: " + replacedSentence);
}
}
