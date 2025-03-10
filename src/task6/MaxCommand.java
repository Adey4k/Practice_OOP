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
class MaxCommand implements Command {
    private final List<Item2d> data;
    
    public MaxCommand(List<Item2d> data) {
        this.data = data;
    }
    
    @Override
    public void execute() {
        int max = data.stream().mapToInt(Item2d::getOneCount).max().orElse(-1);
        System.out.println("Max ones: " + max);
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}