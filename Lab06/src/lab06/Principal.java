
package lab06;

import java.math.MathContext;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author angel
 */
public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_mundoDisco = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        bt_eliminar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tf_nombreTortuga = new javax.swing.JTextField();
        tf_pesoT = new javax.swing.JTextField();
        bt_addMundo = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_Tortugas = new javax.swing.JList<>();
        jd_criaturas = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        bt_addCriatura = new javax.swing.JButton();
        bt_eliminarCriaturas = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        tf_nombreRaza = new javax.swing.JTextField();
        tf_energia = new javax.swing.JTextField();
        tf_anios = new javax.swing.JTextField();
        tf_nombreRegion = new javax.swing.JTextField();
        tf_cantidadEsp = new javax.swing.JTextField();
        tf_pesoCriatura = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jl_criaturasAdd = new javax.swing.JList<>();
        jpm_universoOpt = new javax.swing.JPopupMenu();
        jmi_cambiarMundo = new javax.swing.JMenuItem();
        jpm_menuMundo = new javax.swing.JPopupMenu();
        jmi_modificar = new javax.swing.JMenuItem();
        jmi_eliminar = new javax.swing.JMenuItem();
        jpm_menuCriaturas = new javax.swing.JPopupMenu();
        jmi_editCriaturas = new javax.swing.JMenuItem();
        jmi_deleteCriaturas = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_mundoDisco = new javax.swing.JList<>();
        bt_addCArbol = new javax.swing.JButton();
        bt_addMArbol = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_criaturas = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_universo = new javax.swing.JTree();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        bt_adminMundo = new javax.swing.JButton();
        bt_admincriaturas = new javax.swing.JButton();

        bt_eliminar.setText("Eliminar");
        bt_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_eliminarMouseClicked(evt);
            }
        });

        jLabel4.setText("Nombre Tortuga:");

        jLabel5.setText("Peso Tortuga:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_addMundo.setText("Agregar");
        bt_addMundo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_addMundoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_nombreTortuga, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(tf_pesoT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_addMundo)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tf_nombreTortuga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_pesoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_addMundo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jl_Tortugas.setModel(new DefaultListModel());
        jl_Tortugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_TortugasMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jl_Tortugas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_eliminar)
                        .addGap(30, 30, 30)))
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_eliminar)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jd_mundoDiscoLayout = new javax.swing.GroupLayout(jd_mundoDisco.getContentPane());
        jd_mundoDisco.getContentPane().setLayout(jd_mundoDiscoLayout);
        jd_mundoDiscoLayout.setHorizontalGroup(
            jd_mundoDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_mundoDiscoLayout.setVerticalGroup(
            jd_mundoDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bt_addCriatura.setText("Agregar");
        bt_addCriatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_addCriaturaMouseClicked(evt);
            }
        });

        bt_eliminarCriaturas.setText("Eliminar");
        bt_eliminarCriaturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_eliminarCriaturasMouseClicked(evt);
            }
        });

        jLabel6.setText("Nombre Raza:");

        jLabel7.setText("Número Energía:");

        jLabel8.setText("Máximo de Años:");

        jLabel9.setText("Nombre Región:");

        jLabel10.setText("Cantidad de Especies:");

        jLabel11.setText("Peso:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addGap(23, 23, 23)
                .addComponent(jLabel10)
                .addGap(23, 23, 23)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_nombreRaza, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(tf_energia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_anios, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cantidadEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_pesoCriatura, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nombreRegion))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tf_nombreRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_energia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tf_anios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tf_nombreRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_cantidadEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tf_pesoCriatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jl_criaturasAdd.setModel(new DefaultListModel());
        jl_criaturasAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_criaturasAddMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jl_criaturasAdd);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_addCriatura)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_eliminarCriaturas)
                        .addGap(85, 85, 85))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_eliminarCriaturas)
                    .addComponent(bt_addCriatura))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_criaturasLayout = new javax.swing.GroupLayout(jd_criaturas.getContentPane());
        jd_criaturas.getContentPane().setLayout(jd_criaturasLayout);
        jd_criaturasLayout.setHorizontalGroup(
            jd_criaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_criaturasLayout.setVerticalGroup(
            jd_criaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jmi_cambiarMundo.setText("Cambiar Nombre Mundo");
        jpm_universoOpt.add(jmi_cambiarMundo);

        jmi_modificar.setText("Modificar Mundo");
        jmi_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificarActionPerformed(evt);
            }
        });
        jpm_menuMundo.add(jmi_modificar);

        jmi_eliminar.setText("Eliminar Mundo");
        jmi_eliminar.setToolTipText("");
        jmi_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarActionPerformed(evt);
            }
        });
        jpm_menuMundo.add(jmi_eliminar);

        jmi_editCriaturas.setText("Modificar Criaturas");
        jpm_menuCriaturas.add(jmi_editCriaturas);

        jmi_deleteCriaturas.setText("Eliminar");
        jmi_deleteCriaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_deleteCriaturasActionPerformed(evt);
            }
        });
        jpm_menuCriaturas.add(jmi_deleteCriaturas);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_mundoDisco.setModel(new DefaultListModel());
        jl_mundoDisco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_mundoDiscoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jl_mundoDisco);

        bt_addCArbol.setText("Agregar Arbol");
        bt_addCArbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_addCArbolMouseClicked(evt);
            }
        });

        bt_addMArbol.setText("Agregar Arbol");
        bt_addMArbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_addMArbolMouseClicked(evt);
            }
        });

        jl_criaturas.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jl_criaturas);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Universo");
        jt_universo.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_universo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_universoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jt_universo);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Mundo Disco");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Criaturas");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("Universo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_addMArbol))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(bt_addCArbol)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(85, 85, 85)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_addMArbol)
                            .addComponent(bt_addCArbol))))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jToolBar1.setRollover(true);

        bt_adminMundo.setText("Mundo");
        bt_adminMundo.setFocusable(false);
        bt_adminMundo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_adminMundo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_adminMundo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_adminMundoMouseClicked(evt);
            }
        });
        jToolBar1.add(bt_adminMundo);

        bt_admincriaturas.setText("Criaturas");
        bt_admincriaturas.setFocusable(false);
        bt_admincriaturas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_admincriaturas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_admincriaturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_admincriaturasMouseClicked(evt);
            }
        });
        jToolBar1.add(bt_admincriaturas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_addMundoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addMundoMouseClicked
        
        String nombre;
        int peso;
        try{
            nombre=tf_nombreTortuga.getText();
            peso=Integer.parseInt(tf_pesoT.getText());
            
            if(nombre.equals("") || peso<=0/*|| tf_pesoT.getText().equals("")*/){
                JOptionPane.showMessageDialog(jd_mundoDisco,"Ingrese todos los campos.");
            }else{
                
                MundoDisco m = new MundoDisco(nombre, peso);
                m.setListaCriaturas(new ArrayList<Criaturas>());
                
                DefaultListModel modeloListaMD = (DefaultListModel)jl_Tortugas.getModel();
                DefaultListModel modeloListaM = (DefaultListModel)jl_mundoDisco.getModel();
                
                modeloListaMD.addElement(m);
                modeloListaM.addElement(m);
                jl_Tortugas.getModel();
                jl_mundoDisco.getModel();
                
                JOptionPane.showMessageDialog(jd_mundoDisco, "Mundo Agregado");
                tf_nombreTortuga.setText("");
                tf_pesoT.setText("");
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(
                    jd_mundoDisco,"Error, no se guardaron los datos",
                    "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_addMundoMouseClicked

    private void bt_adminMundoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_adminMundoMouseClicked
        jd_mundoDisco.pack();
        jd_mundoDisco.setModal(true);
        jd_mundoDisco.setLocationRelativeTo(this);
        jd_mundoDisco.setVisible(true);
    }//GEN-LAST:event_bt_adminMundoMouseClicked

    private void bt_addCriaturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addCriaturaMouseClicked
        String raza;
        int energia;
        int ano;
        String region;
        int cantidad_especies;
        int peso;
        
        try{
            raza=tf_nombreRaza.getText();
            energia=Integer.parseInt(tf_energia.getText());
            ano=Integer.parseInt(tf_anios.getText());
            region=tf_nombreRegion.getText();
            cantidad_especies=Integer.parseInt(tf_cantidadEsp.getText());
            peso=Integer.parseInt(tf_pesoCriatura.getText());
            
            if(raza.equals("")||region.equals("")){
                JOptionPane.showMessageDialog(jd_mundoDisco,"Ingrese todos los campos.");
            }else{
                Criaturas c = new Criaturas(raza,energia,ano,region,cantidad_especies,peso);
                c.setObjetos(new ArrayList<String>());
                
                DefaultListModel modeloLC= (DefaultListModel)jl_criaturasAdd.getModel();
                DefaultListModel modeloL = (DefaultListModel)jl_criaturas.getModel();
                
                modeloLC.addElement(c);
                modeloL.addElement(c);
                jl_criaturasAdd.getModel();
                jl_criaturas.getModel();
                
                tf_nombreRaza.setText("");
                tf_energia.setText("");
                tf_anios.setText("");
                tf_nombreRegion.setText("");
                tf_cantidadEsp.setText("");
                tf_pesoCriatura.setText("");
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(
                    jd_mundoDisco,"Error, no se guardaron los datos","Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_addCriaturaMouseClicked

    private void bt_admincriaturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_admincriaturasMouseClicked
        jd_criaturas.pack();
        jd_criaturas.setModal(true);
        jd_criaturas.setLocationRelativeTo(this);
        jd_criaturas.setVisible(true);
    }//GEN-LAST:event_bt_admincriaturasMouseClicked

    private void bt_addMArbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addMArbolMouseClicked
        
        if(jl_mundoDisco.getSelectedIndex()>=0){
            
            DefaultTreeModel modeloArbol 
                    = (DefaultTreeModel)jt_universo.getModel();
            
            DefaultMutableTreeNode raiz=
                    (DefaultMutableTreeNode)modeloArbol.getRoot();
            
            DefaultListModel modeloLista 
                    = (DefaultListModel)jl_mundoDisco.getModel();
            
            String nombre;
            int peso;
            
            nombre=((MundoDisco)modeloLista.get(
                    jl_mundoDisco.getSelectedIndex())).getNombre();
            
            peso=((MundoDisco)modeloLista.get(
                    jl_mundoDisco.getSelectedIndex())).getPeso();
            
            int centinela=-1;
            
            for (int i = 0; i < raiz.getChildCount(); i++) {
                
                if(raiz.getChildAt(i).toString().equals(nombre)){
                    
                    DefaultMutableTreeNode p
                            = new DefaultMutableTreeNode(
                                    new MundoDisco(nombre,peso));
                    
                    ((DefaultMutableTreeNode)raiz.getChildAt(i)).add(p);
                    centinela = 1;
                }//final if
            }
            if(centinela==-1){
                DefaultMutableTreeNode n =
                        new DefaultMutableTreeNode(nombre);
                /*DefaultMutableTreeNode p
                        = new DefaultMutableTreeNode(new MundoDisco(nombre,peso));
                n.add(p);*/
                raiz.add(n);
            }
            System.out.println("Funciona");
            modeloArbol.reload();
            
            
        }else{
            JOptionPane.showMessageDialog(
                    this,"Seleccione un Mundo Disco","Error",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bt_addMArbolMouseClicked

    private void bt_addCArbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addCArbolMouseClicked
        if(jl_criaturas.getSelectedIndex()>=0){
            
            DefaultTreeModel modeloArbol 
                    = (DefaultTreeModel)jt_universo.getModel();
            
            DefaultMutableTreeNode raiz=
                    (DefaultMutableTreeNode)modeloArbol.getRoot();
            
            DefaultListModel modeloLista 
                    = (DefaultListModel)jl_criaturas.getModel();
            
            String nombre;
            int peso;
            
            nombre=((Criaturas)modeloLista.get(
                    jl_criaturas.getSelectedIndex())).getRaza();
            
            peso=((Criaturas)modeloLista.get(
                    jl_criaturas.getSelectedIndex())).getPeso();
            
            int centinela=-1;
            
            for (int i = 0; i < raiz.getChildCount(); i++) {
                
                if(raiz.getChildAt(i).toString().equals(nombre)){
                    
                    DefaultMutableTreeNode p
                            = new DefaultMutableTreeNode(
                                    new Criaturas());
                    
                    ((DefaultMutableTreeNode)raiz.getChildAt(i)).add(p);
                    centinela = 1;
                }//final if
            }
            if(centinela==-1){
                DefaultMutableTreeNode n =
                        new DefaultMutableTreeNode(nombre);
                DefaultMutableTreeNode p
                        = new DefaultMutableTreeNode(new Criaturas());
                n.add(p);
                raiz.add(n);
            }
            System.out.println("Funciona");
            modeloArbol.reload();
            
            
        }else{
            JOptionPane.showMessageDialog(
                    this,"Seleccione un Mundo Disco","Error",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bt_addCArbolMouseClicked

    private void jt_universoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_universoMouseClicked
        
        if(evt.isMetaDown()){
            int row = jt_universo.getClosestRowForLocation(
                    evt.getX(), evt.getY());
            jt_universo.setSelectionRow(row);
            
            Object v1
                    = jt_universo.getSelectionPath().getLastPathComponent();
            
            nodo_seleccionado = (DefaultMutableTreeNode)v1;
            
            if(nodo_seleccionado.getUserObject() instanceof MundoDisco){
                
                mundo_seleccionado
                        =(MundoDisco)nodo_seleccionado.getUserObject();
                jpm_universoOpt.show(evt.getComponent(),evt.getX(),evt.getY());
            }
        }
    }//GEN-LAST:event_jt_universoMouseClicked

    private void bt_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eliminarMouseClicked
        
        int index = jl_Tortugas.getSelectedIndex();
        
        if(index>=0 && index<jl_Tortugas.getModel().getSize()){
            DefaultListModel modelo1 = (DefaultListModel)jl_Tortugas.getModel();
            DefaultListModel modelo2 = (DefaultListModel)jl_mundoDisco.getModel();
            
            modelo1.removeElementAt(index);
            modelo2.removeElementAt(index);
        }
    }//GEN-LAST:event_bt_eliminarMouseClicked

    private void jl_TortugasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_TortugasMouseClicked
        int index = jl_Tortugas.getSelectedIndex();
        
        if(evt.isMetaDown() && index>=0){
            jpm_menuMundo.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jl_TortugasMouseClicked

    private void jmi_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarActionPerformed
        int index = jl_Tortugas.getSelectedIndex();
        
        if(index>=0 && index<jl_Tortugas.getModel().getSize()){
            DefaultListModel modelo1 = (DefaultListModel)jl_Tortugas.getModel();
            DefaultListModel modelo2 = (DefaultListModel)jl_mundoDisco.getModel();
            
            modelo1.removeElementAt(index);
            modelo2.removeElementAt(index);
        }
    }//GEN-LAST:event_jmi_eliminarActionPerformed

    private void jmi_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificarActionPerformed
        int index = jl_Tortugas.getSelectedIndex();
        
        DefaultListModel modelo1 = (DefaultListModel)jl_Tortugas.getModel();
        DefaultListModel modelo2 = (DefaultListModel)jl_mundoDisco.getModel();
        
        if(index>=0 && index<jl_Tortugas.getModel().getSize() && index<jl_mundoDisco.getModel().getSize()){
            
            String nombre = JOptionPane.showInputDialog(jd_mundoDisco,"Ingrese el nuevo nombre:");
            
            
            ((MundoDisco)modelo1.get(index)).setNombre(nombre);
            ((MundoDisco)modelo2.get(index)).setNombre(nombre);
            
        }
        jl_Tortugas.setModel(modelo1);
            jl_mundoDisco.setModel(modelo2);
    }//GEN-LAST:event_jmi_modificarActionPerformed

    private void jl_mundoDiscoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_mundoDiscoMouseClicked
        
    }//GEN-LAST:event_jl_mundoDiscoMouseClicked

    private void jl_criaturasAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_criaturasAddMouseClicked
        int index = jl_criaturasAdd.getSelectedIndex();
        
        if(evt.isMetaDown() && index>=0){
            jpm_menuCriaturas.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jl_criaturasAddMouseClicked

    private void bt_eliminarCriaturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eliminarCriaturasMouseClicked
        int index = jl_criaturasAdd.getSelectedIndex();
        
        if(index>=0 && index<jl_criaturasAdd.getModel().getSize()){
            DefaultListModel modelo1 = (DefaultListModel)jl_criaturasAdd.getModel();
            DefaultListModel modelo2 = (DefaultListModel)jl_criaturas.getModel();
            
            modelo1.removeElementAt(index);
            modelo2.removeElementAt(index);
        }
    }//GEN-LAST:event_bt_eliminarCriaturasMouseClicked

    private void jmi_deleteCriaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_deleteCriaturasActionPerformed
        int index = jl_criaturasAdd.getSelectedIndex();
        
        if(index>=0 && index<jl_criaturasAdd.getModel().getSize()){
            DefaultListModel modelo1 = (DefaultListModel)jl_criaturasAdd.getModel();
            DefaultListModel modelo2 = (DefaultListModel)jl_criaturas.getModel();
            
            modelo1.removeElementAt(index);
            modelo2.removeElementAt(index);
        }
    }//GEN-LAST:event_jmi_deleteCriaturasActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addCArbol;
    private javax.swing.JButton bt_addCriatura;
    private javax.swing.JButton bt_addMArbol;
    private javax.swing.JButton bt_addMundo;
    private javax.swing.JButton bt_adminMundo;
    private javax.swing.JButton bt_admincriaturas;
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JButton bt_eliminarCriaturas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JDialog jd_criaturas;
    private javax.swing.JDialog jd_mundoDisco;
    private javax.swing.JList<String> jl_Tortugas;
    private javax.swing.JList<String> jl_criaturas;
    private javax.swing.JList<String> jl_criaturasAdd;
    private javax.swing.JList<String> jl_mundoDisco;
    private javax.swing.JMenuItem jmi_cambiarMundo;
    private javax.swing.JMenuItem jmi_deleteCriaturas;
    private javax.swing.JMenuItem jmi_editCriaturas;
    private javax.swing.JMenuItem jmi_eliminar;
    private javax.swing.JMenuItem jmi_modificar;
    private javax.swing.JPopupMenu jpm_menuCriaturas;
    private javax.swing.JPopupMenu jpm_menuMundo;
    private javax.swing.JPopupMenu jpm_universoOpt;
    private javax.swing.JTree jt_universo;
    private javax.swing.JTextField tf_anios;
    private javax.swing.JTextField tf_cantidadEsp;
    private javax.swing.JTextField tf_energia;
    private javax.swing.JTextField tf_nombreRaza;
    private javax.swing.JTextField tf_nombreRegion;
    private javax.swing.JTextField tf_nombreTortuga;
    private javax.swing.JTextField tf_pesoCriatura;
    private javax.swing.JTextField tf_pesoT;
    // End of variables declaration//GEN-END:variables

    ArrayList<MundoDisco> mundoLista = new ArrayList();
    ArrayList<Criaturas> criaturasLista = new ArrayList();
    DefaultMutableTreeNode nodo_seleccionado;
    MundoDisco mundo_seleccionado;
    Criaturas criatura_seleccionada;
    
}
