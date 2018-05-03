package example.com.databindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * @author Richard_Y_Wang
 * @version $Rev$
 * @des 2018/5/3
 * @updateAuthor $Author$
 * @updateDes ${TODO}
 */
public class User extends BaseObservable {
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Bindable
    public String getFirstName() {
        return this.firstName;
    }
    @Bindable
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }
}

