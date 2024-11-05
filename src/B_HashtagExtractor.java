import java.lang.reflect.Array;
import java.util.Arrays;
/***
 * Problem: In social media, hashtags always start with the "#" symbol.
 * Write a method that extracts and prints all the hashtags from a given string.
 * Expected output: Hashtag: #coding, Hashtag: #Java!
 */

public class B_HashtagExtractor {

    public static void main(String[] args) {
        B_HashtagExtractor b = new B_HashtagExtractor();
    }

    public B_HashtagExtractor() {
        String post = "I love #coding #and #Java!";
        extractHashtags(post); // Output: Hashtag: #coding, Hashtag: #Java
    }

    public void extractHashtags(String post) {
        /* TODO: your code goes here */

        int index = post.indexOf("#");
        String[] word = post.split(" ");
        //for loop to search for # and ten printing out the word
        for(int x=0; x<word.length; x++){
            if(word[x].contains("#")){
                System.out.println(word[x]);
            }
        }


        index = post.indexOf("#");
        while(index != -1){

            int endIndex = post.indexOf(" ", index);
            if (endIndex != -1){
                System.out.println("Hashtag: " + post.substring(index, endIndex));
            } else {
                endIndex = post.length();
                System.out.println("Hashtag: " + post.substring(index, endIndex));
            }
            index = post.indexOf("#", endIndex);

        }
    }
}



