package designPatterns.command;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class mainApp extends JFrame implements ActionListener
//, MouseMotionListener, WindowListener
{
  // 描画履歴
  private MacroCommand history = new MacroCommand();
  // 描画領域
  private DrawCanvas canvas = new DrawCanvas(400, 400, history);
  private JButton clearButton = new JButton("clear");
  private JButton changeButton = new JButton("changeColor");
  private JButton undoButton = new JButton("undo");

  @SuppressWarnings("deprecation")
  public mainApp(String title) {
    super(title);

    this.addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });

    canvas.addMouseMotionListener(new MouseMotionAdapter() {
      @Override
      public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
      }
    });

    clearButton.addActionListener(this);
    changeButton.addActionListener(this);
    undoButton.addActionListener(this);

    Box buttonBox = new Box(BoxLayout.X_AXIS);
    buttonBox.add(clearButton);
    buttonBox.add(changeButton);
    buttonBox.add(undoButton);
    Box mainBox = new Box(BoxLayout.Y_AXIS);
    mainBox.add(buttonBox);
    mainBox.add(canvas);
    getContentPane().add(mainBox);

    pack();
    show();

  }

//  @Override
//  public void windowOpened(WindowEvent e) {
//  }

//  @Override
//  public void windowClosing(WindowEvent e) {
//    System.exit(0);
//  }

//  @Override
//  public void windowClosed(WindowEvent e) {
//  }

//  @Override
//  public void windowIconified(WindowEvent e) {
//  }

//  @Override
//  public void windowDeiconified(WindowEvent e) {
//    // TODO 自動生成されたメソッド・スタブ
//  }

//  @Override
//  public void windowActivated(WindowEvent e) {
//  }

//  @Override
//  public void windowDeactivated(WindowEvent e) {
//    // TODO 自動生成されたメソッド・スタブ
//  }

//  @Override
//  public void mouseDragged(MouseEvent e) {
//    Command cmd = new DrawCommand(canvas, e.getPoint());
//    history.append(cmd);
//    cmd.execute();
//  }

//  @Override
//  public void mouseMoved(MouseEvent e) {
//    // 何もなし
//  }

  @Override
  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == clearButton) {
      history.clear();
      canvas.repaint();
    }
    if (e.getSource() == changeButton) {
      canvas.changeColor();
    }
    if (e.getSource() == undoButton) {
      System.out.println("undo!");
      history.undo();
      canvas.repaint();
    }

  }

}
