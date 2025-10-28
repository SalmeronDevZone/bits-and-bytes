namespace BancoTierraMedia
{
    partial class Prestamos
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Prestamos));
            this.saludo = new System.Windows.Forms.Label();
            this.btnVolver = new System.Windows.Forms.Button();
            this.btnConfirmarSolicitud = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.DatosPersonales = new System.Windows.Forms.Panel();
            this.lugares = new System.Windows.Forms.ComboBox();
            this.razas = new System.Windows.Forms.ComboBox();
            this.label4 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.FatosPrestamo = new System.Windows.Forms.Panel();
            this.monto = new System.Windows.Forms.TextBox();
            this.cuotas = new System.Windows.Forms.ComboBox();
            this.label6 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.errorProvider1 = new System.Windows.Forms.ErrorProvider(this.components);
            this.DatosPersonales.SuspendLayout();
            this.FatosPrestamo.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.errorProvider1)).BeginInit();
            this.SuspendLayout();
            // 
            // saludo
            // 
            this.saludo.AutoSize = true;
            this.saludo.Font = new System.Drawing.Font("Microsoft Sans Serif", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.saludo.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(0)))), ((int)(((byte)(0)))));
            this.saludo.Location = new System.Drawing.Point(51, 57);
            this.saludo.Name = "saludo";
            this.saludo.Size = new System.Drawing.Size(158, 29);
            this.saludo.TabIndex = 0;
            this.saludo.Text = "Bienvenido, ";
            // 
            // btnVolver
            // 
            this.btnVolver.BackColor = System.Drawing.Color.OrangeRed;
            this.btnVolver.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnVolver.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.btnVolver.Location = new System.Drawing.Point(687, 407);
            this.btnVolver.Name = "btnVolver";
            this.btnVolver.Size = new System.Drawing.Size(105, 42);
            this.btnVolver.TabIndex = 1;
            this.btnVolver.Text = "vovler";
            this.btnVolver.UseVisualStyleBackColor = false;
            this.btnVolver.Click += new System.EventHandler(this.btnVolver_Click);
            // 
            // btnConfirmarSolicitud
            // 
            this.btnConfirmarSolicitud.BackColor = System.Drawing.Color.OrangeRed;
            this.btnConfirmarSolicitud.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnConfirmarSolicitud.ForeColor = System.Drawing.SystemColors.ButtonFace;
            this.btnConfirmarSolicitud.Location = new System.Drawing.Point(311, 327);
            this.btnConfirmarSolicitud.Name = "btnConfirmarSolicitud";
            this.btnConfirmarSolicitud.Size = new System.Drawing.Size(158, 57);
            this.btnConfirmarSolicitud.TabIndex = 2;
            this.btnConfirmarSolicitud.Text = "Confirmar Solicitud";
            this.btnConfirmarSolicitud.UseVisualStyleBackColor = false;
            this.btnConfirmarSolicitud.Click += new System.EventHandler(this.btnConfirmarSolicitud_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.label1.Location = new System.Drawing.Point(103, 159);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(172, 24);
            this.label1.TabIndex = 3;
            this.label1.Text = "Datos Personales";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.label2.Location = new System.Drawing.Point(490, 159);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(201, 24);
            this.label2.TabIndex = 4;
            this.label2.Text = "Detalle del préstamo";
            // 
            // DatosPersonales
            // 
            this.DatosPersonales.BackColor = System.Drawing.Color.DarkSalmon;
            this.DatosPersonales.Controls.Add(this.lugares);
            this.DatosPersonales.Controls.Add(this.razas);
            this.DatosPersonales.Controls.Add(this.label4);
            this.DatosPersonales.Controls.Add(this.label3);
            this.DatosPersonales.Location = new System.Drawing.Point(56, 199);
            this.DatosPersonales.Name = "DatosPersonales";
            this.DatosPersonales.Size = new System.Drawing.Size(346, 100);
            this.DatosPersonales.TabIndex = 5;
            // 
            // lugares
            // 
            this.lugares.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.lugares.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.lugares.FormattingEnabled = true;
            this.lugares.Location = new System.Drawing.Point(166, 61);
            this.lugares.Name = "lugares";
            this.lugares.Size = new System.Drawing.Size(157, 21);
            this.lugares.TabIndex = 11;
            // 
            // razas
            // 
            this.razas.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.razas.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.razas.FormattingEnabled = true;
            this.razas.Location = new System.Drawing.Point(166, 19);
            this.razas.Name = "razas";
            this.razas.Size = new System.Drawing.Size(157, 21);
            this.razas.TabIndex = 10;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(0)))), ((int)(((byte)(0)))));
            this.label4.Location = new System.Drawing.Point(20, 64);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(128, 18);
            this.label4.TabIndex = 8;
            this.label4.Text = "Lugar de Origen";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(0)))), ((int)(((byte)(0)))));
            this.label3.Location = new System.Drawing.Point(19, 22);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(47, 18);
            this.label3.TabIndex = 7;
            this.label3.Text = "Raza";
            // 
            // FatosPrestamo
            // 
            this.FatosPrestamo.BackColor = System.Drawing.Color.DarkSalmon;
            this.FatosPrestamo.Controls.Add(this.monto);
            this.FatosPrestamo.Controls.Add(this.cuotas);
            this.FatosPrestamo.Controls.Add(this.label6);
            this.FatosPrestamo.Controls.Add(this.label5);
            this.FatosPrestamo.Location = new System.Drawing.Point(421, 199);
            this.FatosPrestamo.Name = "FatosPrestamo";
            this.FatosPrestamo.Size = new System.Drawing.Size(321, 100);
            this.FatosPrestamo.TabIndex = 6;
            // 
            // monto
            // 
            this.monto.Location = new System.Drawing.Point(187, 20);
            this.monto.Name = "monto";
            this.monto.Size = new System.Drawing.Size(121, 20);
            this.monto.TabIndex = 13;
            // 
            // cuotas
            // 
            this.cuotas.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cuotas.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.cuotas.FormattingEnabled = true;
            this.cuotas.Location = new System.Drawing.Point(187, 62);
            this.cuotas.Name = "cuotas";
            this.cuotas.Size = new System.Drawing.Size(121, 21);
            this.cuotas.TabIndex = 12;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label6.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(0)))), ((int)(((byte)(0)))));
            this.label6.Location = new System.Drawing.Point(13, 65);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(62, 18);
            this.label6.TabIndex = 9;
            this.label6.Text = "Cuotas";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(0)))), ((int)(((byte)(0)))));
            this.label5.Location = new System.Drawing.Point(13, 22);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(159, 18);
            this.label5.TabIndex = 8;
            this.label5.Text = "Monto del préstamo";
            // 
            // errorProvider1
            // 
            this.errorProvider1.ContainerControl = this;
            // 
            // Prestamos
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Peru;
            this.ClientSize = new System.Drawing.Size(804, 461);
            this.Controls.Add(this.FatosPrestamo);
            this.Controls.Add(this.DatosPersonales);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.btnConfirmarSolicitud);
            this.Controls.Add(this.btnVolver);
            this.Controls.Add(this.saludo);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MaximizeBox = false;
            this.Name = "Prestamos";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "PRestamos";
            this.Load += new System.EventHandler(this.Prestamos_Load);
            this.DatosPersonales.ResumeLayout(false);
            this.DatosPersonales.PerformLayout();
            this.FatosPrestamo.ResumeLayout(false);
            this.FatosPrestamo.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.errorProvider1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label saludo;
        private System.Windows.Forms.Button btnVolver;
        private System.Windows.Forms.Button btnConfirmarSolicitud;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Panel DatosPersonales;
        private System.Windows.Forms.Panel FatosPrestamo;
        private System.Windows.Forms.ComboBox lugares;
        private System.Windows.Forms.ComboBox razas;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox monto;
        private System.Windows.Forms.ComboBox cuotas;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.ErrorProvider errorProvider1;
    }
}