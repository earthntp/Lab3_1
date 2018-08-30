import javax.swing.*;

public class Lab3_1 {
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null,"message","title",JOptionPane.INFORMATION_MESSAGE);
//        String input = JOptionPane.showInputDialog("Input number","0");
          int ans = JOptionPane.showConfirmDialog(null,"รักหรือเปล่า","ถามเธอ",JOptionPane.YES_NO_OPTION);
          if (ans==JOptionPane.YES_OPTION){
              JOptionPane.showMessageDialog(null,"ดีมาก");
          }
          else {
              JOptionPane.showMessageDialog(null,"จัมวรั้ยเลย");
          }
    }
}
