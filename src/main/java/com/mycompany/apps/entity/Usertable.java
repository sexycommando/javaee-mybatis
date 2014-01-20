package com.mycompany.apps.entity;

public class Usertable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TUTORIAL.USERTABLE.USERNAME
     *
     * @mbggenerated Mon Jan 20 21:48:37 JST 2014
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TUTORIAL.USERTABLE.MAILADDRESS
     *
     * @mbggenerated Mon Jan 20 21:48:37 JST 2014
     */
    private String mailaddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TUTORIAL.USERTABLE.PASSWORD
     *
     * @mbggenerated Mon Jan 20 21:48:37 JST 2014
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TUTORIAL.USERTABLE.USERNAME
     *
     * @return the value of TUTORIAL.USERTABLE.USERNAME
     *
     * @mbggenerated Mon Jan 20 21:48:37 JST 2014
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TUTORIAL.USERTABLE.USERNAME
     *
     * @param username the value for TUTORIAL.USERTABLE.USERNAME
     *
     * @mbggenerated Mon Jan 20 21:48:37 JST 2014
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TUTORIAL.USERTABLE.MAILADDRESS
     *
     * @return the value of TUTORIAL.USERTABLE.MAILADDRESS
     *
     * @mbggenerated Mon Jan 20 21:48:37 JST 2014
     */
    public String getMailaddress() {
        return mailaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TUTORIAL.USERTABLE.MAILADDRESS
     *
     * @param mailaddress the value for TUTORIAL.USERTABLE.MAILADDRESS
     *
     * @mbggenerated Mon Jan 20 21:48:37 JST 2014
     */
    public void setMailaddress(String mailaddress) {
        this.mailaddress = mailaddress == null ? null : mailaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TUTORIAL.USERTABLE.PASSWORD
     *
     * @return the value of TUTORIAL.USERTABLE.PASSWORD
     *
     * @mbggenerated Mon Jan 20 21:48:37 JST 2014
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TUTORIAL.USERTABLE.PASSWORD
     *
     * @param password the value for TUTORIAL.USERTABLE.PASSWORD
     *
     * @mbggenerated Mon Jan 20 21:48:37 JST 2014
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TUTORIAL.USERTABLE
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
        Usertable other = (Usertable) that;
        return (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getMailaddress() == null ? other.getMailaddress() == null : this.getMailaddress().equals(other.getMailaddress()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TUTORIAL.USERTABLE
     *
     * @mbggenerated Mon Jan 20 21:48:37 JST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getMailaddress() == null) ? 0 : getMailaddress().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return result;
    }
}