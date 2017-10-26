/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domainmodel;

import java.util.Date;

/**
 *
 * @author 687159
 */
public class Note 
{
    private int noteID;
    private Date dateCreated;
    private String contents;

    public Note(int noteID, Date dateCreated, String contents) 
    {
        this.noteID = noteID;
        this.dateCreated = dateCreated;
        this.contents = contents;
    }

    public Note() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNoteID() 
    {
        return noteID;
    }

    public void setNoteID() 
    {
        this.noteID = noteID;
    }

    public Date getDateCreated() 
    {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) 
    {
        this.dateCreated = dateCreated;
    }

    public String getContents() 
    {
        return contents;
    }

    public void setContents(String contents) 
    {
        this.contents = contents;
    }
}
