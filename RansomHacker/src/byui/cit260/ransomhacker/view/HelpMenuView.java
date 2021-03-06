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
public class HelpMenuView extends View {
    
    
    
    public HelpMenuView() {
                super("\n"
                    + "\n----------------------------"
                    + "\n| Help Menu                |"
                    + "\n----------------------------"
                    + "\n1 - Object of the Game"
                    + "\n2 - Stat Description"
                    + "\n3 - Relocating"
                    + "\n4 - Jobs"
                    + "\n5 - Developing Skills"
                    + "\n6 - Attacking"
                    + "\nQ - Quit"
                    + "\n----------------------------"
                    + "\nPlease select an option");
        
    }
    

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "1":
                this.openObjectOfTheGame();
                break;
            case "2":
                this.openStatDescription();
                break;
            case "3":
                this.openRelocating();
                break;
            case "4":
                this.openJobs();
                break;
            case "5":
                this.openDevelopingSkills();
                break;
            case "6":
                this.openAttacking();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\nInvalid Selection");
                break;
   
        }
        
        return false;
    }

    private void openObjectOfTheGame() {
        this.console.println("\nThe Objective of the game is to pay the the ransom for your cat before the time limit runs out and avoiding becing caught by the FBI"); 
    }

    private void openStatDescription() {
        this.console.println("\nThere are 5 Different Stats your character has, as you increase them, your character improves in various ways:"
                + "\n Increasing Hacking - Unlocks higher level software-based attacks"
                + "\n Increasing Social Engineering - Allows you to carry out higher level Social Engineering attacks"
                + "\n Increasing Stealth - Lowers the amount of detection generated by your attacks"
                + "\n Increasing Precision - Gives your attacks a highher chance of success"
                + "\n Increasing Speed - Lowers the amount of days it takes to carry out an attack");
        
    }

    private void openRelocating() {
        this.console.println("\nRelocating your Base of Operations is one way to avoid being caught."
                + "\nOnce your detection reaches 100%, you are caught and lose the game"
                + "\nThe farther away from your current location you move, the more it will decrease your detection"
                + "\nRelocating costs money depending on how far you move and increases each time you move");
        
    }

    private void openJobs() {
        this.console.println("\nIn each city there are different jobs you can complete"
                + "\nFor each successfully completed job, you will earn money"
                + "\nDepending on your attack, time will be subtracted from your Days left and detection added");
        
    }

    private void openDevelopingSkills() {
        this.console.println("\nIn each city there are differnt options you can choose to increase your character's stat levels"
                + "\nEach option has a monetary cost as well as a time cost, but will permanently increase your stats");
        
    }

    private void openAttacking() {
        this.console.println("\nFor each job, there are multiple different attacks you can use to complete them"
                + "\nEach attack has different requirements of items and skill levels as well as different costs/chances for success"
                + "\nChoose the attack that best meets your character's specialty");
    }
}
