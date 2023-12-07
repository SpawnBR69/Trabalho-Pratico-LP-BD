/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visual;

import modelo.Funcionario;

/**
 *
 * @author filip
 */
public class MenuPrincipal extends javax.swing.JFrame {

    Funcionario funcionarioLogado;
    
    public MenuPrincipal(Funcionario funcionarioLogado) {
        this();
        this.funcionarioLogado = funcionarioLogado;
        bloquearPaineis();
    }
    
    public MenuPrincipal() {
        initComponents();
    }
    
    private void bloquearPaineis() {
        if(funcionarioLogado.getTipoUsuario() == 'A') {
            paineis.add("Consultar", painelConsulta);
            paineis.add("Cadastar", painelCadastro);           
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelConsulta = new javax.swing.JPanel();
        labelConsultarProdutos = new javax.swing.JLabel();
        botaoConsultarProdutos = new javax.swing.JButton();
        labelConsultarFuncionarios = new javax.swing.JLabel();
        botaoConsultarFuncionarios = new javax.swing.JButton();
        labelConsultarCompras = new javax.swing.JLabel();
        botaoConsultarCompras = new javax.swing.JButton();
        botaoConsultarFornecedores = new javax.swing.JButton();
        labelConsultarFornecedores = new javax.swing.JLabel();
        painelCadastro = new javax.swing.JPanel();
        labelProduto = new javax.swing.JLabel();
        botaoCadastrarProduto = new javax.swing.JButton();
        labelCompra = new javax.swing.JLabel();
        botaoCadastrarCompra = new javax.swing.JButton();
        labelFuncionario = new javax.swing.JLabel();
        botaoCadastrarFuncionario = new javax.swing.JButton();
        labelFornecedor = new javax.swing.JLabel();
        botaoCadastrarFornecedor = new javax.swing.JButton();
        labelUnidade = new javax.swing.JLabel();
        botaoCadastrarUnidade = new javax.swing.JButton();
        paineis = new javax.swing.JTabbedPane();
        painelVenda = new javax.swing.JPanel();
        labelRealizarVenda = new javax.swing.JLabel();
        botaoRealizarVenda = new javax.swing.JButton();
        labelCadastroCliente = new javax.swing.JLabel();
        botaoCadastrarCliente = new javax.swing.JButton();

        labelConsultarProdutos.setText("Produto");

        botaoConsultarProdutos.setText("Consultar Produtos");
        botaoConsultarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarProdutosActionPerformed(evt);
            }
        });

        labelConsultarFuncionarios.setText("Funcionario");

        botaoConsultarFuncionarios.setText("Consultar Funcionarios");
        botaoConsultarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarFuncionariosActionPerformed(evt);
            }
        });

        labelConsultarCompras.setText("Compra");

        botaoConsultarCompras.setText("Consultar Compras");
        botaoConsultarCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarComprasActionPerformed(evt);
            }
        });

        botaoConsultarFornecedores.setText("Consultar Fornecedores");
        botaoConsultarFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarFornecedoresActionPerformed(evt);
            }
        });

        labelConsultarFornecedores.setText("Fornecedor");

        javax.swing.GroupLayout painelConsultaLayout = new javax.swing.GroupLayout(painelConsulta);
        painelConsulta.setLayout(painelConsultaLayout);
        painelConsultaLayout.setHorizontalGroup(
            painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelConsultarProdutos)
                    .addComponent(botaoConsultarProdutos)
                    .addGroup(painelConsultaLayout.createSequentialGroup()
                        .addGroup(painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoConsultarFuncionarios)
                            .addComponent(labelConsultarFuncionarios)
                            .addComponent(botaoConsultarCompras)
                            .addComponent(labelConsultarCompras))
                        .addGap(18, 18, 18)
                        .addGroup(painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelConsultarFornecedores)
                            .addComponent(botaoConsultarFornecedores))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        painelConsultaLayout.setVerticalGroup(
            painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelConsultarProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoConsultarProdutos)
                .addGap(18, 18, 18)
                .addComponent(labelConsultarFuncionarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoConsultarFuncionarios)
                .addGap(18, 18, 18)
                .addGroup(painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelConsultarCompras)
                    .addComponent(labelConsultarFornecedores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConsultarCompras)
                    .addComponent(botaoConsultarFornecedores))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        labelProduto.setText("Produto");

        botaoCadastrarProduto.setText("Cadastrar Produto");
        botaoCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarProdutoActionPerformed(evt);
            }
        });

        labelCompra.setText("Compra");

        botaoCadastrarCompra.setText("Cadastrar Compra");
        botaoCadastrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarCompraActionPerformed(evt);
            }
        });

        labelFuncionario.setText("Funcionario");

        botaoCadastrarFuncionario.setText("Cadastrar Funcionario");
        botaoCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarFuncionarioActionPerformed(evt);
            }
        });

        labelFornecedor.setText("Fornecedor");

        botaoCadastrarFornecedor.setText("Cadastar Fornecedor");
        botaoCadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarFornecedorActionPerformed(evt);
            }
        });

        labelUnidade.setText("Unidade");

        botaoCadastrarUnidade.setText("Cadastrar Unidade");
        botaoCadastrarUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarUnidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCadastroLayout = new javax.swing.GroupLayout(painelCadastro);
        painelCadastro.setLayout(painelCadastroLayout);
        painelCadastroLayout.setHorizontalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCadastrarFuncionario)
                    .addComponent(labelFuncionario)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoCadastrarProduto)
                            .addComponent(labelProduto))
                        .addGap(40, 40, 40)
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUnidade)
                            .addComponent(botaoCadastrarUnidade)
                            .addComponent(labelFornecedor)
                            .addComponent(botaoCadastrarFornecedor)))
                    .addComponent(labelCompra)
                    .addComponent(botaoCadastrarCompra))
                .addGap(45, 110, Short.MAX_VALUE))
        );
        painelCadastroLayout.setVerticalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProduto)
                    .addComponent(labelUnidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrarProduto)
                    .addComponent(botaoCadastrarUnidade))
                .addGap(18, 18, 18)
                .addComponent(labelFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoCadastrarFuncionario)
                .addGap(18, 18, 18)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCompra)
                    .addComponent(labelFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrarCompra)
                    .addComponent(botaoCadastrarFornecedor))
                .addGap(143, 143, 143))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelRealizarVenda.setText("Venda");

        botaoRealizarVenda.setText("Realizar Nova Venda");
        botaoRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRealizarVendaActionPerformed(evt);
            }
        });

        labelCadastroCliente.setText("Cadastro Cliente");

        botaoCadastrarCliente.setText("Cadastrar Novo Cliente");
        botaoCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelVendaLayout = new javax.swing.GroupLayout(painelVenda);
        painelVenda.setLayout(painelVendaLayout);
        painelVendaLayout.setHorizontalGroup(
            painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRealizarVenda)
                    .addComponent(botaoRealizarVenda)
                    .addComponent(labelCadastroCliente)
                    .addComponent(botaoCadastrarCliente))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        painelVendaLayout.setVerticalGroup(
            painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRealizarVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoRealizarVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCadastroCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoCadastrarCliente)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        paineis.addTab("Venda", painelVenda);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paineis)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paineis)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRealizarVendaActionPerformed
        new CadastroVenda().setVisible(true);
    }//GEN-LAST:event_botaoRealizarVendaActionPerformed

    private void botaoCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarClienteActionPerformed
        new CadastroCliente().setVisible(true);
    }//GEN-LAST:event_botaoCadastrarClienteActionPerformed

    private void botaoConsultarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarProdutosActionPerformed
       new ConsultaProduto().setVisible(true);
    }//GEN-LAST:event_botaoConsultarProdutosActionPerformed

    private void botaoConsultarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarFuncionariosActionPerformed
        new ConsultaFuncionario().setVisible(true);
    }//GEN-LAST:event_botaoConsultarFuncionariosActionPerformed

    private void botaoConsultarComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarComprasActionPerformed
        new ConsultarCompra().setVisible(true);
    }//GEN-LAST:event_botaoConsultarComprasActionPerformed

    private void botaoConsultarFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarFornecedoresActionPerformed
        new ConsultaFornecedor().setVisible(true);
    }//GEN-LAST:event_botaoConsultarFornecedoresActionPerformed

    private void botaoCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarProdutoActionPerformed
        new CadastroProduto().setVisible(true);
    }//GEN-LAST:event_botaoCadastrarProdutoActionPerformed

    private void botaoCadastrarUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarUnidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCadastrarUnidadeActionPerformed

    private void botaoCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarFuncionarioActionPerformed
        new CadastroFuncionario().setVisible(true);
    }//GEN-LAST:event_botaoCadastrarFuncionarioActionPerformed

    private void botaoCadastrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarCompraActionPerformed
        new CadastroCompra().setVisible(true);
    }//GEN-LAST:event_botaoCadastrarCompraActionPerformed

    private void botaoCadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarFornecedorActionPerformed
        new CadastroFornecedor().setVisible(true);
    }//GEN-LAST:event_botaoCadastrarFornecedorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrarCliente;
    private javax.swing.JButton botaoCadastrarCompra;
    private javax.swing.JButton botaoCadastrarFornecedor;
    private javax.swing.JButton botaoCadastrarFuncionario;
    private javax.swing.JButton botaoCadastrarProduto;
    private javax.swing.JButton botaoCadastrarUnidade;
    private javax.swing.JButton botaoConsultarCompras;
    private javax.swing.JButton botaoConsultarFornecedores;
    private javax.swing.JButton botaoConsultarFuncionarios;
    private javax.swing.JButton botaoConsultarProdutos;
    private javax.swing.JButton botaoRealizarVenda;
    private javax.swing.JLabel labelCadastroCliente;
    private javax.swing.JLabel labelCompra;
    private javax.swing.JLabel labelConsultarCompras;
    private javax.swing.JLabel labelConsultarFornecedores;
    private javax.swing.JLabel labelConsultarFuncionarios;
    private javax.swing.JLabel labelConsultarProdutos;
    private javax.swing.JLabel labelFornecedor;
    private javax.swing.JLabel labelFuncionario;
    private javax.swing.JLabel labelProduto;
    private javax.swing.JLabel labelRealizarVenda;
    private javax.swing.JLabel labelUnidade;
    private javax.swing.JTabbedPane paineis;
    private javax.swing.JPanel painelCadastro;
    private javax.swing.JPanel painelConsulta;
    private javax.swing.JPanel painelVenda;
    // End of variables declaration//GEN-END:variables
}
