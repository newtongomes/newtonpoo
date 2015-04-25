package principal;

import javax.swing.JFrame;
import visao.LabelFrame;

/**
 *
 * @author Roberto
 */
public class LabelTest {
    
    public static void main(String args[]){
    
        LabelFrame labelFrame = new LabelFrame();
        labelFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        labelFrame.setSize(260, 180);
        labelFrame.setVisible( true );
    }
    
}
