package labs.nyko.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID mID;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private boolean mRequiresPolice;


    public Crime() {
        mID = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getID() {        return mID;    }

    public boolean isSolved() {        return mSolved;    }
    public void setSolved(boolean solved) {        mSolved = solved;    }

    public Date getDate() {        return mDate;    }
    public void setDate(Date date) {        mDate = date;    }

    public String getTitle() {        return mTitle;    }
    public void setTitle(String title) {        mTitle = title;    }

    public boolean isRequiresPolice() {   return mRequiresPolice;    }
    public void setRequiresPolice(boolean requiresPolice) {   mRequiresPolice = requiresPolice;   }


}
