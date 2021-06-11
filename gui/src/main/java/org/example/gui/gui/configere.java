package org.example.gui.gui;

import org.example.core.lookup.Lookup;
import org.example.stateInterface.stateInterface;

import javax.swing.*;

public class configere {
    JButton right=new JButton("right");
    JButton left=new JButton("left");
    JButton down=new JButton("down");

    JButton up=new JButton("up");


    public configere(){

        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
       // JButton button = new JButton("Press");
       // frame.getContentPane().add(left); // Adds Button to content pane of frame
        frame.getContentPane().add(right); // Adds Button to content pane of frame
        right.setLocation(0,0);
        right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightActionPerformed(evt);
            }
        });

        frame.getContentPane().add(left); // Adds Button to content pane of frame
        left.setLocation(50,50);
        left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftActionPerformed(evt);
            }
        });
        frame.getContentPane().add(down); // Adds Button to content pane of frame
        down.setLocation(100,100);
        down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downActionPerformed(evt);
            }
        });
        frame.getContentPane().add(up); // Adds Button to content pane of frame
        up.setLocation(150,150);
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(52, Short.MAX_VALUE)
                                .addComponent(right, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(down, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(left, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(up, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(right, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(left, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(down, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(126, Short.MAX_VALUE))
        );
        frame.pack();
        frame.setVisible(true);

    }

    private void downActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downActionPerformed

        Lookup.getInstance().getService(stateInterface.class).goDown();

    }
    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downActionPerformed

        Lookup.getInstance().getService(stateInterface.class).goUp();

    }
    private void leftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downActionPerformed

        Lookup.getInstance().getService(stateInterface.class).goLeft();

    }
    private void rightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downActionPerformed

        Lookup.getInstance().getService(stateInterface.class).goRight();

    }


}
