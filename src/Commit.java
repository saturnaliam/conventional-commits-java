public class Commit {
    private CommitTag commitTag;
    private CommitScope commitScope;
    private String commitMessage;

    /**
     * @throws Throws if commitTag or commitScope are empty.
     * @param commitTag The commit tag to use (fix, chore, etc.)
     * @param commitScope The scope of the commit (optional)
     * @param commitMessage The commit message
     */
    public Commit(CommitTag commitTag, CommitScope commitScope, String commitMessage) {
        if (commitTag == null) {
            throw new RuntimeException("[COMMIT] commit tag cannot be null!");
        } else if (commitMessage == "") {
            throw new RuntimeException("[COMMIT] commit message cannot be empty!");
        }

        this.commitMessage = commitMessage;
        this.commitTag = commitTag;
        this.commitScope = commitScope;
    }

    public String getMessage() {
        String output = String.format("%s:", this.commitTag.tagName);

        if (commitScope != null) {
            output += String.format("(%s) ", this.commitScope.scope);
        }

        output += commitMessage;
        return output;
    }
}
