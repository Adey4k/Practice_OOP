/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task6;
import java.util.*;
/**
 *
 * @author Ladik
 */
class MinCommand implements Command {
    private final List<Item2d> data;
    
    public MinCommand(List<Item2d> data) {
        this.data = data;
    }
    
    @Override
    public void execute() {
        int min = data.stream().mapToInt(Item2d::getOneCount).min().orElse(-1);
        System.out.println("Min ones: " + min);
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
