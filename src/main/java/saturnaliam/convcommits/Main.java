package main.java.saturnaliam.convcommits;

public class Main {
    public static void main(String[] args) {
        CommitTag fix = new CommitTag("fix", "denotes a fix for an issue.");

        try {
            Commit commit = new CommitBuilder().addTag(fix).addMessage("balling").addScope("intake").build();
            System.out.println(commit.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}