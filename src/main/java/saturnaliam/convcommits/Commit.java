package main.java.saturnaliam.convcommits;

public class Commit {
    private CommitTag commitTag;
    private String commitScope;
    private String commitMessage;
    private Boolean breakingChange;

    /**
     * @throws commitTag unset
     * @throws commitMessage unset
     * @param commitTag The commit tag to use (fix, chore, etc.)
     * @param commitScope The scope of the commit (optional)
     * @param commitMessage The commit message
     * @param breakingChange Indicates if the commit is a breaking change
     */
    public Commit(CommitTag commitTag, String commitScope, String commitMessage, Boolean breakingChange) {
        if (commitTag == null) {
            throw new RuntimeException("[COMMIT] commit tag cannot be null!");
        } else if (commitMessage == "") {
            throw new RuntimeException("[COMMIT] commit message cannot be empty!");
        }

        this.breakingChange = breakingChange;
        this.commitMessage = commitMessage;
        this.commitTag = commitTag;
        this.commitScope = commitScope;
    }

    /**
     * 
     * @return The fully formatted commit message
     */
    public String getMessage() {
        String output = String.format("%s", this.commitTag.tagName);

        if (this.commitScope != null) {
            output += String.format("(%s)", this.commitScope);
        }

        if (this.breakingChange) {
            output += "!";
        }

        output += ": " + this.commitMessage;
        return output;
    }
}
