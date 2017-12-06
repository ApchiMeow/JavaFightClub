package Game;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GameProcess {
    public static void main(String[] args){
        Display display = new Display();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(display);
        application.setSize(640,480);
        application.setVisible(true);
        JOptionPane.showMessageDialog(null, "A Gavrisciuc Vladislav Game");
        String name = JOptionPane.showInputDialog("Задайте имя персонажу");
        String hp = JOptionPane.showInputDialog("Задайте хп песронажу");
        String dialog = JOptionPane.showInputDialog("Задайте диалог песронажу");
        //String message = String.format("Персонаж создан: %s", name);
        Npc npc = new Npc(name, Double.parseDouble(hp), dialog);
        Npc elder = new Npc("Старейшина",100,"Я жил тут ещё до того как это стало мейнстримом");
        System.out.println(elder);
        JOptionPane.showMessageDialog(null, npc.toString());
    }
}