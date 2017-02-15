/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.control;

/**
 *
 * @author Hansen
 */
public class AttackControl {
    
    public int calcChanceOfSuccess(int charCurrentSkillLevel, int skillLevelRequired, int OriginalChanceOfSuccess) {
    
    

if (charCurrentSkillLevel <= skillLevelRequired) { //The character current skill level is less than or equal to the skill level required?
	return -1;
    }            
if (skillLevelRequired <= 0) {  
	return -1;
    }
if (OriginalChanceOfSuccess <= 0) {  
	return -1;
    }
int newChanceOfSuccess  = (int)((charCurrentSkillLevel - skillLevelRequired)*5) + OriginalChanceOfSuccess;
return newChanceOfSuccess;
    }
    
}
