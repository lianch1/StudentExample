// adding a comment - Commit#2
// adding a comment - Commit#3
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoring;


/**
 *
 * @author Ali Hassan
 */
public class Tutoring1 {

    private String name;
    private String stdId;

    public Tutoring1(String stdId, String name) {
        this.stdId = stdId;
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the stdId
     */
    public String getStdId() {
        return stdId;
    }

    /**
     * @param stdId the stdId to set
     */
    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

}
