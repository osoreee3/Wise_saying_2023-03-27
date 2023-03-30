package ll;

public class WiseSaying {
    private String content;
    private int id;
    private String authorName;

    WiseSaying(int id, String content, String authorName) {
        this.id = id;
        this.content = content;
        this.authorName = authorName;

    }

    public int getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }

    public String getAuthorName() {
        return this.authorName;
    }
}
