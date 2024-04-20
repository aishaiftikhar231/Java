/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab19.pkg6;

/**
 *
 * @author hp
 */
public class Lab196 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SmartTVRemote remote = new SmartTVRemoteImpl();

        remote.powerOn();
        remote.volumeUp();
        remote.openSmartHub();
        remote.browseInternet();
        remote.playContent();
        remote.powerOff();
    }
    }
    
}
interface TVRemote {
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
    void channelUp();
    void channelDown();
}

interface SmartTVRemote extends TVRemote {
    void openSmartHub();
    void browseInternet();
    void playContent();
}
