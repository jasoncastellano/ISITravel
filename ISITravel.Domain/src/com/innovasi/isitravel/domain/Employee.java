package com.innovasi.isitravel.domain;

/**
 * Created with IntelliJ IDEA.
 * User: castellanoj
 * Date: 11/2/12
 * Time: 3:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class Employee
{
    private int mEmployeeId;
    private String mFirstName;
    private String mLastName;
    private String mDomainUsername;
    private String mPreferredName;

    public int getEmployeeId()
    {
        return mEmployeeId;
    }

    public void setEmployeeId(int employeeId)
    {
        mEmployeeId = employeeId;
    }

    public String getFirstName()
    {
        return mFirstName;
    }

    public void setFirstName(String firstName)
    {
        mFirstName = firstName;
    }

    public String getLastName()
    {
        return mLastName;
    }

    public void setLastName(String lastName)
    {
        mLastName = lastName;
    }

    public String getDomainUsername()
    {
        return mDomainUsername;
    }

    public void setDomainUsername(String domainUsername)
    {
        mDomainUsername = domainUsername;
    }

    public String getPreferredName()
    {
        return mPreferredName;
    }

    public void setPreferredName(String preferredName)
    {
        mPreferredName = preferredName;
    }
}
