package sample.Entity;

public class UserReason {

    private Long id;

    private User user;

    private Reason reason;

    private String country;

    private String comment;

    public UserReason(Long id, User user, Reason reason, String country, String comment) {
        this.id = id;
        this.user = user;
        this.reason = reason;
        this.country = country;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUser() {
        return user.getUsername();
    }

    public String getReason() {
        return reason.getName();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
