package TableModel;

/**
 * user : W.P.A.M.Nonis <ameshnonis8@gmail.com>
 * date : 11/16/2022
 * time : 2:55 PM
 **/
public class TestTableModel {
    private String Id;
    private String Name;
    private String Address;
    private String Contact;

    public TestTableModel(String id, String name, String address, String contact) {
        Id = id;
        Name = name;
        Address = address;
        Contact = contact;
    }

    public TestTableModel() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }
}
