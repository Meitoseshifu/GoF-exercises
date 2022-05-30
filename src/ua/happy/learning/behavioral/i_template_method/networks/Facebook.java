package ua.happy.learning.behavioral.i_template_method.networks;

public class Facebook extends Network {

    public Facebook(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public boolean logIn(String userName, String password) {
        return false;
    }

    @Override
    public boolean sendData(byte[] data) {
        return false;
    }

    @Override
    public void logOut() {
    }

    private void simulateNetworkLatency() {

    }

}
