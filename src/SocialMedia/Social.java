package SocialMedia;


import java.util.ArrayList;
import java.util.List;

public class Social {
    public static void main(String[] args) {
       User user1 = new User("Rivu Naskar", "rivunaskar0@gmail.com");
       User user2 = new User("Someone", "someone@gmail.com");
        User user3 = new User("Dadu", "dadu@gmail.com");
        Post post1 = new Post(user1, "This is my first post");
        post1.addLike(user2);
        post1.addLike(user3);
        Comment comment = new Comment(user2, "Very good post");
        post1.addComment(comment);

        System.out.println(post1.getLikes());

        for (int i = 0; i< post1.getComments().size();i++){
            System.out.println(post1.getComments().get(i).getContent());
        }

    }

}

    class User{
        private String name;
        private String email;

        User(String name, String email){
            this.name = name;
            this.email = email;
        }

        public String getName(){
            return name;
        }

        public String getEmail(){
            return email;
        }

    }


    class Post {
        private User author;
        private String content;
        private List<Comment> comments;
        private List<User> likes;

        public Post(User author, String content) {
            this.author = author;
            this.content = content;
            this.comments = new ArrayList<>();
            this.likes = new ArrayList<>();
        }



        public User getAuthor() {
            return author;
        }

        public String getContent() {
            return content;
        }

        public List<Comment> getComments() {
            return comments;
        }

        public int getLikes() {
            return likes.size();
        }

        public void addComment(Comment comment) {
            comments.add(comment);
        }

        public void addLike(User user) {
            likes.add(user);
        }
    }

    class Comment {
        private User author;
        private String content;


        public Comment(User author, String content) {
            this.author = author;
            this.content = content;

        }


        public User getAuthor() {
            return author;
        }

        public String getContent() {
            return content;
        }

    }

