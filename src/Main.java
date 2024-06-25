public class Main {
    public static void main(String[] args) {
        CommitTag fix = new CommitTag("fix", "denotes a fix for an issue.");

        try {
            Commit commit = new CommitBuilder().addTag(fix).addMessage("balling").build();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}