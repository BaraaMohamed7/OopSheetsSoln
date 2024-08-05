import java.util.Arrays;
import java.util.Comparator;

public class Post {
    private String postText;
    private int numberOfLikes;

    Post(String postText) {
        this.postText =postText;
        this.numberOfLikes = 0;
    }

    public void editPost(String newPostText) {
        this.postText = postText;
    }

    public String getPostText() {
        return postText;
    }

    public void addLike() {
        numberOfLikes++;
    }

    public void removeLike() {
        numberOfLikes--;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public static Post findPostWithMostLikes(Post[] posts) {
        Post max = posts[0];
        for (int i = 0; i < posts.length; i++) {
            if (max.numberOfLikes < posts[i].numberOfLikes) {
                max = posts[i];
            }
        }
        return max;
    }
}
