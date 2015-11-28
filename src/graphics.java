/**
 * Created by Claude on 11/20/2015.
 */

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JPanel;
import java.lang.*;

public class graphics
{
     public void graphicsInterface()
     {
         JFrame frame = new JFrame("Physics Genius");
         frame.setSize(700, 300);
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         JButton Speed = new JButton("Speed");  // create the button
         JPanel panel1 = new JPanel();  // create the panel
         panel1.add(Speed);  // add the button to the panel
         frame.add(panel1, BorderLayout.CENTER);

         Speed.addActionListener(new ActionListener()
         {
             public void actionPerformed (ActionEvent Speed)
             {
                 Scanner scanner = new Scanner( System.in );
                 System.out.println("Enter distance: ");
                 int distance = scanner.nextInt();

                 Scanner scanner1 = new Scanner( System.in );
                 System.out.println("Enter speed: ");
                 int time = scanner.nextInt();

                 System.out.println("Speed is " + distance * time );
             }
         });


         JButton Velocity = new JButton("Velocity");  // create the button
         JPanel panel = new JPanel();  // create the panel
         panel1.add(Velocity);  // add the button to the panel
         frame.add(panel1, BorderLayout.CENTER);

         Velocity.addActionListener(new ActionListener()
         {
             public void actionPerformed (ActionEvent Velocity)
             {
                 Scanner scanner = new Scanner( System.in );
                 System.out.println("Enter distance: ");
                 int distance = scanner.nextInt();

                 Scanner scanner1 = new Scanner( System.in );
                 System.out.println("Enter speed: ");
                 int time = scanner.nextInt();

                 System.out.println("Velocity is " + distance * time );
             }
         });


         JButton Acceleration = new JButton("Acceleration");  // create the button
         JPanel panel2 = new JPanel();  // create the panel
         panel1.add(Acceleration);  // add the button to the panel
         frame.add(panel1, BorderLayout.CENTER);

         Acceleration.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent Acceleration)
             {
                 Scanner scanner = new Scanner( System.in );
                 System.out.println("Enter velocity: ");
                 int velocity = scanner.nextInt();

                 Scanner scanner1 = new Scanner( System.in );
                 System.out.println("Enter time: ");
                 int time = scanner.nextInt();

                 System.out.println("Acceleration is " + velocity / time);
             }
         });

         JButton Force = new JButton("Force");  // create the button
         JPanel panel3 = new JPanel();
         panel.add(Force);  // add the button to the panel
         frame.add(panel, BorderLayout.NORTH);

         Force.addActionListener(new ActionListener()
         {
             public void actionPerformed (ActionEvent Force)
             {
                 Scanner scanner = new Scanner( System.in );
                 System.out.println("Enter mass: ");
                 int mass = scanner.nextInt();

                 Scanner scanner1 = new Scanner( System.in );
                 System.out.println("Enter acceleration: ");
                 int acceleration = scanner.nextInt();

                 System.out.println("Force is " + mass * acceleration);
             }
         });

         JButton KineticEnergy = new JButton("Kinetic Energy");  // create the button
         JPanel panel4 = new JPanel();
         panel.add(KineticEnergy);  // add the button to the panel
         frame.add(panel, BorderLayout.NORTH);

         KineticEnergy.addActionListener(new ActionListener()
         {
             public void actionPerformed (ActionEvent Force)
             {
                 Scanner scanner = new Scanner( System.in );
                 System.out.println("Enter mass of object: ");
                 int objectMass = scanner.nextInt();

                 Scanner scanner1 = new Scanner( System.in );
                 System.out.println("Enter speed of object: ");
                 int objectSpeed = scanner.nextInt();

                 System.out.println("Kinetic energy is " + 0.5 * objectMass * objectSpeed + Math.getExponent(2));
             }
         });

         JButton Power = new JButton("Power");  // create the button
         JPanel panel5 = new JPanel();
         panel.add(Power);  // add the button to the panel
         frame.add(panel, BorderLayout.NORTH);

         Power.addActionListener(new ActionListener()
         {
             public void actionPerformed (ActionEvent Force)
             {
                 Scanner scanner = new Scanner( System.in );
                 System.out.println("Enter work: ");
                 int work = scanner.nextInt();

                 Scanner scanner1 = new Scanner( System.in );
                 System.out.println("Enter time: ");
                 int time = scanner.nextInt();

                 System.out.println("Power is " + work / time);
             }
         });

     }
}
