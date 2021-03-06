package com.example.root.makingit;

import com.google.firebase.firestore.Exclude;
import com.google.firebase.firestore.ServerTimestamp;

import java.util.Date;

public class ForumPostInfo {
    @ServerTimestamp
    private Date fdate;
    String fid;
    String fname;
    String fdetail;
    String fauthor;
    String fcomment;
    String fupvote;
    String forumImage;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Boolean getUpvoted() {
        return upvoted;
    }

    public void setUpvoted(Boolean upvoted) {
        this.upvoted = upvoted;
    }

    @Exclude
    int count;
    @Exclude
    Boolean upvoted;
    public  ForumPostInfo()
    {

    }
    public ForumPostInfo(String fid,String fname,String fdetail,
                         String fauthor,String fcomment,
                         String fupvote,String forumImage)
    {
        this.forumImage = forumImage;
        this.fid = fid;
        this.fname = fname;
        this.fdetail = fdetail;
        this.fauthor = fauthor;
        this.fcomment = fcomment;
        this.fupvote = fupvote;
    }

    public void setFdate(Date fdate) { this.fdate = fdate; }
    public void setFdetail(String fdetail) { this.fdetail = fdetail; }
    public void setFid(String fid) { this.fid = fid; }
    public void setFname(String fname) { this.fname = fname; }
    public void setFupvote(String fupvote) { this.fupvote = fupvote; }
    public void setFauthor(String fauthor) { this.fauthor = fauthor; }
    public void setFcomment(String fcomment) { this.fcomment = fcomment; }
    public void setForumImage(String forumImage) { this.forumImage = forumImage; }

    public String getForumImage() { return forumImage; }
    public String getFauthor() { return fauthor; }
    public String getFcomment() { return fcomment; }
    public Date getFdate() { return fdate; }
    public String getFdetail() { return fdetail; }
    public String getFid() { return fid; }
    public String getFname() { return fname; }
    public String getFupvote() { return fupvote; }
}
