public class CommitBuilder {
    private CommitScope commitScope = null;
    private CommitTag commitTag = null;
    private String commitString = "";

    CommitBuilder addScope(CommitScope commitScope) {
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
            return new Commit(this.commitTag, this.commitScope, this.commitString);
        } catch (Exception e) {
            throw e;
        }
    }
}
