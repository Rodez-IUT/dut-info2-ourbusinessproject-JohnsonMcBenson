package ourbusinessproject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Enterprise {

    @NotEmpty
    @Column
    private String name;

    @NotEmpty
    @Size(min = 10, max = 99999)
    @Column
    private String description;

    @Column
    @NotEmpty
    private  String contactName;

    @NotEmpty
    @Column
    @Email
    private String contactEmail;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
}
