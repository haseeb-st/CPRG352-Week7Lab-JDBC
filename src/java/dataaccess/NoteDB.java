/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

import domainmodel.Note;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 687159
 */
public class NoteDB 
{
    Note n = new Note();
    int noteID;
    Date dateCreated;
    String content;
    
    public int insert(Note note) throws NotesDBException
    {
        int Content = Integer.parseInt(content);
        
        return Content;
    }
    
    public int update(Note note) throws NotesDBException
    {
        int Update = (int) (dateCreated.getTime());
        
        return Update;
    }
    
    public List <Note> getAll() throws NotesDBException
    {
        
    }
    
    public int getNote() throws NotesDBException
    {
        noteID = n.getNoteID();
        
        return noteID;
    }
    
    public Date getDateCreated() throws NotesDBException
    {
        dateCreated = n.getDateCreated();
        
        return dateCreated;
    }
        
    public String getContents() throws NotesDBException
    {
        content = n.getContents();
        
        return content;
    }
    
}
