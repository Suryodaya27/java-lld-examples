package library_management_system;

public class Member extends User{
    private String memberID;
    public Member(String name, String email, String designation) {
        super(name, email, designation);
        this.memberID = "M" + (int)(Math.random()*1000);    }

    public String getMemberID() {
        return memberID;
    }
    
    @Override
    public String getId() {
        return memberID;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberID='" + memberID + '\'' +
                "} " + super.toString();
    }
    
}
