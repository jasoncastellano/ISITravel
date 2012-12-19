package com.innovasi.isitravel.domain;

public class Airline implements IDomainObject {
    private int mAirlineId;
    private String mName;
    private boolean mEnabled;
    private String mUrlCheckIn;

    public int getAirlineId() {
        return mAirlineId;
    }

    public void setAirlineId(int airlineId) {
        mAirlineId = airlineId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public boolean isEnabled() {
        return mEnabled;
    }

    public void setEnabled(boolean enabled) {
        mEnabled = enabled;
    }

    public String getUrlCheckIn() {
        return mUrlCheckIn;
    }

    public void setUrlCheckIn(String urlCheckIn) {
        mUrlCheckIn = urlCheckIn;
    }
}
