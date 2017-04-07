/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

/**
 *
 * @author Hansen
 */
public class StoreView extends View {

    public StoreView() {
        super("\n"
                    + "\n----------------------------"
                    + "\n|          Store            |"
                    + "\n----------------------------"
                    + "\n1 - VPN Services ($1000) - Adds +1 to your stealth skill"
                    + "\n2 - Email Server ($2000) - Allows you to perform social engineering attacks"
                    + "\n3 - Supercomputer ($5000) - Allows you to carry out brute force attacks"
                    + "\n4 - Botnet zombies ($10,000) - Allows you to perform DDoS attacks"
                    + "\n5 - Hacking Tools ($500) - Software used to carry out attacks, +2 to hacking skill"
                    + "\nQ - Quit"
                    + "\n----------------------------"
                    + "\nPlease select an equipment or service to buy");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "1":
                this.openVPNServices();
                break;
            case "2":
                this.openEmailServer();
                break;
            case "3":
                this.openSupercomputer();
                break;
            case "4":
                this.openBotnetzombies();
                break;
            case "5":
                this.openHackingTools();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\nInvalid Selection");
                break;
   
        }
        
        return false;
    }

    private void openVPNServices() {
        System.out.println("\n*** openVPNServices Function Called ***"); 
    }

    private void openEmailServer() {
        System.out.println("\n*** openEmailServer Function Called ***");
    }

    private void openSupercomputer() {
        System.out.println("\n*** openRelocating Function Called ***"); 
        
    }

    private void openBotnetzombies() {
        System.out.println("\n*** openJobs Function Called ***");
    }

    private void openHackingTools() {
        System.out.println("\n*** openHackingTools Function Called ***");
        
    }

    
}