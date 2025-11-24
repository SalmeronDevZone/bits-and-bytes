using ProcesoCRUD.Datos;
using ProcesoCRUD.Entidades;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ProcesoCRUD.Presentacion
{
    public partial class Frm_productos : Form
    {
        public Frm_productos()
        {
            InitializeComponent();
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void label7_Click(object sender, EventArgs e)
        {

        }

        #region "Mis variables"

        int nEstadoguarda = 0;
        int vCodigo_pr = 0;

        #endregion



        #region "Mis Metodos"

        private void LimpiaTexto()
        {
            txtDescipcion_pr.Text = "";
            txtMarca_pr.Text = "";
            cbStockActual.Text = "0.00";
            cbCategoria.Text = "";
            cbMedida.Text = "";
        }

        private void EstadoTexto(bool lEstado)
        {
            txtDescipcion_pr.Enabled = lEstado;
            txtMarca_pr.Enabled = lEstado;
            cbMedida.Enabled = lEstado;
            cbCategoria.Enabled = lEstado;
            cbStockActual.Enabled = lEstado;
        }

        private void EstadoBotones(bool lEstado)
        {
            btnCancelar.Visible = !lEstado;
            btnGuardar.Visible = !lEstado;

            btnNuevo.Enabled = lEstado;
            btnActualizar.Enabled = lEstado;
            btnEliminar.Enabled = lEstado;
            btnReporte.Enabled = lEstado;
            btnSalir.Enabled = lEstado;
            btnBuscar.Enabled = lEstado;
            txtBuscar.Enabled = lEstado;
            dgvListado_pr.Enabled = lEstado;
        }

        private void Cargar_Medidas()
        {
            D_Productos Datos = new D_Productos();
            cbMedida.DataSource = Datos.Listado_me();
            cbMedida.ValueMember = "codigo_me";
            cbMedida.DisplayMember = "descripcion_me";
        }

        private void Cargar_Categorias()
        {
            D_Productos Datos = new D_Productos();
            cbCategoria.DataSource = Datos.Listado_ca();
            cbCategoria.ValueMember = "codigo_ca";
            cbCategoria.DisplayMember = "descripcion_ca";
        }

        private void Formato_pr()
        {
            dgvListado_pr.Columns[0].Width = 100;
            dgvListado_pr.Columns[0].HeaderText = "Código PR";

            dgvListado_pr.Columns[1].Width = 210;
            dgvListado_pr.Columns[1].HeaderText = "Producto";

            dgvListado_pr.Columns[2].Width = 110;
            dgvListado_pr.Columns[2].HeaderText = "Marca";

            dgvListado_pr.Columns[3].Width = 110;
            dgvListado_pr.Columns[3].HeaderText = "Medida";

            dgvListado_pr.Columns[4].Width = 110;
            dgvListado_pr.Columns[4].HeaderText = "Categoría";

            dgvListado_pr.Columns[5].Width = 120;
            dgvListado_pr.Columns[5].HeaderText = "Stock Disponible";

            dgvListado_pr.Columns[6].Visible = false;
            dgvListado_pr.Columns[7].Visible = false;
        }

        private void Listado_pr(string cTexto)
        {
            D_Productos Datos = new D_Productos();
            dgvListado_pr.DataSource = Datos.Listado_pr(cTexto);
            this.Formato_pr();
        }

        private void Selecciona_Item_pr()
        {
            if (string.IsNullOrEmpty(Convert.ToString(dgvListado_pr.CurrentRow.Cells["codigo_pr"].Value)))
            {
                MessageBox.Show("No se tiene informacion para visualizar", "Aviso del sistema",
                    MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
            else
            {

                this.vCodigo_pr = (Convert.ToInt32(dgvListado_pr.CurrentRow.Cells["codigo_pr"].Value));
                txtDescipcion_pr.Text = (Convert.ToString(dgvListado_pr.CurrentRow.Cells["descripcion_pr"].Value));
                txtMarca_pr.Text = (Convert.ToString(dgvListado_pr.CurrentRow.Cells["marca_pr"].Value));
                cbMedida.Text = (Convert.ToString(dgvListado_pr.CurrentRow.Cells["descripcion_me"].Value));
                cbCategoria.Text = (Convert.ToString(dgvListado_pr.CurrentRow.Cells["descripcion_ca"].Value));
                cbStockActual.Text =Convert.ToString( dgvListado_pr.CurrentRow.Cells["stock_actual"].Value);

            }

        }

        #endregion

        private void btnNuevo_Click(object sender, EventArgs e)
        {
            this.nEstadoguarda = 1; // El 1 significa accion nuevo registro.
            this.vCodigo_pr = 0;
            this.LimpiaTexto();
            this.EstadoTexto(true);
            this.EstadoBotones(false);
            txtDescipcion_pr.Select();
        }

        private void Frm_productos_Load(object sender, EventArgs e)
        {
            this.Cargar_Medidas();
            this.Cargar_Categorias();
            this.Listado_pr("%");
        }

        private void btnCancelar_Click(object sender, EventArgs e)
        {
            this.LimpiaTexto();
            this.EstadoTexto(false);
            this.EstadoBotones(true);
        }

        private void btnGuardar_Click(object sender, EventArgs e)
        {
            if (txtDescipcion_pr.Text == string.Empty || 
                txtMarca_pr.Text == string.Empty || 
                cbMedida.Text == string.Empty || 
                cbCategoria.Text == string.Empty ||
                cbStockActual.Text == string.Empty) //Validar Datos Correctos
            {
                MessageBox.Show("Ingresa todos los campos obligatorios *", ("Aviso de sistema."),
                    MessageBoxButtons.OK, MessageBoxIcon.Error);
            } 
            else //Proceso guardar la información
            {
                string Rpta = "";
                E_Productos oPro = new E_Productos();

                oPro.Codigo_pr = this.vCodigo_pr;
                oPro.Descripcion_pr = txtDescipcion_pr.Text;
                oPro.Marca_pr = txtMarca_pr.Text;
                oPro.Codigo_me = (Convert.ToInt32(cbMedida.SelectedValue));
                oPro.Codigo_ca = (Convert.ToInt32(cbMedida.SelectedValue));
                oPro.Stock_actual = Convert.ToDecimal(cbStockActual.Text);

                D_Productos Datos = new D_Productos();
                Rpta = Datos.Guardar_pr(this.nEstadoguarda,oPro);

                if(Rpta == "OK")
                {
                    this.Listado_pr("%");
                    MessageBox.Show("Los datos han sido guardados correctamente", "Aviso del sistema",
                        MessageBoxButtons.OK, MessageBoxIcon.Information);

                    this.vCodigo_pr = 0;
                    this.LimpiaTexto();
                    this.EstadoTexto(false);
                    this.EstadoBotones(true);
                }
            }
        }

        private void dgvListado_pr_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            this.Selecciona_Item_pr();
        }

        private void btnActualizar_Click(object sender, EventArgs e)
        {
            this.nEstadoguarda = 2; //2 = actualiza registro
            this.EstadoTexto(true);
            this .EstadoBotones(false);
            txtDescipcion_pr.Select();

        }

        private void btnBuscar_Click(object sender, EventArgs e)
        {
            this.Listado_pr(txtBuscar.Text);
        }

        private void btnEliminar_Click(object sender, EventArgs e)
        {
            if (dgvListado_pr.Rows.Count<=0 || 
                string.IsNullOrEmpty(Convert.ToString(dgvListado_pr.CurrentRow.Cells["codigo_pr"].Value)))
            {
                MessageBox.Show("No hay información para eliminar.",
                    "Aviso del sistema",
                    MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
            else
            {
                string Rpta = "";
                D_Productos Datos = new D_Productos();
                Rpta = Datos.Activo_pr(vCodigo_pr, false);
                if(Rpta == "OK")
                {
                    this.Listado_pr("%");
                    this.LimpiaTexto();
                    vCodigo_pr = 0;

                    MessageBox.Show("El registro seleccionado ha sido eliminado",
                        "Aviso del sistema",
                        MessageBoxButtons.OK,
                        MessageBoxIcon.Exclamation);
                }
            }

        }


        private void btnSalir_Click(object sender, EventArgs e)
        {
            this.Close();
        }

    }
}   
