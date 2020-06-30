package app.enums.entities;

import java.util.*;
import java.text.*;

/**
 * Post
 */
public class Post {
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> commnets = new ArrayList<>();

    public Post(){}

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getCommnets() {
        return commnets;
    }

    public void addComment(Comment comment){
		this.commnets.add(comment);
    }
	
	public void removeComment(Comment comment){
		this.commnets.remove(comment);
    }

	@Override
	public String toString()
	{
		
		StringBuilder sb = new StringBuilder();
		sb.append(title + '\n');
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		for (Comment c : commnets){
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}
}
