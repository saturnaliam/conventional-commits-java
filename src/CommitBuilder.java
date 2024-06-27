public class CommitBuilder {
    private String commitScope = null;
    private CommitTag commitTag = null;
    private String commitString = "";
    private Boolean breakingChange = false;

    CommitBuilder addScope(String commitScope) {
        this.commitScope = commitScope;
        return this;
    }

    CommitBuilder addTag(CommitTag commitTag) {
        this.commitTag = commitTag;
        return this;
    }

    CommitBuilder addMessage(String commitString) {
        this.commitString = commitString;
        return this;
    }

    Commit build() {
        try {
            return new Commit(this.commitTag, this.commitScope, this.commitString, this.breakingChange);
        } catch (Exception e) {
            throw e;
        }
    }
}
