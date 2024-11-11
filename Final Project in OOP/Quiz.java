import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Quiz implements ActionListener{ // Method Overriding, using fucntion "implements"
    Questions questionsData = new Questions();
    String[] questions = questionsData.getQuestions();
    String[][] options = questionsData.getOptions();
    char[] answers = questionsData.getAnswers();

    char guess;
    char answer;
    int index;
    int correct_guesses = 0;
    int total_questions = questions.length; // counters number of question 
    int result;
    int seconds = 15;

    JFrame frame = new JFrame();
    JTextField textfield = new JTextField();
    JTextArea textarea = new JTextArea();
    JButton buttonA = new JButton();
    JButton buttonB = new JButton();
    JButton buttonC = new JButton();
    JLabel answer_labelA = new JLabel();
    JLabel answer_labelB = new JLabel();
    JLabel answer_labelC = new JLabel();
    JLabel time_label = new JLabel();
    JLabel seconds_left = new JLabel();
    JTextField number_right = new JTextField();
    JTextField percentage = new JTextField();

    Timer timer = new Timer(1000, new ActionListener() { // allows the timer to have custom behavior one it reaches zero. (polymorphism)
        public void actionPerformed(ActionEvent e)
        {
            seconds--;
            seconds_left.setText(String.valueOf(seconds));
            if(seconds<=0) 
            {
                displayAnswer();     
            }
        }
    });


    public Quiz()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.getContentPane().setBackground(new Color(21, 41, 46));
        frame.setLayout(null);
        frame.setResizable(false);

        textfield.setBounds(0,0,800,50); // top
        textfield.setBackground(new Color(7, 64, 71));
        textfield.setForeground(new Color(225,225,225));
        textfield.setFont(new Font("Serif",Font.BOLD,30));
        textfield.setBorder(BorderFactory.createBevelBorder(0));
        textfield.setHorizontalAlignment(JTextField.CENTER);
        textfield.setEditable(false);
       

        textarea.setBounds(0,50,800,50); // adjusted position so that it wouldn't overlap!
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);
        textarea.setBackground(new Color(7, 64, 71));
        textarea.setForeground(new Color(225,225,225));
        textarea.setFont(new Font("Serif",Font.BOLD,20));
        textarea.setBorder(BorderFactory.createBevelBorder(0));
        textarea.setEditable(false);    
        
        buttonA.setBounds(0,100,100,100);
        buttonA.setFont(new Font("Serif", Font.BOLD,35));
        buttonA.setFocusable(false);
        buttonA.addActionListener(this);
        buttonA.setText("A");

        buttonB.setBounds(0,250,100,100);
        buttonB.setFont(new Font("Serif", Font.BOLD,35));
        buttonB.setFocusable(false);
        buttonB.addActionListener(this);
        buttonB.setText("B");

        buttonC.setBounds(0,400,100,100);
        buttonC.setFont(new Font("Serif", Font.BOLD,35));
        buttonC.setFocusable(false);
        buttonC.addActionListener(this);
        buttonC.setText("C");

        answer_labelA.setBounds(125,100,500,100);
        answer_labelA.setForeground(new Color(223, 235, 246));
        answer_labelA.setFont(new Font("Serif",Font.PLAIN, 20));
       

        answer_labelB.setBounds(125,250,500,100);
        answer_labelB.setForeground(new Color(223, 235, 246));
        answer_labelB.setFont(new Font("Serif",Font.PLAIN, 20));
        

        answer_labelC.setBounds(125,400,500,100);
        answer_labelC.setForeground(new Color(223, 235, 246));
        answer_labelC.setFont(new Font("Serif",Font.PLAIN, 20));
        

        seconds_left.setBounds(745,520,40,40);
        seconds_left.setBackground(new Color(7, 64, 71));
        seconds_left.setForeground(new Color(170, 199, 216));
        seconds_left.setFont(new Font("Serif",Font.PLAIN, 20));
        seconds_left.setBorder(BorderFactory.createBevelBorder(1));
        seconds_left.setOpaque(true);
        seconds_left.setHorizontalAlignment(JTextField.CENTER);
        seconds_left.setText(String.valueOf(seconds));

        number_right.setBounds(225,225,200,100); // This one responsible for the results
        number_right.setBackground(new Color(29, 162, 127));
        number_right.setForeground(new Color(170, 199, 216));
        number_right.setFont(new Font("Serif",Font.BOLD, 50));
        number_right.setBorder(BorderFactory.createBevelBorder(1));
        number_right.setHorizontalAlignment(JTextField.CENTER);
        number_right.setEditable(false);
        
        percentage.setBounds(225,325,200,100); // Also responsible for the results (percentange ang ididisplay nito)
        percentage.setBackground(new Color(29, 162, 127));
        percentage.setForeground(new Color(170, 199, 216));
        percentage.setFont(new Font("Serif",Font.BOLD, 50));
        percentage.setBorder(BorderFactory.createBevelBorder(1));
        percentage.setHorizontalAlignment(JTextField.CENTER);
        percentage.setEditable(false);

        frame.add(seconds_left); //visible in gui
        frame.add(answer_labelA);
        frame.add(answer_labelB);
        frame.add(answer_labelC);
        frame.add(buttonA); 
        frame.add(buttonB);
        frame.add(buttonC);
        frame.add(textarea);
        frame.add(textfield);
        frame.setVisible(true);

        nextQuestion(); // moves to the next function, nextQuestion();
    }
    public void nextQuestion() // Move to the next question
    {
        if(index >= total_questions) // total question is 16, index is 0, (initializes earlier)
        {
            results();
        } 
        else
        {
            textfield.setText("Question "+(index+1)); // 
            textarea.setText(questions[index]); // whenever index is increased (it will retrieve the next question)
            answer_labelA.setText(options[index][0]);
            answer_labelB.setText(options[index][1]); // we get options from questions, (choices 'to.)
            answer_labelC.setText(options[index][2]);
            timer.start(); // Timer!
        }
    }

    //Override
    public void actionPerformed(ActionEvent e) // For button clicking
    {
        buttonA.setEnabled(false); // buttons are always false so that user will only click it once, not spamming.
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);

        if(e.getSource()==buttonA) // .getSource() - component if tiggered. (PININDOT!)
        {
            answer = 'A';
            if(answer == answers[index])
            {
                correct_guesses++;
            }
        }

        if(e.getSource()==buttonB)
        {
            answer = 'B';
            if(answer == answers[index])
            {
                correct_guesses++;
            }
        }

        if(e.getSource()==buttonC)
        {
            answer = 'C';
            if(answer == answers[index])
            {
                correct_guesses++;
            }
        }
        displayAnswer(); // regardless if the time runs out, this will execuse
    }
    public void displayAnswer()
    {
        timer.stop();
        
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);

        if(answers[index] != 'A')   // if incorrect it will display red
            answer_labelA.setForeground(new Color(255,0,0)); 
        if(answers[index] != 'B')
            answer_labelB.setForeground(new Color(255,0,0));
        if(answers[index] != 'C')
            answer_labelC.setForeground(new Color(255,0,0));
        
        Timer pause = new Timer(2000, new ActionListener() // it will take 2 seconds before executing new action listener
        {
            //Override ulit
            public void actionPerformed(ActionEvent e) // which is this one, ActionLister() is anonymous (abstraction)
            {
                answer_labelA.setForeground(new Color(223, 235, 246)); // Resets color for the next question
                answer_labelB.setForeground(new Color(223, 235, 246));
                answer_labelC.setForeground(new Color(223, 235, 246));

                answer = ' '; // stores the selected answer during each questions, reset! means there's no carryover from the previous questions.
                seconds = 15;
                seconds_left.setText(String.valueOf(seconds)); // updates the seconds.
                buttonA.setEnabled(true); // making them clickable again
                buttonB.setEnabled(true);
                buttonC.setEnabled(true);
                index++; // increment (next question)
                nextQuestion(); // displays the next question again!
            }
        });
        pause.setRepeats(false); // activate ONLY ONCE
        pause.start();
    }
    public void results()
    {
         buttonA.setEnabled(false);
         buttonB.setEnabled(false);
         buttonC.setEnabled(false);

        result = (int)((correct_guesses/(double)total_questions)*100); // percentage

        textfield.setText("RESULTS!");
        textarea.setText("");
        answer_labelA.setText(""); // CLEARS EVERYTHING ! Room for Display!
        answer_labelB.setText(""); 
        answer_labelC.setText("");

        number_right.setText("("+correct_guesses+"/"+total_questions+")");  // number right
        percentage.setText(result+"%");

        frame.add(percentage); // visible on gui
        frame.add(number_right);

    } 
}
