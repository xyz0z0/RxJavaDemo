package xyz.xyz0z0.model;

/**
 * Created by cheng on 2018/1/2.
 */

public class ApiUser {

    public long id;
    public String firstname;
    public String lastname;

    @Override
    public String toString() {
        return "ApiUser{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
