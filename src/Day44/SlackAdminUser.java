package Day44;

import Day44.SlackUser;

public class SlackAdminUser extends SlackUser {

     int adminId ;

    public SlackAdminUser(String name,String status,int adminId){
        this.name = name;
        this.status = status;
        this.adminId = adminId;
    }

    public static void main(String[] args) {

        SlackAdminUser s1 = new SlackAdminUser("Ershad","PR",12345);
        s1.sendAtChannelMessage();
        s1.callSomeOne();
    }

    public String toString() {
        return "SlackAdminUser{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public void sendAtChannelMessage(){
        System.out.println("sending Channel");
    }

    public void deleteMessage(){
        System.out.println("Deleted");
    }

    public void addChannel(){
        System.out.println("Adding Channel");
    }



}
