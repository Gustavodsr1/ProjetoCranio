/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpii02;

import LPII02.Business.Services.MatterBusiness;
import LPII02.Domain.Entities.Matter;
import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import org.hibernate.type.StandardBasicTypes;

/**
 *
 * @author Gustavo
 */
public class JPMatter extends javax.swing.JPanel {

    private MatterBusiness _matterBusiness;
    private int _page = 1;
    private int _qtdPerPage = 10;
    private boolean _loadPassed = false;

    /**
     * Creates new form JPMatter
     */
    public JPMatter() {
        initComponents();
        this._matterBusiness = new MatterBusiness();
        this.grMatters.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                valueRowChanged(e);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        grMatters = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();

        addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                formHierarchyChanged(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnEdit.setText("Editar");
        btnEdit.setName("btnEdit"); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnDelete.setText("Excluir");
        btnDelete.setName("btnDelete"); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jScrollPane1.setName("srPanel"); // NOI18N

        grMatters.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        grMatters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ));
        grMatters.setName("grMatters"); // NOI18N
        jScrollPane1.setViewportView(grMatters);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setText("Código:");
        jLabel1.setName("lblCode"); // NOI18N

        txtCode.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtCode.setEnabled(false);
        txtCode.setName("txtCode"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");
        jLabel2.setName("lblName"); // NOI18N

        txtName.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtName.setName("txtName"); // NOI18N

        btnInsert.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnInsert.setText("Cadastrar");
        btnInsert.setName("btnInsert"); // NOI18N
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnFirst.setText("<<");
        btnFirst.setName("btnFirst"); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnBack.setText("<");
        btnBack.setName("btnBack"); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnNext.setText(">");
        btnNext.setName("btnNext"); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setText(">>");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnNew.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnNew.setText("Novo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtName))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnFirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLast)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInsert)
                .addGap(18, 18, 18)
                .addComponent(btnEdit)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnNew))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirst)
                    .addComponent(btnBack)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtCode.getAccessibleContext().setAccessibleName("txtCode");
    }// </editor-fold>//GEN-END:initComponents

    private void formHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formHierarchyChanged
        if (this._loadPassed) {
            return;
        }

        try {
            this.loadTable();
            this._loadPassed = true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro ao carregar as matérias, tente novamente.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formHierarchyChanged

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        try {
            txtCode.setText(txtCode.getText());
            txtName.setText(txtName.getText());

            if (txtCode.getText().length() == 0) {
                JOptionPane.showMessageDialog(
                        null,
                        "O código deve ser informado.",
                        "Atenção",
                        JOptionPane.WARNING_MESSAGE);

                return;
            }

            Pattern pattern = Pattern.compile("[^0-9]", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(txtCode.getText());

            if (matcher.find()) {
                //show message warning...
                JOptionPane.showMessageDialog(
                        null,
                        "O código deve ser numérico.",
                        "Atenção",
                        JOptionPane.WARNING_MESSAGE);

                return;
            }

            Matter matter = this._matterBusiness.getInstance();

            matter.setCode(Integer.parseInt(txtCode.getText()));
            matter.setName(txtName.getText());
            this._matterBusiness.insert(matter);

            //reload table...
            this.loadTable();

            //reset...
            this.clearControls();
            this.txtCode.setEnabled(false);

            //message success...
            JOptionPane.showMessageDialog(
                    null,
                    "Cadastro efetuado com sucesso!",
                    "Info.",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    null,
                    ex.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if (this._page == 1) {
            return;
        }

        this._page--;

        try {
            this.loadTable();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    null,
                    ex.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        List<Matter> matters = this._matterBusiness.get();
        int maxPage = (int) Math.round(matters.size() / Double.parseDouble(this._qtdPerPage + ""));

        if (this._page >= maxPage) {
            return;
        }

        this._page++;

        try {
            this.loadTable();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    null,
                    ex.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        if (this._page == 1) {
            return;
        }

        this._page = 1;

        try {
            this.loadTable();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    null,
                    ex.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        try {
            List<Matter> matters = this._matterBusiness.get();

            this._page = (int) Math.round(matters.size() / Double.parseDouble(this._qtdPerPage + ""));
            this.loadTable();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    null,
                    ex.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        this.clearControls();
        txtCode.setEnabled(true);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            Matter matter = this._matterBusiness.getInstance();

            matter.setCode(Integer.parseInt(txtCode.getText()));
            matter.setName(txtName.getText());
            this._matterBusiness.update(matter);

            //reload table...
            this.loadTable();

            //reset...
            this.clearControls();
            this.txtCode.setEnabled(false);

            //message success...
            JOptionPane.showMessageDialog(
                    null,
                    "Alteração efetuada com sucesso!",
                    "Info.",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    null,
                    ex.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(
                    this,
                    "Deseja realmente excluir a matéria?",
                    "Confirmação",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == 0) {

                //deleting model...
                Matter model = this._matterBusiness.getByCode(Integer.parseInt(this.txtCode.getText()));

                if (model != null) {
                    this._matterBusiness.delete(model);
                }

                //reset...
                this.clearControls();
                this.txtCode.setEnabled(false);

                //load table...
                this.loadTable();

                //message success...
                JOptionPane.showMessageDialog(
                        null,
                        "Exclusão efetuada com sucesso!",
                        "Info.",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    null,
                    ex.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void clearControls() {
        txtCode.setText("");
        txtName.setText("");
    }

    private void loadTable() {
        List<Matter> matters = this._matterBusiness.get();

        if (matters.size() > this._qtdPerPage) {
            matters = matters.subList((this._page - 1) * this._qtdPerPage, this._qtdPerPage);
        }

        if (matters != null) {
            DefaultTableModel dtm = (DefaultTableModel) this.grMatters.getModel();

            while (dtm.getRowCount() > 0) {
                dtm.removeRow(0);
            }

            for (Matter m : matters) {
                dtm.addRow(new Object[]{
                    m.getCode(), m.getName()
                });
            }
        }
    }

    private void valueRowChanged(ListSelectionEvent e) {
        if (this.grMatters.getSelectedRows() == null
                || this.grMatters.getSelectedRows().length == 0) {
            return;
        }

        int selectedRow = this.grMatters.getSelectedRows()[0];

        this.txtCode.setText(this.grMatters.getValueAt(selectedRow, 0).toString());
        this.txtName.setText(this.grMatters.getValueAt(selectedRow, 1).toString());

        this.txtCode.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JTable grMatters;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
