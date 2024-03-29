package com.mycompany.apps.entity;

public class Grouptable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TUTORIAL.GROUPTABLE.USERNAME
     *
     * @mbggenerated Mon Jan 20 21:48:37 JST 2014
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TUTORIAL.GROUPTABLE.GROUPID
     *
     * @mbggenerated Mon Jan 20 21:48:37 JST 2014
     */
    private String groupid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TUTORIAL.GROUPTABLE.USERNAME
     *
     * @return the value of TUTORIAL.GROUPTABLE.USERNAME
     *
     * @mbggenerated Mon Jan 20 21:48:37 JST 2014
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TUTORIAL.GROUPTABLE.USERNAME
     *
     * @param username the value for TUTORIAL.GROUPTABLE.USERNAME
     *
     * @mbggenerated Mon Jan 20 21:48:37 JST 2014
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TUTORIAL.GROUPTABLE.GROUPID
     *
     * @return the value of TUTORIAL.GROUPTABLE.GROUPID
     *
     * @mbggenerated Mon Jan 20 21:48:37 JST 2014
     */
    public String getGroupid() {
        return groupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TUTORIAL.GROUPTABLE.GROUPID
     *
     * @param groupid the value for TUTORIAL.GROUPTABLE.GROUPID
     *
     * @mbggenerated Mon Jan 20 21:48:37 JST 2014
     */
    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TUTORIAL.GROUPTABLE
     *
     * @mbggenerated Mon Jan 20 21:48:37 JST 2014
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Grouptable other = (Grouptable) that;
        return (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TUTORIAL.GROUPTABLE
     *
     * @mbggenerated Mon Jan 20 21:48:37 JST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        return result;
    }
}